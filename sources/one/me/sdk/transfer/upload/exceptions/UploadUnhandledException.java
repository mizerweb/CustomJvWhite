package one.me.sdk.transfer.upload.exceptions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "SslEngineCreateException", "SslEngineOperationException", "ChannelOpenException", "ChannelConnectException", "ChannelWriteException", "ChannelReadException", "FileOpenException", "FileBufferReadException", "FileBufferProduceException", "ResponseBodyHasErrorCodeException", "RetriableException", "m1m", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$ChannelConnectException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$ChannelOpenException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$ChannelReadException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$ChannelWriteException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$FileBufferProduceException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$FileBufferReadException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$FileOpenException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$ResponseBodyHasErrorCodeException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$SslEngineCreateException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$SslEngineOperationException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class UploadUnhandledException extends Exception {
    public static final /* synthetic */ int a = 0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$ChannelConnectException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ChannelConnectException extends UploadUnhandledException {
        public final String b;
        public final Throwable c;

        public ChannelConnectException(String str, Throwable th) {
            this.b = str;
            this.c = th;
        }

        @Override // one.me.sdk.transfer.upload.exceptions.UploadUnhandledException, java.lang.Throwable
        public final Throwable getCause() {
            return this.c;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$ChannelOpenException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ChannelOpenException extends UploadUnhandledException {
        public final String b = "AsynchronousSocketChannel is not created";
        public final Throwable c;

        public ChannelOpenException(Throwable th) {
            this.c = th;
        }

        @Override // one.me.sdk.transfer.upload.exceptions.UploadUnhandledException, java.lang.Throwable
        public final Throwable getCause() {
            return this.c;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$ChannelReadException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ChannelReadException extends UploadUnhandledException {
        public final String b;
        public final Throwable c;

        public ChannelReadException(String str, Throwable th) {
            this.b = str;
            this.c = th;
        }

        @Override // one.me.sdk.transfer.upload.exceptions.UploadUnhandledException, java.lang.Throwable
        public final Throwable getCause() {
            return this.c;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$ChannelWriteException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ChannelWriteException extends UploadUnhandledException {
        public final String b;
        public final Throwable c;

        public ChannelWriteException(String str, Throwable th) {
            this.b = str;
            this.c = th;
        }

        @Override // one.me.sdk.transfer.upload.exceptions.UploadUnhandledException, java.lang.Throwable
        public final Throwable getCause() {
            return this.c;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$FileBufferProduceException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FileBufferProduceException extends UploadUnhandledException {
        public final String b;
        public final Throwable c;

        public FileBufferProduceException(String str, Throwable th) {
            this.b = str;
            this.c = th;
        }

        @Override // one.me.sdk.transfer.upload.exceptions.UploadUnhandledException, java.lang.Throwable
        public final Throwable getCause() {
            return this.c;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$FileBufferReadException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FileBufferReadException extends UploadUnhandledException {
        public final String b;
        public final Throwable c;

        public FileBufferReadException(String str, Throwable th) {
            this.b = str;
            this.c = th;
        }

        @Override // one.me.sdk.transfer.upload.exceptions.UploadUnhandledException, java.lang.Throwable
        public final Throwable getCause() {
            return this.c;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$FileOpenException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FileOpenException extends UploadUnhandledException {
        public final String b;
        public final Throwable c;

        public FileOpenException(String str, Throwable th) {
            this.b = str;
            this.c = th;
        }

        @Override // one.me.sdk.transfer.upload.exceptions.UploadUnhandledException, java.lang.Throwable
        public final Throwable getCause() {
            return this.c;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$ResponseBodyHasErrorCodeException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ResponseBodyHasErrorCodeException extends UploadUnhandledException {
        public final String b;

        public ResponseBodyHasErrorCodeException(String str) {
            this.b = str;
        }

        @Override // one.me.sdk.transfer.upload.exceptions.UploadUnhandledException, java.lang.Throwable
        public final Throwable getCause() {
            return null;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$RetriableException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RetriableException extends Exception {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$SslEngineCreateException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SslEngineCreateException extends UploadUnhandledException {
        public final String b;
        public final Throwable c;

        public SslEngineCreateException(String str, Throwable th) {
            this.b = str;
            this.c = th;
        }

        @Override // one.me.sdk.transfer.upload.exceptions.UploadUnhandledException, java.lang.Throwable
        public final Throwable getCause() {
            return this.c;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException$SslEngineOperationException;", "Lone/me/sdk/transfer/upload/exceptions/UploadUnhandledException;", "transfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SslEngineOperationException extends UploadUnhandledException {
        public final String b;

        public SslEngineOperationException(String str) {
            this.b = str;
        }

        @Override // one.me.sdk.transfer.upload.exceptions.UploadUnhandledException, java.lang.Throwable
        public final Throwable getCause() {
            return null;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.b;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public abstract Throwable getCause();
}
