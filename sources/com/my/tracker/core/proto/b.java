package com.my.tracker.core.proto;

import android.text.TextUtils;
import com.my.tracker.core.UserInfoState;
import com.my.tracker.core.o.c;
import com.my.tracker.core.o.i;
import com.my.tracker.core.o.l;
import com.my.tracker.core.o.r;
import com.my.tracker.core.o.t;
import com.my.tracker.core.o.v;
import com.my.tracker.core.o.y;
import defpackage.np0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    protected final ByteArrayProtoWriter a = new ByteArrayProtoWriter(16384);
    protected final ByteArrayProtoWriter b = new ByteArrayProtoWriter(np0.r);

    public static void a(ProtoWriter protoWriter, String str, String str2, r rVar, ByteArrayProtoWriter byteArrayProtoWriter, ByteArrayProtoWriter byteArrayProtoWriter2) {
        l lVar = rVar.b;
        byteArrayProtoWriter.reset();
        a(byteArrayProtoWriter, str, rVar.c, rVar.d, byteArrayProtoWriter2);
        int i = lVar.a;
        if (i != -1) {
            byteArrayProtoWriter.writeField(1, i);
        }
        if (!TextUtils.isEmpty(lVar.d)) {
            byteArrayProtoWriter.writeField(2, lVar.d);
        }
        if (!TextUtils.isEmpty(lVar.j)) {
            byteArrayProtoWriter.writeField(3, lVar.j);
        }
        if (!TextUtils.isEmpty(lVar.l)) {
            byteArrayProtoWriter.writeField(4, lVar.l);
        }
        if (!TextUtils.isEmpty(lVar.b)) {
            byteArrayProtoWriter.writeField(5, lVar.b);
        }
        if (!TextUtils.isEmpty(lVar.c)) {
            byteArrayProtoWriter.writeField(6, lVar.c);
        }
        if (!TextUtils.isEmpty(lVar.i)) {
            byteArrayProtoWriter.writeField(7, lVar.i);
        }
        if (!TextUtils.isEmpty(lVar.h)) {
            byteArrayProtoWriter.writeField(8, lVar.h);
        }
        int i2 = lVar.s;
        if (i2 != -1) {
            byteArrayProtoWriter.writeField(9, i2);
        }
        int i3 = lVar.m;
        if (i3 != -1) {
            byteArrayProtoWriter.writeField(10, i3);
        }
        int i4 = lVar.n;
        if (i4 != -1) {
            byteArrayProtoWriter.writeField(11, i4);
        }
        int i5 = lVar.o;
        if (i5 != -1) {
            byteArrayProtoWriter.writeField(12, i5);
        }
        if (!Float.isNaN(lVar.q)) {
            byteArrayProtoWriter.writeField(13, lVar.q);
        }
        if (!Float.isNaN(lVar.r)) {
            byteArrayProtoWriter.writeField(14, lVar.r);
        }
        if (!Float.isNaN(lVar.p)) {
            byteArrayProtoWriter.writeField(15, lVar.p);
        }
        byteArrayProtoWriter.writeField(16, str2);
        i iVar = rVar.f;
        if (iVar != null) {
            int i6 = iVar.a;
            if (i6 != -1) {
                byteArrayProtoWriter.writeField(17, i6);
            }
            int i7 = iVar.b;
            if (i7 >= 0) {
                byteArrayProtoWriter.writeField(18, i7);
            }
        }
        long j = lVar.t;
        if (j != -1) {
            byteArrayProtoWriter.writeField(19, j);
        }
        long j2 = lVar.u;
        if (j2 != -1) {
            byteArrayProtoWriter.writeField(20, j2);
        }
        int i8 = lVar.v;
        if (i8 != -1) {
            byteArrayProtoWriter.writeField(23, i8);
        }
        int i9 = lVar.w;
        if (i9 != -1) {
            byteArrayProtoWriter.writeField(24, i9);
        }
        t tVar = rVar.g;
        if (tVar != null && !TextUtils.isEmpty(tVar.a)) {
            byteArrayProtoWriter.writeField(25, rVar.g.a);
        }
        if (byteArrayProtoWriter.size() > 0) {
            protoWriter.writeField(23, byteArrayProtoWriter);
        }
    }

    public static void a(ProtoWriter protoWriter, boolean z, UserInfoState userInfoState, ByteArrayProtoWriter byteArrayProtoWriter) {
        int i;
        byteArrayProtoWriter.reset();
        if (!z && ((i = userInfoState.gender) == 0 || i == 1 || i == 2)) {
            byteArrayProtoWriter.writeField(1, i);
        }
        int i2 = userInfoState.age;
        if (i2 > -1) {
            byteArrayProtoWriter.writeField(2, i2);
        }
        if (!z) {
            byteArrayProtoWriter.writeRepeatedField(3, userInfoState.okIds);
            byteArrayProtoWriter.writeRepeatedField(4, userInfoState.vkIds);
            byteArrayProtoWriter.writeRepeatedField(5, userInfoState.emails);
            byteArrayProtoWriter.writeRepeatedField(6, userInfoState.icqIds);
            byteArrayProtoWriter.writeRepeatedField(7, userInfoState.customUserIds);
            byteArrayProtoWriter.writeRepeatedField(8, userInfoState.phones);
            byteArrayProtoWriter.writeRepeatedField(9, userInfoState.vkConnectIds);
        }
        if (byteArrayProtoWriter.size() > 0) {
            protoWriter.writeField(22, byteArrayProtoWriter);
        }
    }

    public static void a(ProtoWriter protoWriter, c cVar, l lVar, ByteArrayProtoWriter byteArrayProtoWriter, ByteArrayProtoWriter byteArrayProtoWriter2) {
        byteArrayProtoWriter.reset();
        if (cVar != null) {
            byteArrayProtoWriter2.reset();
            byteArrayProtoWriter2.writeField(1, cVar.a);
            int i = cVar.b;
            if (i != -1) {
                byteArrayProtoWriter2.writeField(2, i);
            }
            if (byteArrayProtoWriter2.size() > 0) {
                byteArrayProtoWriter.writeField(31, byteArrayProtoWriter2);
            }
        }
        byteArrayProtoWriter.writeField(1, lVar.g);
        byteArrayProtoWriter.writeField(2, lVar.f);
        byteArrayProtoWriter.writeField(3, lVar.k);
        byteArrayProtoWriter.writeField(4, lVar.e);
        protoWriter.writeField(21, byteArrayProtoWriter);
    }

    public static void a(ProtoWriter protoWriter, String str, v vVar, y yVar, ByteArrayProtoWriter byteArrayProtoWriter) {
        byteArrayProtoWriter.reset();
        byteArrayProtoWriter.writeField(1, str);
        if (vVar != null && !TextUtils.isEmpty(vVar.a)) {
            boolean z = vVar.b;
            byteArrayProtoWriter.writeField(2, vVar.a);
            byteArrayProtoWriter.writeField(3, z ? 1 : 0);
        }
        if (yVar != null && !TextUtils.isEmpty(yVar.a)) {
            boolean z2 = yVar.b;
            byteArrayProtoWriter.writeField(4, yVar.a);
            byteArrayProtoWriter.writeField(5, z2 ? 1 : 0);
        }
        if (byteArrayProtoWriter.size() > 0) {
            protoWriter.writeField(31, byteArrayProtoWriter);
        }
    }

    public synchronized void a() {
        this.a.trimToDefaultSize();
        this.b.trimToDefaultSize();
    }
}
