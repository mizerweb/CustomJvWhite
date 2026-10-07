package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c73 {
    public static d73 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatMembersUpdate chatMembersUpdate = (Tasks.ChatMembersUpdate) sia.mergeFrom(new Tasks.ChatMembersUpdate(), bArr);
            long j = chatMembersUpdate.requestId;
            long j2 = chatMembersUpdate.chatId;
            long j3 = chatMembersUpdate.chatServerId;
            String str = chatMembersUpdate.operation;
            str.getClass();
            e73 e73Var = !str.equals("remove") ? e73.ADD : e73.REMOVE;
            ArrayList arrayListH = p90.h(chatMembersUpdate.userIds);
            p63 p63VarA = p63.a(chatMembersUpdate.chatMemberType);
            boolean z = chatMembersUpdate.showHistory;
            int i = chatMembersUpdate.cleanMsgPeriod;
            return new d73(j, j2, j3, e73Var, arrayListH, p63VarA, z, i, 0, chatMembersUpdate.postId, chatMembersUpdate.messageId, i == -1 ? 5 : 1000000);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
