// Autogenerated from Pigeon (v18.0.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.mapbox.maps.mapbox_maps.pigeons

import android.util.Log
import com.mapbox.geojson.Point
import com.mapbox.maps.mapbox_maps.mapping.turf.*
import io.flutter.plugin.common.BasicMessageChannel
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MessageCodec
import io.flutter.plugin.common.StandardMessageCodec
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer

private fun wrapResult(result: Any?): List<Any?> {
  return listOf(result)
}

private fun wrapError(exception: Throwable): List<Any?> {
  if (exception is FlutterError) {
    return listOf(
      exception.code,
      exception.message,
      exception.details
    )
  } else {
    return listOf(
      exception.javaClass.simpleName,
      exception.toString(),
      "Cause: " + exception.cause + ", Stacktrace: " + Log.getStackTraceString(exception)
    )
  }
}

private fun createConnectionError(channelName: String): FlutterError {
  return FlutterError("channel-error", "Unable to establish connection on channel: '$channelName'.", "")
}

/** Orientation of circle when map is pitched. */
enum class CirclePitchAlignment(val raw: Int) {
  /** The circle is aligned to the plane of the map. */
  MAP(0),
  /** The circle is aligned to the plane of the viewport. */
  VIEWPORT(1);

  companion object {
    fun ofRaw(raw: Int): CirclePitchAlignment? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/** Controls the scaling behavior of the circle when the map is pitched. */
enum class CirclePitchScale(val raw: Int) {
  /** Circles are scaled according to their apparent distance to the camera. */
  MAP(0),
  /** Circles are not scaled. */
  VIEWPORT(1);

  companion object {
    fun ofRaw(raw: Int): CirclePitchScale? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/** Controls the frame of reference for `circle-translate`. */
enum class CircleTranslateAnchor(val raw: Int) {
  /** The circle is translated relative to the map. */
  MAP(0),
  /** The circle is translated relative to the viewport. */
  VIEWPORT(1);

  companion object {
    fun ofRaw(raw: Int): CircleTranslateAnchor? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class CircleAnnotation(
  /** The id for annotation */
  val id: String,
  /** The geometry that determines the location/shape of this annotation */
  val geometry: Point,
  /** Sorts features in ascending order based on this value. Features with a higher sort key will appear above features with a lower sort key. */
  val circleSortKey: Double? = null,
  /** Amount to blur the circle. 1 blurs the circle such that only the centerpoint is full opacity. */
  val circleBlur: Double? = null,
  /** The fill color of the circle. */
  val circleColor: Long? = null,
  /** The opacity at which the circle will be drawn. */
  val circleOpacity: Double? = null,
  /** Circle radius. */
  val circleRadius: Double? = null,
  /** The stroke color of the circle. */
  val circleStrokeColor: Long? = null,
  /** The opacity of the circle's stroke. */
  val circleStrokeOpacity: Double? = null,
  /** The width of the circle's stroke. Strokes are placed outside of the `circle-radius`. */
  val circleStrokeWidth: Double? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): CircleAnnotation {
      val id = list[0] as String
      val geometry = PointDecoder.fromList(list[1] as List<Any?>)
      val circleSortKey = list[2] as Double?
      val circleBlur = list[3] as Double?
      val circleColor = list[4].let { if (it is Int) it.toLong() else it as Long? }
      val circleOpacity = list[5] as Double?
      val circleRadius = list[6] as Double?
      val circleStrokeColor = list[7].let { if (it is Int) it.toLong() else it as Long? }
      val circleStrokeOpacity = list[8] as Double?
      val circleStrokeWidth = list[9] as Double?
      return CircleAnnotation(id, geometry, circleSortKey, circleBlur, circleColor, circleOpacity, circleRadius, circleStrokeColor, circleStrokeOpacity, circleStrokeWidth)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      id,
      geometry.toList(),
      circleSortKey,
      circleBlur,
      circleColor,
      circleOpacity,
      circleRadius,
      circleStrokeColor,
      circleStrokeOpacity,
      circleStrokeWidth,
    )
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class CircleAnnotationOptions(
  /** The geometry that determines the location/shape of this annotation */
  val geometry: Point,
  /** Sorts features in ascending order based on this value. Features with a higher sort key will appear above features with a lower sort key. */
  val circleSortKey: Double? = null,
  /** Amount to blur the circle. 1 blurs the circle such that only the centerpoint is full opacity. */
  val circleBlur: Double? = null,
  /** The fill color of the circle. */
  val circleColor: Long? = null,
  /** The opacity at which the circle will be drawn. */
  val circleOpacity: Double? = null,
  /** Circle radius. */
  val circleRadius: Double? = null,
  /** The stroke color of the circle. */
  val circleStrokeColor: Long? = null,
  /** The opacity of the circle's stroke. */
  val circleStrokeOpacity: Double? = null,
  /** The width of the circle's stroke. Strokes are placed outside of the `circle-radius`. */
  val circleStrokeWidth: Double? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): CircleAnnotationOptions {
      val geometry = PointDecoder.fromList(list[0] as List<Any?>)
      val circleSortKey = list[1] as Double?
      val circleBlur = list[2] as Double?
      val circleColor = list[3].let { if (it is Int) it.toLong() else it as Long? }
      val circleOpacity = list[4] as Double?
      val circleRadius = list[5] as Double?
      val circleStrokeColor = list[6].let { if (it is Int) it.toLong() else it as Long? }
      val circleStrokeOpacity = list[7] as Double?
      val circleStrokeWidth = list[8] as Double?
      return CircleAnnotationOptions(geometry, circleSortKey, circleBlur, circleColor, circleOpacity, circleRadius, circleStrokeColor, circleStrokeOpacity, circleStrokeWidth)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      geometry.toList(),
      circleSortKey,
      circleBlur,
      circleColor,
      circleOpacity,
      circleRadius,
      circleStrokeColor,
      circleStrokeOpacity,
      circleStrokeWidth,
    )
  }
}
@Suppress("UNCHECKED_CAST")
private object OnCircleAnnotationClickListenerCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          CircleAnnotation.fromList(it)
        }
      }
      129.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          PointDecoder.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?) {
    when (value) {
      is CircleAnnotation -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      is Point -> {
        stream.write(129)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/** Generated class from Pigeon that represents Flutter messages that can be called from Kotlin. */
@Suppress("UNCHECKED_CAST")
class OnCircleAnnotationClickListener(private val binaryMessenger: BinaryMessenger, private val messageChannelSuffix: String = "") {
  companion object {
    /** The codec used by OnCircleAnnotationClickListener. */
    val codec: MessageCodec<Any?> by lazy {
      OnCircleAnnotationClickListenerCodec
    }
  }
  fun onCircleAnnotationClick(annotationArg: CircleAnnotation, callback: (Result<Unit>) -> Unit) {
    val separatedMessageChannelSuffix = if (messageChannelSuffix.isNotEmpty()) ".$messageChannelSuffix" else ""
    val channelName = "dev.flutter.pigeon.mapbox_maps_flutter.OnCircleAnnotationClickListener.onCircleAnnotationClick$separatedMessageChannelSuffix"
    val channel = BasicMessageChannel<Any?>(binaryMessenger, channelName, codec)
    channel.send(listOf(annotationArg)) {
      if (it is List<*>) {
        if (it.size > 1) {
          callback(Result.failure(FlutterError(it[0] as String, it[1] as String, it[2] as String?)))
        } else {
          callback(Result.success(Unit))
        }
      } else {
        callback(Result.failure(createConnectionError(channelName)))
      }
    }
  }
}
@Suppress("UNCHECKED_CAST")
private object _CircleAnnotationMessengerCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          CircleAnnotation.fromList(it)
        }
      }
      129.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          CircleAnnotation.fromList(it)
        }
      }
      130.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          CircleAnnotationOptions.fromList(it)
        }
      }
      131.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          CircleAnnotationOptions.fromList(it)
        }
      }
      132.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          PointDecoder.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?) {
    when (value) {
      is CircleAnnotation -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      is CircleAnnotation -> {
        stream.write(129)
        writeValue(stream, value.toList())
      }
      is CircleAnnotationOptions -> {
        stream.write(130)
        writeValue(stream, value.toList())
      }
      is CircleAnnotationOptions -> {
        stream.write(131)
        writeValue(stream, value.toList())
      }
      is Point -> {
        stream.write(132)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/** Generated interface from Pigeon that represents a handler of messages from Flutter. */
interface _CircleAnnotationMessenger {
  fun create(managerId: String, annotationOption: CircleAnnotationOptions, callback: (Result<CircleAnnotation>) -> Unit)
  fun createMulti(managerId: String, annotationOptions: List<CircleAnnotationOptions>, callback: (Result<List<CircleAnnotation>>) -> Unit)
  fun update(managerId: String, annotation: CircleAnnotation, callback: (Result<Unit>) -> Unit)
  fun delete(managerId: String, annotation: CircleAnnotation, callback: (Result<Unit>) -> Unit)
  fun deleteAll(managerId: String, callback: (Result<Unit>) -> Unit)
  fun setCircleEmissiveStrength(managerId: String, circleEmissiveStrength: Double, callback: (Result<Unit>) -> Unit)
  fun getCircleEmissiveStrength(managerId: String, callback: (Result<Double?>) -> Unit)
  fun setCirclePitchAlignment(managerId: String, circlePitchAlignment: CirclePitchAlignment, callback: (Result<Unit>) -> Unit)
  fun getCirclePitchAlignment(managerId: String, callback: (Result<CirclePitchAlignment?>) -> Unit)
  fun setCirclePitchScale(managerId: String, circlePitchScale: CirclePitchScale, callback: (Result<Unit>) -> Unit)
  fun getCirclePitchScale(managerId: String, callback: (Result<CirclePitchScale?>) -> Unit)
  fun setCircleTranslate(managerId: String, circleTranslate: List<Double?>, callback: (Result<Unit>) -> Unit)
  fun getCircleTranslate(managerId: String, callback: (Result<List<Double?>?>) -> Unit)
  fun setCircleTranslateAnchor(managerId: String, circleTranslateAnchor: CircleTranslateAnchor, callback: (Result<Unit>) -> Unit)
  fun getCircleTranslateAnchor(managerId: String, callback: (Result<CircleTranslateAnchor?>) -> Unit)

  companion object {
    /** The codec used by _CircleAnnotationMessenger. */
    val codec: MessageCodec<Any?> by lazy {
      _CircleAnnotationMessengerCodec
    }
    /** Sets up an instance of `_CircleAnnotationMessenger` to handle messages through the `binaryMessenger`. */
    @Suppress("UNCHECKED_CAST")
    fun setUp(binaryMessenger: BinaryMessenger, api: _CircleAnnotationMessenger?, messageChannelSuffix: String = "") {
      val separatedMessageChannelSuffix = if (messageChannelSuffix.isNotEmpty()) ".$messageChannelSuffix" else ""
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.create$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val annotationOptionArg = args[1] as CircleAnnotationOptions
            api.create(managerIdArg, annotationOptionArg) { result: Result<CircleAnnotation> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.createMulti$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val annotationOptionsArg = args[1] as List<CircleAnnotationOptions>
            api.createMulti(managerIdArg, annotationOptionsArg) { result: Result<List<CircleAnnotation>> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.update$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val annotationArg = args[1] as CircleAnnotation
            api.update(managerIdArg, annotationArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.delete$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val annotationArg = args[1] as CircleAnnotation
            api.delete(managerIdArg, annotationArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.deleteAll$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.deleteAll(managerIdArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.setCircleEmissiveStrength$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val circleEmissiveStrengthArg = args[1] as Double
            api.setCircleEmissiveStrength(managerIdArg, circleEmissiveStrengthArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.getCircleEmissiveStrength$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getCircleEmissiveStrength(managerIdArg) { result: Result<Double?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.setCirclePitchAlignment$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val circlePitchAlignmentArg = CirclePitchAlignment.ofRaw(args[1] as Int)!!
            api.setCirclePitchAlignment(managerIdArg, circlePitchAlignmentArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.getCirclePitchAlignment$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getCirclePitchAlignment(managerIdArg) { result: Result<CirclePitchAlignment?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data?.raw))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.setCirclePitchScale$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val circlePitchScaleArg = CirclePitchScale.ofRaw(args[1] as Int)!!
            api.setCirclePitchScale(managerIdArg, circlePitchScaleArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.getCirclePitchScale$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getCirclePitchScale(managerIdArg) { result: Result<CirclePitchScale?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data?.raw))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.setCircleTranslate$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val circleTranslateArg = args[1] as List<Double?>
            api.setCircleTranslate(managerIdArg, circleTranslateArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.getCircleTranslate$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getCircleTranslate(managerIdArg) { result: Result<List<Double?>?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.setCircleTranslateAnchor$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val circleTranslateAnchorArg = CircleTranslateAnchor.ofRaw(args[1] as Int)!!
            api.setCircleTranslateAnchor(managerIdArg, circleTranslateAnchorArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._CircleAnnotationMessenger.getCircleTranslateAnchor$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getCircleTranslateAnchor(managerIdArg) { result: Result<CircleTranslateAnchor?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data?.raw))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
    }
  }
}