DESCRIPTION = "Python library used to interact with snmp."
HOMEPAGE = "http://pysnmp.sourceforge.net/"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae098273b2cf8b4af164ac20e32bddf7"
DEPENDS = "python python-pyasn1 net-snmp"

SRC_URI = "https://pypi.python.org/packages/source/p/pysnmp/pysnmp-${PV}.tar.gz"
SRC_URI[md5sum] = "1f75d3e392a050e84348904fc1be3212"
SRC_URI[sha256sum] = "c46e65d99a604f690b3d5800e2f6e26e1ed9a3c7f7e17e7b4b4d897150f7077f"

S = "${WORKDIR}/pysnmp-${PV}"

inherit setuptools

RDEPENDS_${PN} += "python-lang python-shell python-pyasn1"
