package defpackage;

import android.database.Cursor;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import one.me.sdk.database.migration.DbMigrationException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes.dex */
public final class hya extends zxa {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hya(int i) {
        super(40, 41);
        this.c = i;
        switch (i) {
            case 2:
                super(25, 26);
                this.d = new bya();
                break;
            case 3:
                super(63, 64);
                this.d = new bya();
                break;
            default:
                this.d = hya.class.getName();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x022c A[LOOP:0: B:27:0x0097->B:89:0x022c, LOOP_END] */
    @Override // defpackage.zxa
    public void a(id7 id7Var) throws IOException {
        hya hyaVar;
        hya hyaVar2 = this;
        id7 id7Var2 = id7Var;
        switch (hyaVar2.c) {
            case 0:
                gm0.x((String) hyaVar2.d, "start migration 40 to 41", null);
                List list = xfa.b;
                Cursor cursorK0 = id7Var2.k0("SELECT id, LENGTH(attaches) as attaches_blob_length FROM messages WHERE attaches IS NOT NULL AND delivery_status = ? AND status <> ? AND inserted_from_msg_link = 0", new Integer[]{10, 10});
                try {
                    int columnIndex = cursorK0.getColumnIndex("id");
                    int columnIndex2 = cursorK0.getColumnIndex("attaches_blob_length");
                    if (cursorK0.moveToFirst()) {
                        while (true) {
                            long j = cursorK0.getLong(columnIndex);
                            long j2 = cursorK0.getLong(columnIndex2);
                            String str = (String) hyaVar2.d;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "messageId = " + j + ", attaches_blob_length=" + j2, null);
                                }
                            }
                            if (j2 > 0) {
                                try {
                                    byte[] bArrC = hyaVar2.c(id7Var2, j, j2);
                                    hyaVar = hyaVar2;
                                    if (bArrC != null) {
                                        try {
                                            if (bArrC.length == 0) {
                                                bArrC = null;
                                            }
                                            if (bArrC != null) {
                                                byte[] bArr = a.a;
                                                try {
                                                    c46 c46VarE = a.e(Protos.Attaches.parseFrom(bArrC));
                                                    ArrayList arrayList = new ArrayList();
                                                    List<e70> list2 = (List) c46VarE.a;
                                                    ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
                                                    for (e70 e70VarA : list2) {
                                                        y60 y60Var = e70VarA.a;
                                                        int i = y60Var == null ? -1 : gya.$EnumSwitchMapping$0[y60Var.ordinal()];
                                                        if ((i == 1 || i == 2) && e70VarA.q == u60.c) {
                                                            arrayList.add(e70VarA.t);
                                                            c60 c60VarJ = e70VarA.j();
                                                            c60VarJ.i = u60.d;
                                                            e70VarA = c60VarJ.a();
                                                        }
                                                        arrayList2.add(e70VarA);
                                                    }
                                                    if (arrayList.isEmpty()) {
                                                        id7Var2 = id7Var;
                                                    } else {
                                                        f70 f70VarP = c46VarE.p();
                                                        f70VarP.a = arrayList2;
                                                        c46 c46VarC = f70VarP.c();
                                                        List list3 = xfa.b;
                                                        id7Var.r0("messages", 5, ipl.a(new ylc("delivery_status", 40), new ylc("attaches", sia.toByteArray(a.f(c46VarC)))), "id = ?", new Long[]{Long.valueOf(j)});
                                                        id7Var2 = id7Var;
                                                        String str2 = "attach_local_id IN (" + ww3.z1(arrayList, ", ", null, null, new s9a(13), 30) + ")";
                                                        Object[] array = arrayList.toArray(new String[0]);
                                                        StringBuilder sb = new StringBuilder("DELETE FROM uploads");
                                                        if (str2.length() != 0) {
                                                            sb.append(" WHERE ");
                                                            sb.append(str2);
                                                        }
                                                        od7 od7VarA = id7Var2.A(sb.toString());
                                                        vd7.c(od7VarA, array);
                                                        od7VarA.c.executeUpdateDelete();
                                                    }
                                                } catch (InvalidProtocolBufferNanoException e) {
                                                    id7Var2 = id7Var;
                                                    try {
                                                        throw new ProtoException(e);
                                                    } catch (ProtoException e2) {
                                                        e = e2;
                                                        gm0.V((String) hyaVar.d, "fail to parse message attaches", new fya("Blob length = " + j2, e));
                                                        if (cursorK0.moveToNext()) {
                                                            cursorK0.close();
                                                            gm0.x((String) hyaVar.d, "finish migration 40 to 41", null);
                                                            return;
                                                        }
                                                        hyaVar2 = hyaVar;
                                                    }
                                                }
                                            } else {
                                                id7Var2 = id7Var;
                                            }
                                        } catch (ProtoException e3) {
                                            e = e3;
                                            id7Var2 = id7Var;
                                        }
                                    } else {
                                        id7Var2 = id7Var;
                                    }
                                } catch (ProtoException e4) {
                                    e = e4;
                                    hyaVar = hyaVar2;
                                }
                            } else {
                                hyaVar = hyaVar2;
                            }
                            if (cursorK0.moveToNext()) {
                                hyaVar2 = hyaVar;
                            }
                        }
                    } else {
                        hyaVar = hyaVar2;
                    }
                    cursorK0.close();
                    gm0.x((String) hyaVar.d, "finish migration 40 to 41", null);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(cursorK0, th);
                        throw th2;
                    }
                }
            case 1:
                gm0.n("Migration_26_27", "start");
                id7Var2.l();
                try {
                    id7Var2.I("CREATE TABLE IF NOT EXISTS `temp_stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sticker_id` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `url` TEXT, `update_time` INTEGER NOT NULL, `mp4_url` TEXT, `first_url` TEXT, `preview_url` TEXT, `tags` TEXT NOT NULL, `sticker_type` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `lottie_url` TEXT, `audio` INTEGER NOT NULL, `author_type` INTEGER NOT NULL, `video_url` TEXT)");
                    id7Var2.I("INSERT INTO `temp_stickers` SELECT * FROM `stickers` WHERE `id` IN (SELECT MAX(`id`) FROM `stickers` GROUP BY `sticker_id`)");
                    id7Var2.I("DROP TABLE `stickers`");
                    id7Var2.I("ALTER TABLE `temp_stickers` RENAME TO `stickers`");
                    id7Var2.I("CREATE UNIQUE INDEX IF NOT EXISTS `index_stickers_sticker_id` ON `stickers` (`sticker_id`)");
                    id7Var2.o0();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.d;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, "Migration_26_27", "finish! migrate stickers", null);
                        }
                        break;
                    }
                } catch (Throwable th3) {
                    try {
                        gm0.V("Migration_26_27", "unexpected error!", new DbMigrationException("migration_26_27", th3));
                        ((eh9) hyaVar2.d).b();
                    } finally {
                        id7Var2.E();
                    }
                    break;
                }
                return;
            default:
                super.a(id7Var);
                return;
        }
    }

    @Override // defpackage.zxa
    public void b(qxe qxeVar) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 2:
                n1g.u(qxeVar, "DROP TABLE `chat_location`");
                n1g.u(qxeVar, "DROP TABLE `contact_location`");
                ((bya) obj).f(qxeVar);
                break;
            case 3:
                n1g.u(qxeVar, "DROP TABLE `selected_mentions`");
                ((bya) obj).f(qxeVar);
                break;
            default:
                super.b(qxeVar);
                break;
        }
    }

    public byte[] c(id7 id7Var, long j, long j2) {
        ArrayList<byte[]> arrayList = new ArrayList();
        long j3 = 0;
        while (j3 < j2) {
            long jMin = Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, j2 - j3);
            Cursor cursorK0 = id7Var.k0("SELECT SUBSTR(attaches, ?, ?) as chunk FROM messages WHERE id = ?", new Long[]{Long.valueOf(1 + j3), Long.valueOf(jMin), Long.valueOf(j)});
            try {
                if (cursorK0.moveToFirst()) {
                    arrayList.add(cursorK0.getBlob(cursorK0.getColumnIndex(MultiFileUploader.CHUNK_FILE_NAME_PREFIX)));
                }
                cursorK0.close();
                j3 += jMin;
            } catch (Throwable th) {
                try {
                    gm0.V((String) this.d, "Error while chunked reading of attaches blob", new fya("Blob length = " + j2, th));
                    return null;
                } finally {
                    cursorK0.close();
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        byte[] bArr = new byte[(int) j2];
        int length = 0;
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hya(eh9 eh9Var) {
        super(26, 27);
        this.c = 1;
        this.d = eh9Var;
    }
}
