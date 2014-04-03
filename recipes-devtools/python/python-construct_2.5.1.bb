DESCRIPTION = "Python declarative parser for binary data"
HOMEPAGE = "http://construct.readthedocs.org/en/latest/"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f511459d8aaff1dc0bbc45558a61bea7"
DEPENDS = "python python-six"

SRC_URI = "https://pypi.python.org/packages/source/c/construct/construct-${PV}.tar.gz"
SRC_URI[md5sum] = "4881ed2208f6ee226b61e2310f696924"
SRC_URI[sha256sum] = "5ae387cfde856f9ce3b1f4b1fc58750b6dc30994d96bde2517cfe47d10d51323"

S = "${WORKDIR}/construct-${PV}"

inherit setuptools

RDEPENDS_${PN} += "python-lang python-shell python-six python-debugger"
