package one.video.calls.sdk.conversation.hold;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lone/video/calls/sdk/conversation/hold/HoldException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "SameStateRequested", "AlreadyProcessing", "SignalingCommandExecution", "Unspecified", "Lone/video/calls/sdk/conversation/hold/HoldException$AlreadyProcessing;", "Lone/video/calls/sdk/conversation/hold/HoldException$SameStateRequested;", "Lone/video/calls/sdk/conversation/hold/HoldException$SignalingCommandExecution;", "Lone/video/calls/sdk/conversation/hold/HoldException$Unspecified;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class HoldException extends RuntimeException {
    public final String a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/video/calls/sdk/conversation/hold/HoldException$AlreadyProcessing;", "Lone/video/calls/sdk/conversation/hold/HoldException;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AlreadyProcessing extends HoldException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/video/calls/sdk/conversation/hold/HoldException$SameStateRequested;", "Lone/video/calls/sdk/conversation/hold/HoldException;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SameStateRequested extends HoldException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/video/calls/sdk/conversation/hold/HoldException$SignalingCommandExecution;", "Lone/video/calls/sdk/conversation/hold/HoldException;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SignalingCommandExecution extends HoldException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/video/calls/sdk/conversation/hold/HoldException$Unspecified;", "Lone/video/calls/sdk/conversation/hold/HoldException;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Unspecified extends HoldException {
        public final Exception b;

        public Unspecified(Exception exc) {
            super(exc.getMessage());
            this.b = exc;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.b;
        }
    }

    public HoldException(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
