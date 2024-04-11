// Autogenerated from Pigeon (v16.0.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.mapbox.maps.pigeons;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression", "serial"})
public class FLTPolygonAnnotationMessager {

  /** Error class for passing custom error details to Flutter via a thrown PlatformException. */
  public static class FlutterError extends RuntimeException {

    /** The error code. */
    public final String code;

    /** The error details. Must be a datatype supported by the api codec. */
    public final Object details;

    public FlutterError(@NonNull String code, @Nullable String message, @Nullable Object details) 
    {
      super(message);
      this.code = code;
      this.details = details;
    }
  }

  @NonNull
  protected static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<Object>(3);
    if (exception instanceof FlutterError) {
      FlutterError error = (FlutterError) exception;
      errorList.add(error.code);
      errorList.add(error.getMessage());
      errorList.add(error.details);
    } else {
      errorList.add(exception.toString());
      errorList.add(exception.getClass().getSimpleName());
      errorList.add(
        "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }
    return errorList;
  }

  @NonNull
  protected static FlutterError createConnectionError(@NonNull String channelName) {
    return new FlutterError("channel-error",  "Unable to establish connection on channel: " + channelName + ".", "");
  }

  @Target(METHOD)
  @Retention(CLASS)
  @interface CanIgnoreReturnValue {}

  /** Controls the frame of reference for `fill-translate`. */
  public enum FillTranslateAnchor {
    /** The fill is translated relative to the map. */
    MAP(0),
    /** The fill is translated relative to the viewport. */
    VIEWPORT(1);

    final int index;

    private FillTranslateAnchor(final int index) {
      this.index = index;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class PolygonAnnotation {
    /** The id for annotation */
    private @NonNull String id;

    public @NonNull String getId() {
      return id;
    }

    public void setId(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"id\" is null.");
      }
      this.id = setterArg;
    }

    /** The geometry that determines the location/shape of this annotation */
    private @Nullable Map<String, Object> geometry;

    public @Nullable Map<String, Object> getGeometry() {
      return geometry;
    }

    public void setGeometry(@Nullable Map<String, Object> setterArg) {
      this.geometry = setterArg;
    }

    /** Sorts features in ascending order based on this value. Features with a higher sort key will appear above features with a lower sort key. */
    private @Nullable Double fillSortKey;

    public @Nullable Double getFillSortKey() {
      return fillSortKey;
    }

    public void setFillSortKey(@Nullable Double setterArg) {
      this.fillSortKey = setterArg;
    }

    /** The color of the filled part of this layer. This color can be specified as `rgba` with an alpha component and the color's opacity will not affect the opacity of the 1px stroke, if it is used. */
    private @Nullable Long fillColor;

    public @Nullable Long getFillColor() {
      return fillColor;
    }

    public void setFillColor(@Nullable Long setterArg) {
      this.fillColor = setterArg;
    }

    /** The opacity of the entire fill layer. In contrast to the `fill-color`, this value will also affect the 1px stroke around the fill, if the stroke is used. */
    private @Nullable Double fillOpacity;

    public @Nullable Double getFillOpacity() {
      return fillOpacity;
    }

    public void setFillOpacity(@Nullable Double setterArg) {
      this.fillOpacity = setterArg;
    }

    /** The outline color of the fill. Matches the value of `fill-color` if unspecified. */
    private @Nullable Long fillOutlineColor;

    public @Nullable Long getFillOutlineColor() {
      return fillOutlineColor;
    }

    public void setFillOutlineColor(@Nullable Long setterArg) {
      this.fillOutlineColor = setterArg;
    }

    /** Name of image in sprite to use for drawing image fills. For seamless patterns, image width and height must be a factor of two (2, 4, 8, ..., 512). Note that zoom-dependent expressions will be evaluated only at integer zoom levels. */
    private @Nullable String fillPattern;

    public @Nullable String getFillPattern() {
      return fillPattern;
    }

    public void setFillPattern(@Nullable String setterArg) {
      this.fillPattern = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    PolygonAnnotation() {}

    public static final class Builder {

      private @Nullable String id;

      @CanIgnoreReturnValue
      public @NonNull Builder setId(@NonNull String setterArg) {
        this.id = setterArg;
        return this;
      }

      private @Nullable Map<String, Object> geometry;

      @CanIgnoreReturnValue
      public @NonNull Builder setGeometry(@Nullable Map<String, Object> setterArg) {
        this.geometry = setterArg;
        return this;
      }

      private @Nullable Double fillSortKey;

      @CanIgnoreReturnValue
      public @NonNull Builder setFillSortKey(@Nullable Double setterArg) {
        this.fillSortKey = setterArg;
        return this;
      }

      private @Nullable Long fillColor;

      @CanIgnoreReturnValue
      public @NonNull Builder setFillColor(@Nullable Long setterArg) {
        this.fillColor = setterArg;
        return this;
      }

      private @Nullable Double fillOpacity;

      @CanIgnoreReturnValue
      public @NonNull Builder setFillOpacity(@Nullable Double setterArg) {
        this.fillOpacity = setterArg;
        return this;
      }

      private @Nullable Long fillOutlineColor;

      @CanIgnoreReturnValue
      public @NonNull Builder setFillOutlineColor(@Nullable Long setterArg) {
        this.fillOutlineColor = setterArg;
        return this;
      }

      private @Nullable String fillPattern;

      @CanIgnoreReturnValue
      public @NonNull Builder setFillPattern(@Nullable String setterArg) {
        this.fillPattern = setterArg;
        return this;
      }

      public @NonNull PolygonAnnotation build() {
        PolygonAnnotation pigeonReturn = new PolygonAnnotation();
        pigeonReturn.setId(id);
        pigeonReturn.setGeometry(geometry);
        pigeonReturn.setFillSortKey(fillSortKey);
        pigeonReturn.setFillColor(fillColor);
        pigeonReturn.setFillOpacity(fillOpacity);
        pigeonReturn.setFillOutlineColor(fillOutlineColor);
        pigeonReturn.setFillPattern(fillPattern);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(7);
      toListResult.add(id);
      toListResult.add(geometry);
      toListResult.add(fillSortKey);
      toListResult.add(fillColor);
      toListResult.add(fillOpacity);
      toListResult.add(fillOutlineColor);
      toListResult.add(fillPattern);
      return toListResult;
    }

    static @NonNull PolygonAnnotation fromList(@NonNull ArrayList<Object> list) {
      PolygonAnnotation pigeonResult = new PolygonAnnotation();
      Object id = list.get(0);
      pigeonResult.setId((String) id);
      Object geometry = list.get(1);
      pigeonResult.setGeometry((Map<String, Object>) geometry);
      Object fillSortKey = list.get(2);
      pigeonResult.setFillSortKey((Double) fillSortKey);
      Object fillColor = list.get(3);
      pigeonResult.setFillColor((fillColor == null) ? null : ((fillColor instanceof Integer) ? (Integer) fillColor : (Long) fillColor));
      Object fillOpacity = list.get(4);
      pigeonResult.setFillOpacity((Double) fillOpacity);
      Object fillOutlineColor = list.get(5);
      pigeonResult.setFillOutlineColor((fillOutlineColor == null) ? null : ((fillOutlineColor instanceof Integer) ? (Integer) fillOutlineColor : (Long) fillOutlineColor));
      Object fillPattern = list.get(6);
      pigeonResult.setFillPattern((String) fillPattern);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class PolygonAnnotationOptions {
    /** The geometry that determines the location/shape of this annotation */
    private @Nullable Map<String, Object> geometry;

    public @Nullable Map<String, Object> getGeometry() {
      return geometry;
    }

    public void setGeometry(@Nullable Map<String, Object> setterArg) {
      this.geometry = setterArg;
    }

    /** Sorts features in ascending order based on this value. Features with a higher sort key will appear above features with a lower sort key. */
    private @Nullable Double fillSortKey;

    public @Nullable Double getFillSortKey() {
      return fillSortKey;
    }

    public void setFillSortKey(@Nullable Double setterArg) {
      this.fillSortKey = setterArg;
    }

    /** The color of the filled part of this layer. This color can be specified as `rgba` with an alpha component and the color's opacity will not affect the opacity of the 1px stroke, if it is used. */
    private @Nullable Long fillColor;

    public @Nullable Long getFillColor() {
      return fillColor;
    }

    public void setFillColor(@Nullable Long setterArg) {
      this.fillColor = setterArg;
    }

    /** The opacity of the entire fill layer. In contrast to the `fill-color`, this value will also affect the 1px stroke around the fill, if the stroke is used. */
    private @Nullable Double fillOpacity;

    public @Nullable Double getFillOpacity() {
      return fillOpacity;
    }

    public void setFillOpacity(@Nullable Double setterArg) {
      this.fillOpacity = setterArg;
    }

    /** The outline color of the fill. Matches the value of `fill-color` if unspecified. */
    private @Nullable Long fillOutlineColor;

    public @Nullable Long getFillOutlineColor() {
      return fillOutlineColor;
    }

    public void setFillOutlineColor(@Nullable Long setterArg) {
      this.fillOutlineColor = setterArg;
    }

    /** Name of image in sprite to use for drawing image fills. For seamless patterns, image width and height must be a factor of two (2, 4, 8, ..., 512). Note that zoom-dependent expressions will be evaluated only at integer zoom levels. */
    private @Nullable String fillPattern;

    public @Nullable String getFillPattern() {
      return fillPattern;
    }

    public void setFillPattern(@Nullable String setterArg) {
      this.fillPattern = setterArg;
    }

    public static final class Builder {

      private @Nullable Map<String, Object> geometry;

      @CanIgnoreReturnValue
      public @NonNull Builder setGeometry(@Nullable Map<String, Object> setterArg) {
        this.geometry = setterArg;
        return this;
      }

      private @Nullable Double fillSortKey;

      @CanIgnoreReturnValue
      public @NonNull Builder setFillSortKey(@Nullable Double setterArg) {
        this.fillSortKey = setterArg;
        return this;
      }

      private @Nullable Long fillColor;

      @CanIgnoreReturnValue
      public @NonNull Builder setFillColor(@Nullable Long setterArg) {
        this.fillColor = setterArg;
        return this;
      }

      private @Nullable Double fillOpacity;

      @CanIgnoreReturnValue
      public @NonNull Builder setFillOpacity(@Nullable Double setterArg) {
        this.fillOpacity = setterArg;
        return this;
      }

      private @Nullable Long fillOutlineColor;

      @CanIgnoreReturnValue
      public @NonNull Builder setFillOutlineColor(@Nullable Long setterArg) {
        this.fillOutlineColor = setterArg;
        return this;
      }

      private @Nullable String fillPattern;

      @CanIgnoreReturnValue
      public @NonNull Builder setFillPattern(@Nullable String setterArg) {
        this.fillPattern = setterArg;
        return this;
      }

      public @NonNull PolygonAnnotationOptions build() {
        PolygonAnnotationOptions pigeonReturn = new PolygonAnnotationOptions();
        pigeonReturn.setGeometry(geometry);
        pigeonReturn.setFillSortKey(fillSortKey);
        pigeonReturn.setFillColor(fillColor);
        pigeonReturn.setFillOpacity(fillOpacity);
        pigeonReturn.setFillOutlineColor(fillOutlineColor);
        pigeonReturn.setFillPattern(fillPattern);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(6);
      toListResult.add(geometry);
      toListResult.add(fillSortKey);
      toListResult.add(fillColor);
      toListResult.add(fillOpacity);
      toListResult.add(fillOutlineColor);
      toListResult.add(fillPattern);
      return toListResult;
    }

    static @NonNull PolygonAnnotationOptions fromList(@NonNull ArrayList<Object> list) {
      PolygonAnnotationOptions pigeonResult = new PolygonAnnotationOptions();
      Object geometry = list.get(0);
      pigeonResult.setGeometry((Map<String, Object>) geometry);
      Object fillSortKey = list.get(1);
      pigeonResult.setFillSortKey((Double) fillSortKey);
      Object fillColor = list.get(2);
      pigeonResult.setFillColor((fillColor == null) ? null : ((fillColor instanceof Integer) ? (Integer) fillColor : (Long) fillColor));
      Object fillOpacity = list.get(3);
      pigeonResult.setFillOpacity((Double) fillOpacity);
      Object fillOutlineColor = list.get(4);
      pigeonResult.setFillOutlineColor((fillOutlineColor == null) ? null : ((fillOutlineColor instanceof Integer) ? (Integer) fillOutlineColor : (Long) fillOutlineColor));
      Object fillPattern = list.get(5);
      pigeonResult.setFillPattern((String) fillPattern);
      return pigeonResult;
    }
  }

  /** Asynchronous error handling return type for non-nullable API method returns. */
  public interface Result<T> {
    /** Success case callback method for handling returns. */
    void success(@NonNull T result);

    /** Failure case callback method for handling errors. */
    void error(@NonNull Throwable error);
  }
  /** Asynchronous error handling return type for nullable API method returns. */
  public interface NullableResult<T> {
    /** Success case callback method for handling returns. */
    void success(@Nullable T result);

    /** Failure case callback method for handling errors. */
    void error(@NonNull Throwable error);
  }
  /** Asynchronous error handling return type for void API method returns. */
  public interface VoidResult {
    /** Success case callback method for handling returns. */
    void success();

    /** Failure case callback method for handling errors. */
    void error(@NonNull Throwable error);
  }

  private static class OnPolygonAnnotationClickListenerCodec extends StandardMessageCodec {
    public static final OnPolygonAnnotationClickListenerCodec INSTANCE = new OnPolygonAnnotationClickListenerCodec();

    private OnPolygonAnnotationClickListenerCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return PolygonAnnotation.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof PolygonAnnotation) {
        stream.write(128);
        writeValue(stream, ((PolygonAnnotation) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java. */
  public static class OnPolygonAnnotationClickListener {
    private final @NonNull BinaryMessenger binaryMessenger;

    public OnPolygonAnnotationClickListener(@NonNull BinaryMessenger argBinaryMessenger) {
      this.binaryMessenger = argBinaryMessenger;
    }

    /** Public interface for sending reply. */ 
    /** The codec used by OnPolygonAnnotationClickListener. */
    static @NonNull MessageCodec<Object> getCodec() {
      return OnPolygonAnnotationClickListenerCodec.INSTANCE;
    }
    public void onPolygonAnnotationClick(@NonNull PolygonAnnotation annotationArg, @NonNull VoidResult result) {
      final String channelName = "dev.flutter.pigeon.mapbox_maps_flutter.OnPolygonAnnotationClickListener.onPolygonAnnotationClick";
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(
              binaryMessenger, channelName, getCodec());
      channel.send(
          new ArrayList<Object>(Collections.singletonList(annotationArg)),
          channelReply -> {
            if (channelReply instanceof List) {
              List<Object> listReply = (List<Object>) channelReply;
              if (listReply.size() > 1) {
                result.error(new FlutterError((String) listReply.get(0), (String) listReply.get(1), (String) listReply.get(2)));
              } else {
                result.success();
              }
            }  else {
              result.error(createConnectionError(channelName));
            } 
          });
    }
  }

  private static class _PolygonAnnotationMessagerCodec extends StandardMessageCodec {
    public static final _PolygonAnnotationMessagerCodec INSTANCE = new _PolygonAnnotationMessagerCodec();

    private _PolygonAnnotationMessagerCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return PolygonAnnotation.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 129:
          return PolygonAnnotation.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 130:
          return PolygonAnnotationOptions.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 131:
          return PolygonAnnotationOptions.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof PolygonAnnotation) {
        stream.write(128);
        writeValue(stream, ((PolygonAnnotation) value).toList());
      } else if (value instanceof PolygonAnnotation) {
        stream.write(129);
        writeValue(stream, ((PolygonAnnotation) value).toList());
      } else if (value instanceof PolygonAnnotationOptions) {
        stream.write(130);
        writeValue(stream, ((PolygonAnnotationOptions) value).toList());
      } else if (value instanceof PolygonAnnotationOptions) {
        stream.write(131);
        writeValue(stream, ((PolygonAnnotationOptions) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface _PolygonAnnotationMessager {

    void create(@NonNull String managerId, @NonNull PolygonAnnotationOptions annotationOption, @NonNull Result<PolygonAnnotation> result);

    void createMulti(@NonNull String managerId, @NonNull List<PolygonAnnotationOptions> annotationOptions, @NonNull Result<List<PolygonAnnotation>> result);

    void update(@NonNull String managerId, @NonNull PolygonAnnotation annotation, @NonNull VoidResult result);

    void delete(@NonNull String managerId, @NonNull PolygonAnnotation annotation, @NonNull VoidResult result);

    void deleteAll(@NonNull String managerId, @NonNull VoidResult result);

    void setFillAntialias(@NonNull String managerId, @NonNull Boolean fillAntialias, @NonNull VoidResult result);

    void getFillAntialias(@NonNull String managerId, @NonNull NullableResult<Boolean> result);

    void setFillEmissiveStrength(@NonNull String managerId, @NonNull Double fillEmissiveStrength, @NonNull VoidResult result);

    void getFillEmissiveStrength(@NonNull String managerId, @NonNull NullableResult<Double> result);

    void setFillTranslate(@NonNull String managerId, @NonNull List<Double> fillTranslate, @NonNull VoidResult result);

    void getFillTranslate(@NonNull String managerId, @NonNull NullableResult<List<Double>> result);

    void setFillTranslateAnchor(@NonNull String managerId, @NonNull FillTranslateAnchor fillTranslateAnchor, @NonNull VoidResult result);

    void getFillTranslateAnchor(@NonNull String managerId, @NonNull NullableResult<FillTranslateAnchor> result);

    /** The codec used by _PolygonAnnotationMessager. */
    static @NonNull MessageCodec<Object> getCodec() {
      return _PolygonAnnotationMessagerCodec.INSTANCE;
    }
    /**Sets up an instance of `_PolygonAnnotationMessager` to handle messages through the `binaryMessenger`. */
    static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable _PolygonAnnotationMessager api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.create", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                PolygonAnnotationOptions annotationOptionArg = (PolygonAnnotationOptions) args.get(1);
                Result<PolygonAnnotation> resultCallback =
                    new Result<PolygonAnnotation>() {
                      public void success(PolygonAnnotation result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.create(managerIdArg, annotationOptionArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.createMulti", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                List<PolygonAnnotationOptions> annotationOptionsArg = (List<PolygonAnnotationOptions>) args.get(1);
                Result<List<PolygonAnnotation>> resultCallback =
                    new Result<List<PolygonAnnotation>>() {
                      public void success(List<PolygonAnnotation> result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.createMulti(managerIdArg, annotationOptionsArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.update", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                PolygonAnnotation annotationArg = (PolygonAnnotation) args.get(1);
                VoidResult resultCallback =
                    new VoidResult() {
                      public void success() {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.update(managerIdArg, annotationArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.delete", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                PolygonAnnotation annotationArg = (PolygonAnnotation) args.get(1);
                VoidResult resultCallback =
                    new VoidResult() {
                      public void success() {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.delete(managerIdArg, annotationArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.deleteAll", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                VoidResult resultCallback =
                    new VoidResult() {
                      public void success() {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.deleteAll(managerIdArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.setFillAntialias", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                Boolean fillAntialiasArg = (Boolean) args.get(1);
                VoidResult resultCallback =
                    new VoidResult() {
                      public void success() {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.setFillAntialias(managerIdArg, fillAntialiasArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.getFillAntialias", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                NullableResult<Boolean> resultCallback =
                    new NullableResult<Boolean>() {
                      public void success(Boolean result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getFillAntialias(managerIdArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.setFillEmissiveStrength", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                Double fillEmissiveStrengthArg = (Double) args.get(1);
                VoidResult resultCallback =
                    new VoidResult() {
                      public void success() {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.setFillEmissiveStrength(managerIdArg, fillEmissiveStrengthArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.getFillEmissiveStrength", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                NullableResult<Double> resultCallback =
                    new NullableResult<Double>() {
                      public void success(Double result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getFillEmissiveStrength(managerIdArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.setFillTranslate", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                List<Double> fillTranslateArg = (List<Double>) args.get(1);
                VoidResult resultCallback =
                    new VoidResult() {
                      public void success() {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.setFillTranslate(managerIdArg, fillTranslateArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.getFillTranslate", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                NullableResult<List<Double>> resultCallback =
                    new NullableResult<List<Double>>() {
                      public void success(List<Double> result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getFillTranslate(managerIdArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.setFillTranslateAnchor", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                FillTranslateAnchor fillTranslateAnchorArg = FillTranslateAnchor.values()[(int) args.get(1)];
                VoidResult resultCallback =
                    new VoidResult() {
                      public void success() {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.setFillTranslateAnchor(managerIdArg, fillTranslateAnchorArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolygonAnnotationMessager.getFillTranslateAnchor", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String managerIdArg = (String) args.get(0);
                NullableResult<FillTranslateAnchor> resultCallback =
                    new NullableResult<FillTranslateAnchor>() {
                      public void success(FillTranslateAnchor result) {
                        wrapped.add(0, result == null ? null : result.index);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getFillTranslateAnchor(managerIdArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
}