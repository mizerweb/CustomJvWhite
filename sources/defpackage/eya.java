package defpackage;

import android.database.Cursor;
import java.io.IOException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes.dex */
public final class eya extends zxa {
    public final String c;

    public eya() {
        super(38, 39);
        this.c = eya.class.getName();
    }

    @Override // defpackage.zxa
    public final void a(id7 id7Var) throws IOException {
        Protos.Chat chatQ;
        String str = this.c;
        gm0.x(str, "start migration 38 to 39", null);
        Cursor cursorY = id7Var.Y("SELECT id, data FROM chats");
        try {
            int columnIndex = cursorY.getColumnIndex("id");
            int columnIndex2 = cursorY.getColumnIndex("data");
            if (cursorY.moveToFirst()) {
                do {
                    long j = cursorY.getLong(columnIndex);
                    try {
                        byte[] blob = cursorY.isNull(columnIndex2) ? null : cursorY.getBlob(columnIndex2);
                        if (blob != null && (chatQ = a.q(blob)) != null) {
                            long j2 = chatQ.pinnedMessageId;
                            if (j2 > 0) {
                                Cursor cursorK0 = id7Var.k0("SELECT server_id FROM messages WHERE id = ?", new Long[]{Long.valueOf(j2)});
                                try {
                                    long j3 = cursorK0.moveToFirst() ? cursorK0.getLong(0) : -1L;
                                    cursorK0.close();
                                    if (j3 > 0) {
                                        chatQ.pinnedMessageId = j3;
                                        id7Var.r0("chats", 5, ipl.a(new ylc("data", sia.toByteArray(chatQ))), "id = ?", new Long[]{Long.valueOf(j)});
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        rx8.n(cursorK0, th);
                                        throw th2;
                                    }
                                }
                            }
                        }
                    } catch (ProtoException e) {
                        gm0.V(str, "fail to parse chat", e);
                    }
                } while (cursorY.moveToNext());
            }
            cursorY.close();
            gm0.x(str, "finish migration 38 to 39", null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                rx8.n(cursorY, th3);
                throw th4;
            }
        }
    }
}
