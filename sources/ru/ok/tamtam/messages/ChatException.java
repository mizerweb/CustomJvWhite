package ru.ok.tamtam.messages;

import defpackage.gda;
import defpackage.j95;
import defpackage.ox2;
import defpackage.q24;
import defpackage.qt4;
import defpackage.rt2;
import defpackage.sfa;
import defpackage.st2;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\t\n\u000b\f\r\u000e\u000f\u0010B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lru/ok/tamtam/messages/ChatException;", "Lru/ok/tamtam/exception/IssueKeyException;", "issueKey", "", "message", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "NotifMessage", "Store", "WrongMessage", "ChatMessageTypeMismatch", "InvalidLocalId", "WrongLastMessage", "Parse", "NotFound", "Lru/ok/tamtam/messages/ChatException$ChatMessageTypeMismatch;", "Lru/ok/tamtam/messages/ChatException$InvalidLocalId;", "Lru/ok/tamtam/messages/ChatException$NotFound;", "Lru/ok/tamtam/messages/ChatException$NotifMessage;", "Lru/ok/tamtam/messages/ChatException$Parse;", "Lru/ok/tamtam/messages/ChatException$Store;", "Lru/ok/tamtam/messages/ChatException$WrongLastMessage;", "Lru/ok/tamtam/messages/ChatException$WrongMessage;", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class ChatException extends IssueKeyException {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/tamtam/messages/ChatException$ChatMessageTypeMismatch;", "Lru/ok/tamtam/messages/ChatException;", "", "msgId", "", "commentsMsg", ApiProtocol.PARAM_CHAT_ID, "Lq24;", "commentsId", "<init>", "(JZJLq24;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ChatMessageTypeMismatch extends ChatException {
        public ChatMessageTypeMismatch(long j, boolean z, long j2, q24 q24Var) {
            super("ONEME-44127", "chat=" + j2 + "," + q24Var + ";msg=" + z + ";" + j, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/messages/ChatException$InvalidLocalId;", "Lru/ok/tamtam/messages/ChatException;", "requestedId", "", "Lru/ok/tamtam/chats/ChatLocalId;", "invalidChatId", "<init>", "(JJ)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvalidLocalId extends ChatException {
        /* JADX WARN: Illegal instructions before constructor call */
        public InvalidLocalId(long j, long j2) {
            StringBuilder sbS = qt4.s(j, "requestedId=", ",invalidChatId=");
            sbS.append(j2);
            super("ONEME-36244", sbS.toString(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ok/tamtam/messages/ChatException$NotFound;", "Lru/ok/tamtam/messages/ChatException;", "message", "", "<init>", "(Ljava/lang/String;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NotFound extends ChatException {
        public NotFound(String str) {
            super("chats", str, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/tamtam/messages/ChatException$NotifMessage;", "Lru/ok/tamtam/messages/ChatException;", "", "Lru/ok/tamtam/chats/ChatServerId;", "chatServerId", "Lrt2;", "chat", "Lgda;", "message", "<init>", "(JLrt2;Lgda;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NotifMessage extends ChatException {
        public NotifMessage(long j, rt2 rt2Var, gda gdaVar) {
            super("ONEME-36432", "invalid chat in cache: chatServerId=" + j + ", chat=" + rt2Var + ", message=" + gdaVar, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/messages/ChatException$Parse;", "Lru/ok/tamtam/messages/ChatException;", "Lst2;", "chat", "", "cause", "<init>", "(Lst2;Ljava/lang/Throwable;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Parse extends ChatException {
        public Parse(st2 st2Var, Throwable th) {
            super("ONEME-36777", "chat=" + st2Var, th, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/messages/ChatException$Store;", "Lru/ok/tamtam/messages/ChatException;", "Lst2;", "serverChat", "Lox2;", "chatDb", "<init>", "(Lst2;Lox2;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Store extends ChatException {
        public Store(st2 st2Var, ox2 ox2Var) {
            super("ONEME-36432", "invalid chatDb for serverChat: serverChat=" + st2Var + ", chatDb=" + ox2Var, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/tamtam/messages/ChatException$WrongLastMessage;", "Lru/ok/tamtam/messages/ChatException;", "", "Lru/ok/tamtam/chats/ChatLocalId;", ApiProtocol.PARAM_CHAT_ID, "Lsfa;", "message", "<init>", "(JLsfa;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WrongLastMessage extends ChatException {
        public WrongLastMessage(long j, sfa sfaVar) {
            super("ONEME-36244", "wrong last message in chat: chatLocalId=" + j + ", message=" + sfaVar, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tamtam/messages/ChatException$WrongMessage;", "Lru/ok/tamtam/messages/ChatException;", "msgId", "", "chatIdFromMessage", ApiProtocol.PARAM_CHAT_ID, "<init>", "(JJJ)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WrongMessage extends ChatException {
        /* JADX WARN: Illegal instructions before constructor call */
        public WrongMessage(long j, long j2, long j3) {
            StringBuilder sbS = qt4.s(j, "Wrong message when try create preProcessedData, msgId:", ", chatIdFromMessage:");
            sbS.append(j2);
            super("ONEME-36026", qt4.k(j3, ", chatId:", sbS), null, 4, null);
        }
    }

    public /* synthetic */ ChatException(String str, String str2, Throwable th, int i, j95 j95Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th, null);
    }

    private ChatException(String str, String str2, Throwable th) {
        super(str, str2, th);
    }

    public /* synthetic */ ChatException(String str, String str2, Throwable th, j95 j95Var) {
        this(str, str2, th);
    }
}
