package com.xt.endo.sample

import com.xt.endo.EDOExporter
import com.xt.endo.EDOPackage

/**
 * Created by cuiminghui on 2018/7/17.
 */
class SamplePackage : EDOPackage() {

    private val exporter = EDOExporter.sharedExporter

    override fun install() {
        super.install()
        installPropertyTestObject()
    }

    private fun installPropertyTestObject() {
        val clazz = PropertyTestObject::class.java
        exporter.exportClass(clazz, "PropertyTestObject")
        exporter.exportProperty(clazz, "intValue")
        exporter.exportProperty(clazz, "floatValue")
        exporter.exportProperty(clazz, "doubleValue")
        exporter.exportProperty(clazz, "boolValue")
        exporter.exportProperty(clazz, "rectValue")
        exporter.exportProperty(clazz, "sizeValue")
        exporter.exportProperty(clazz, "affineTransformValue")
        exporter.exportProperty(clazz, "stringValue")
        exporter.exportProperty(clazz, "arrayValue")
        exporter.exportProperty(clazz, "dictValue")
        exporter.exportProperty(clazz, "nilValue")
        exporter.exportProperty(clazz, "readonlyIntValue")
    }

}