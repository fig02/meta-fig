SUMMARY = "fig-camera Image"
DESCRIPTION = "Firmware for camera device"
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += "ssh-server-dropbear"

IMAGE_INSTALL += "\
    packagegroup-core-boot \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

# camera services via packagegroup
IMAGE_INSTALL:append = " packagegroup-camera"
