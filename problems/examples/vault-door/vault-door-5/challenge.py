from base64 import b64encode
from hacksport.problem import Challenge, File
import logging

logger = logging.getLogger('challenge')

class Problem(Challenge):
    files = [File("VaultDoor5.java")]
    b = [0] * 32

    def initialize(self):
        url_encoded = ''.join(['%{:2x}'.format(ord(c)) for c in self.flag])
        base64_encoded = b64encode(url_encoded.encode('ascii')).decode('ascii')
        self.__class__.b = base64_encoded

    def setup(self):
        pass
