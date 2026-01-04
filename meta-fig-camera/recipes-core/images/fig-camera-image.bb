SUMMARY = "fig-camera Image"
DESCRIPTION = "Firmware for camera device"
LICENSE = "MIT"

inherit core-image 

IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_LINGUAS = "en-us"

# camera services via packagegroup
IMAGE_INSTALL:append = " packagegroup-camera"
