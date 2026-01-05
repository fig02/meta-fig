FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://bt.cfg"
SRC_URI += "file://display.cfg"
SRC_URI += "file://snd.cfg"
SRC_URI += "file://nfs.cfg"
SRC_URI += "file://input.cfg"
SRC_URI += "file://wifi.cfg"
SRC_URI += "file://usb.cfg"
SRC_URI += "file://kvm.cfg"
SRC_URI += "file://fs.cfg"

KERNEL_CONFIG_FRAGMENTS += "${WORKDIR}/bt.cfg"