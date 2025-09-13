package org.firstinspires.ftc.teamcode

import com.bylazar.configurables.annotations.Configurable
import com.bylazar.telemetry.PanelsTelemetry
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp

@Configurable
@TeleOp(name="Configurables Test")
class ConfigurablesTest : OpMode() {
    companion object{
        @JvmField var test = "lazar"
    }
    val panelsTelemetry = PanelsTelemetry.telemetry
    override fun init() {

    }

    override fun loop() {
        panelsTelemetry.debug("Data: $test")
        panelsTelemetry.update(telemetry)
    }
}