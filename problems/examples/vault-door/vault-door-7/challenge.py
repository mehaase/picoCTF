from hacksport.problem import Challenge, File
import logging

logger = logging.getLogger('challenge')

class Problem(Challenge):
    files = [File("VaultDoor7.java")]
    b = [0] * 8

    def initialize(self):
        for i in range(8):
            self.__class__.b[i] = ord(self.flag[i*4  ]) << 24 \
                                | ord(self.flag[i*4+1]) << 16 \
                                | ord(self.flag[i*4+2]) << 8 \
                                | ord(self.flag[i*4+3])

    def setup(self):
        pass
