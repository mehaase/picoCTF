from hacksport.problem import Challenge, File
import logging

logger = logging.getLogger('challenge')

class Problem(Challenge):
    files = [File("VaultDoor8.java")]
    b = [''] * 4

    def initialize(self):
        def switch_bits(c, p1, p2):
              mask1 = 1 << p1
              mask2 = 1 << p2
              bit1 = c & mask1
              bit2 = c & mask2
              rest = c & ~(mask1 | mask2)
              shift = p2 - p1
              result = (bit1<<shift) | (bit2>>shift) | rest
              return result & 0xFF

        flag_bytes = [ord(c) for c in self.flag]
        for i, flag_byte in enumerate(flag_bytes):
            c = flag_byte
            c = switch_bits(c, 1, 2)
            c = switch_bits(c, 0, 3)
            c = switch_bits(c, 5, 6)
            c = switch_bits(c, 4, 7)
            c = switch_bits(c, 0, 1)
            c = switch_bits(c, 3, 4)
            c = switch_bits(c, 2, 5)
            c = switch_bits(c, 6, 7)
            flag_bytes[i] = c

        hex_fmt = ['0x{:02X}'.format(c) for c in flag_bytes]
        self.__class__.b[0] = ', '.join(hex_fmt[  : 8])
        self.__class__.b[1] = ', '.join(hex_fmt[ 8:16])
        self.__class__.b[2] = ', '.join(hex_fmt[16:24])
        self.__class__.b[3] = ', '.join(hex_fmt[24:  ])

    def setup(self):
        pass
