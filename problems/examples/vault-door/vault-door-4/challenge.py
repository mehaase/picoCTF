from hacksport.problem import Challenge, File
import logging

class Problem(Challenge):
    files = [File("VaultDoor4.java")]
    b = [0] * 32

    def initialize(self):
        for i in range(8):
            self.__class__.b[i] = '{:<4d}'.format(ord(self.flag[i]))
        for i in range(8,16):
            self.__class__.b[i] = '0x{:<2x}'.format(ord(self.flag[i]))
        for i in range(16,24):
            self.__class__.b[i] = '0{:<3o}'.format(ord(self.flag[i]))
        for i in range(24,32):
            self.__class__.b[i] = "'{}' ".format(self.flag[i])

    def setup(self):
        pass
