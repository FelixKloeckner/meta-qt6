LICENSE = "GPL-2.0+ | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    "

inherit qt6-cmake

include recipes-qt/qt6/qt6-git.inc
include recipes-qt/qt6/qt6.inc

DEPENDS = "qtbase qtdeclarative"

SRCREV = "89e34a34a310dc4e8d69867c8c6c74c4c98257b6"
