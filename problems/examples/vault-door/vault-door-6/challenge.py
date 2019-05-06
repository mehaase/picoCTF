from hacksport.problem import Challenge, File
import logging

logger = logging.getLogger('challenge')

class Problem(Challenge):
    files = [File("VaultDoor6.java")]
    b = [0] * 32

    def initialize(self):
        for i in range(0,32):
            self.__class__.b[i] = '0x{:<2x}'.format(ord(self.flag[i]) ^ 0x55)

    def setup(self):
        pass
