FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI_append = "file://0001-avahi-daemon-disallow-other-stacks-yes.patch "
