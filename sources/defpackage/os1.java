package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Size;
import android.view.View;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.calls.impl.service.telecom.TelecomCallService;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.arch.Widget;
import one.video.transloader.task.UploadTask;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.Conversation;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class os1 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ os1(ns1 ns1Var, Object obj, qs1 qs1Var) {
        this.a = 1;
        this.b = ns1Var;
        this.d = obj;
        this.c = qs1Var;
    }

    private final Object a(Object obj) throws Exception {
        String str = (String) this.c;
        pw pwVar = (pw) this.b;
        toa toaVar = (toa) this.d;
        vxe vxeVarO0 = ((qxe) obj).O0(str);
        try {
            hw hwVar = new hw(pwVar);
            int i = 1;
            while (hwVar.hasNext()) {
                vxeVarO0.c(i, ((Number) hwVar.next()).intValue());
                i++;
            }
            int iE = qyj.E(vxeVarO0, "id");
            int iE2 = qyj.E(vxeVarO0, "server_id");
            int iE3 = qyj.E(vxeVarO0, "time");
            int iE4 = qyj.E(vxeVarO0, "update_time");
            int iE5 = qyj.E(vxeVarO0, "sender");
            int iE6 = qyj.E(vxeVarO0, "cid");
            int iE7 = qyj.E(vxeVarO0, "text");
            int iE8 = qyj.E(vxeVarO0, "delivery_status");
            int iE9 = qyj.E(vxeVarO0, "status");
            int iE10 = qyj.E(vxeVarO0, "status_in_process");
            int iE11 = qyj.E(vxeVarO0, "time_local");
            int iE12 = qyj.E(vxeVarO0, "error");
            int iE13 = qyj.E(vxeVarO0, "localized_error");
            int iE14 = qyj.E(vxeVarO0, "attaches");
            int iE15 = qyj.E(vxeVarO0, "media_type");
            int iE16 = qyj.E(vxeVarO0, "detect_share");
            int iE17 = qyj.E(vxeVarO0, "msg_link_type");
            int iE18 = qyj.E(vxeVarO0, "msg_link_id");
            int iE19 = qyj.E(vxeVarO0, "inserted_from_msg_link");
            int iE20 = qyj.E(vxeVarO0, "msg_link_chat_id");
            int iE21 = qyj.E(vxeVarO0, "msg_link_chat_name");
            int iE22 = qyj.E(vxeVarO0, "msg_link_chat_link");
            int iE23 = qyj.E(vxeVarO0, "msg_link_chat_icon_url");
            int iE24 = qyj.E(vxeVarO0, "msg_link_chat_access_type");
            int iE25 = qyj.E(vxeVarO0, "msg_link_out_chat_id");
            int iE26 = qyj.E(vxeVarO0, "msg_link_out_msg_id");
            int iE27 = qyj.E(vxeVarO0, "type");
            int iE28 = qyj.E(vxeVarO0, "chat_id");
            int iE29 = qyj.E(vxeVarO0, "channel_views");
            int iE30 = qyj.E(vxeVarO0, "channel_forwards");
            int iE31 = qyj.E(vxeVarO0, "view_time");
            int iE32 = qyj.E(vxeVarO0, "options");
            int iE33 = qyj.E(vxeVarO0, "live_until");
            int iE34 = qyj.E(vxeVarO0, "elements");
            int iE35 = qyj.E(vxeVarO0, "reactions");
            int iE36 = qyj.E(vxeVarO0, "delayed_attrs_time_to_fire");
            int iE37 = qyj.E(vxeVarO0, "delayed_attrs_notify_sender");
            int iE38 = qyj.E(vxeVarO0, "reactions_update_time");
            ArrayList arrayList = new ArrayList();
            while (vxeVarO0.M0()) {
                long j = vxeVarO0.getLong(iE);
                long j2 = vxeVarO0.getLong(iE2);
                long j3 = vxeVarO0.getLong(iE3);
                long j4 = vxeVarO0.getLong(iE4);
                long j5 = vxeVarO0.getLong(iE5);
                long j6 = vxeVarO0.getLong(iE6);
                Boolean boolValueOf = null;
                String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                int i2 = (int) vxeVarO0.getLong(iE8);
                toaVar.e().getClass();
                xfa xfaVarB = dwa.b(i2);
                int i3 = (int) vxeVarO0.getLong(iE9);
                toaVar.e().getClass();
                wja wjaVarD = dwa.d(i3);
                boolean z = ((int) vxeVarO0.getLong(iE10)) != 0;
                long j7 = vxeVarO0.getLong(iE11);
                String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                toaVar.e().getClass();
                c46 c46VarA = dwa.a(blob);
                int i4 = iE15;
                int i5 = iE3;
                int i6 = (int) vxeVarO0.getLong(i4);
                int i7 = iE16;
                int i8 = iE14;
                boolean z2 = ((int) vxeVarO0.getLong(i7)) != 0;
                int i9 = iE17;
                int i10 = (int) vxeVarO0.getLong(i9);
                int i11 = iE18;
                long j8 = vxeVarO0.getLong(i11);
                int i12 = iE19;
                boolean z3 = ((int) vxeVarO0.getLong(i12)) != 0;
                int i13 = iE20;
                long j9 = vxeVarO0.getLong(i13);
                int i14 = iE21;
                String strB3 = vxeVarO0.isNull(i14) ? null : vxeVarO0.B0(i14);
                int i15 = iE22;
                String strB4 = vxeVarO0.isNull(i15) ? null : vxeVarO0.B0(i15);
                iE22 = i15;
                int i16 = iE23;
                String strB5 = vxeVarO0.isNull(i16) ? null : vxeVarO0.B0(i16);
                iE23 = i16;
                int i17 = iE24;
                Integer numValueOf = vxeVarO0.isNull(i17) ? null : Integer.valueOf((int) vxeVarO0.getLong(i17));
                toaVar.d().getClass();
                int iA = vo3.a(numValueOf);
                int i18 = iE25;
                long j10 = vxeVarO0.getLong(i18);
                int i19 = iE26;
                long j11 = vxeVarO0.getLong(i19);
                int i20 = iE27;
                int i21 = (int) vxeVarO0.getLong(i20);
                toaVar.e().getClass();
                int iE39 = dwa.e(i21);
                int i22 = iE28;
                long j12 = vxeVarO0.getLong(i22);
                int i23 = iE29;
                int i24 = (int) vxeVarO0.getLong(i23);
                int i25 = iE30;
                int i26 = (int) vxeVarO0.getLong(i25);
                int i27 = iE31;
                long j13 = vxeVarO0.getLong(i27);
                int i28 = iE32;
                int i29 = (int) vxeVarO0.getLong(i28);
                int i30 = iE33;
                long j14 = vxeVarO0.getLong(i30);
                iE32 = i28;
                int i31 = iE34;
                byte[] blob2 = vxeVarO0.getBlob(i31);
                toaVar.e().getClass();
                List listC = dwa.c(blob2);
                iE34 = i31;
                iE35 = iE35;
                kja kjaVarF = toaVar.e().f(vxeVarO0.isNull(iE35) ? null : vxeVarO0.getBlob(iE35));
                int i32 = iE36;
                Long lValueOf = vxeVarO0.isNull(i32) ? null : Long.valueOf(vxeVarO0.getLong(i32));
                int i33 = iE37;
                Integer numValueOf2 = vxeVarO0.isNull(i33) ? null : Integer.valueOf((int) vxeVarO0.getLong(i33));
                if (numValueOf2 != null) {
                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                }
                int i34 = iE38;
                arrayList.add(new gga(j, j2, j3, j4, j5, j6, strB0, xfaVarB, wjaVarD, z, j7, strB1, strB2, c46VarA, i6, z2, i10, j8, z3, j9, strB3, strB4, strB5, iA, j10, j11, iE39, j12, i24, i26, j13, i29, j14, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i34)));
                iE36 = i32;
                iE14 = i8;
                iE16 = i7;
                iE30 = i25;
                iE31 = i27;
                iE33 = i30;
                iE3 = i5;
                iE37 = i33;
                iE38 = i34;
                iE17 = i9;
                iE18 = i11;
                iE19 = i12;
                iE20 = i13;
                iE21 = i14;
                iE24 = i17;
                iE25 = i18;
                iE26 = i19;
                iE27 = i20;
                iE28 = i22;
                iE = iE;
                iE2 = iE2;
                iE15 = i4;
                iE29 = i23;
            }
            return arrayList;
        } finally {
            vxeVarO0.close();
        }
    }

    private final Object c(Object obj) throws Exception {
        String str = (String) this.c;
        long[] jArr = (long[]) this.b;
        toa toaVar = (toa) this.d;
        vxe vxeVarO0 = ((qxe) obj).O0(str);
        try {
            int i = 1;
            for (long j : jArr) {
                vxeVarO0.c(i, j);
                i++;
            }
            int iE = qyj.E(vxeVarO0, "id");
            int iE2 = qyj.E(vxeVarO0, "server_id");
            int iE3 = qyj.E(vxeVarO0, "time");
            int iE4 = qyj.E(vxeVarO0, "update_time");
            int iE5 = qyj.E(vxeVarO0, "sender");
            int iE6 = qyj.E(vxeVarO0, "cid");
            int iE7 = qyj.E(vxeVarO0, "text");
            int iE8 = qyj.E(vxeVarO0, "delivery_status");
            int iE9 = qyj.E(vxeVarO0, "status");
            int iE10 = qyj.E(vxeVarO0, "status_in_process");
            int iE11 = qyj.E(vxeVarO0, "time_local");
            int iE12 = qyj.E(vxeVarO0, "error");
            int iE13 = qyj.E(vxeVarO0, "localized_error");
            int iE14 = qyj.E(vxeVarO0, "attaches");
            int iE15 = qyj.E(vxeVarO0, "media_type");
            int iE16 = qyj.E(vxeVarO0, "detect_share");
            int iE17 = qyj.E(vxeVarO0, "msg_link_type");
            int iE18 = qyj.E(vxeVarO0, "msg_link_id");
            int iE19 = qyj.E(vxeVarO0, "inserted_from_msg_link");
            int iE20 = qyj.E(vxeVarO0, "msg_link_chat_id");
            int iE21 = qyj.E(vxeVarO0, "msg_link_chat_name");
            int iE22 = qyj.E(vxeVarO0, "msg_link_chat_link");
            int iE23 = qyj.E(vxeVarO0, "msg_link_chat_icon_url");
            int iE24 = qyj.E(vxeVarO0, "msg_link_chat_access_type");
            int iE25 = qyj.E(vxeVarO0, "msg_link_out_chat_id");
            int iE26 = qyj.E(vxeVarO0, "msg_link_out_msg_id");
            int iE27 = qyj.E(vxeVarO0, "type");
            int iE28 = qyj.E(vxeVarO0, "chat_id");
            int iE29 = qyj.E(vxeVarO0, "channel_views");
            int iE30 = qyj.E(vxeVarO0, "channel_forwards");
            int iE31 = qyj.E(vxeVarO0, "view_time");
            int iE32 = qyj.E(vxeVarO0, "options");
            int iE33 = qyj.E(vxeVarO0, "live_until");
            int iE34 = qyj.E(vxeVarO0, "elements");
            int iE35 = qyj.E(vxeVarO0, "reactions");
            int iE36 = qyj.E(vxeVarO0, "delayed_attrs_time_to_fire");
            int iE37 = qyj.E(vxeVarO0, "delayed_attrs_notify_sender");
            int iE38 = qyj.E(vxeVarO0, "reactions_update_time");
            ArrayList arrayList = new ArrayList();
            while (vxeVarO0.M0()) {
                long j2 = vxeVarO0.getLong(iE);
                long j3 = vxeVarO0.getLong(iE2);
                long j4 = vxeVarO0.getLong(iE3);
                long j5 = vxeVarO0.getLong(iE4);
                long j6 = vxeVarO0.getLong(iE5);
                long j7 = vxeVarO0.getLong(iE6);
                String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                int i2 = (int) vxeVarO0.getLong(iE8);
                toaVar.e().getClass();
                xfa xfaVarB = dwa.b(i2);
                int i3 = (int) vxeVarO0.getLong(iE9);
                toaVar.e().getClass();
                wja wjaVarD = dwa.d(i3);
                boolean z = ((int) vxeVarO0.getLong(iE10)) != 0;
                long j8 = vxeVarO0.getLong(iE11);
                String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                toaVar.e().getClass();
                c46 c46VarA = dwa.a(blob);
                int i4 = iE15;
                int i5 = iE13;
                int i6 = (int) vxeVarO0.getLong(i4);
                int i7 = iE16;
                boolean z2 = ((int) vxeVarO0.getLong(i7)) != 0;
                int i8 = iE17;
                int i9 = (int) vxeVarO0.getLong(i8);
                int i10 = iE18;
                long j9 = vxeVarO0.getLong(i10);
                int i11 = iE19;
                boolean z3 = ((int) vxeVarO0.getLong(i11)) != 0;
                int i12 = iE20;
                long j10 = vxeVarO0.getLong(i12);
                int i13 = iE21;
                String strB3 = vxeVarO0.isNull(i13) ? null : vxeVarO0.B0(i13);
                int i14 = iE22;
                String strB4 = vxeVarO0.isNull(i14) ? null : vxeVarO0.B0(i14);
                iE22 = i14;
                int i15 = iE23;
                String strB5 = vxeVarO0.isNull(i15) ? null : vxeVarO0.B0(i15);
                iE23 = i15;
                int i16 = iE24;
                Integer numValueOf = vxeVarO0.isNull(i16) ? null : Integer.valueOf((int) vxeVarO0.getLong(i16));
                toaVar.d().getClass();
                int iA = vo3.a(numValueOf);
                int i17 = iE25;
                long j11 = vxeVarO0.getLong(i17);
                int i18 = iE26;
                long j12 = vxeVarO0.getLong(i18);
                int i19 = iE27;
                int i20 = (int) vxeVarO0.getLong(i19);
                toaVar.e().getClass();
                int iE39 = dwa.e(i20);
                int i21 = iE28;
                long j13 = vxeVarO0.getLong(i21);
                int i22 = iE29;
                int i23 = (int) vxeVarO0.getLong(i22);
                int i24 = iE30;
                int i25 = iE14;
                int i26 = (int) vxeVarO0.getLong(i24);
                int i27 = iE31;
                long j14 = vxeVarO0.getLong(i27);
                int i28 = iE32;
                int i29 = (int) vxeVarO0.getLong(i28);
                int i30 = iE33;
                long j15 = vxeVarO0.getLong(i30);
                iE32 = i28;
                int i31 = iE34;
                byte[] blob2 = vxeVarO0.getBlob(i31);
                toaVar.e().getClass();
                List listC = dwa.c(blob2);
                iE34 = i31;
                iE35 = iE35;
                kja kjaVarF = toaVar.e().f(vxeVarO0.isNull(iE35) ? null : vxeVarO0.getBlob(iE35));
                int i32 = iE36;
                Long lValueOf = vxeVarO0.isNull(i32) ? null : Long.valueOf(vxeVarO0.getLong(i32));
                int i33 = iE37;
                Integer numValueOf2 = vxeVarO0.isNull(i33) ? null : Integer.valueOf((int) vxeVarO0.getLong(i33));
                Boolean boolValueOf = numValueOf2 != null ? Boolean.valueOf(numValueOf2.intValue() != 0) : null;
                int i34 = iE38;
                arrayList.add(new gga(j2, j3, j4, j5, j6, j7, strB0, xfaVarB, wjaVarD, z, j8, strB1, strB2, c46VarA, i6, z2, i9, j9, z3, j10, strB3, strB4, strB5, iA, j11, j12, iE39, j13, i23, i26, j14, i29, j15, listC, kjaVarF, lValueOf, boolValueOf, vxeVarO0.getLong(i34)));
                iE37 = i33;
                iE38 = i34;
                iE13 = i5;
                iE15 = i4;
                iE16 = i7;
                iE17 = i8;
                iE18 = i10;
                iE19 = i11;
                iE20 = i12;
                iE21 = i13;
                iE24 = i16;
                iE25 = i17;
                iE26 = i18;
                iE27 = i19;
                iE28 = i21;
                iE14 = i25;
                iE30 = i24;
                iE31 = i27;
                iE33 = i30;
                iE2 = iE2;
                iE29 = i22;
                iE36 = i32;
                iE = iE;
            }
            return arrayList;
        } finally {
            vxeVarO0.close();
        }
    }

    private final Object e(Object obj) {
        e70 e70Var = (e70) this.c;
        String str = ((tkb) this.b).f;
        x60 x60Var = (x60) this.d;
        c60 c60Var = (c60) obj;
        if (e70Var.e != null) {
            b60 b60Var = c60Var.e;
            if (b60Var == null) {
                b60Var = b60.j;
            }
            a60 a60VarA = b60Var.a();
            a60VarA.f = str;
            a60VarA.i = x60Var;
            c60Var.e = new b60(a60VarA);
        }
        if (e70Var.d != null) {
            z60 z60VarA = c60Var.c().a();
            z60VarA.u = str;
            z60VarA.v = x60Var;
            c60Var.d = new d70(z60VarA);
        }
        return sbi.a;
    }

    private final Object h(Object obj) {
        j7c j7cVar = (j7c) this.c;
        String str = (String) this.b;
        kbc kbcVar = (kbc) this.d;
        String strD = xoh.d((String) obj);
        return ((p4c) j7cVar.b.getValue()).k.d(j7c.d(strD, j7cVar.c().c(strD.toString(), j7cVar.c().d(strD, str)), kbcVar));
    }

    private final Object j(Object obj) throws Exception {
        uje ujeVar = (uje) this.c;
        Size size = (Size) this.b;
        g85 g85Var = (g85) this.d;
        Size size2 = (Size) obj;
        GLES20.glViewport(0, 0, size2.getWidth(), size2.getHeight());
        oc9.o("glViewport", new int[0]);
        f2d f2dVar = ujeVar.h;
        hle hleVar = ujeVar.g;
        if (!size.equals(f2dVar.a)) {
            f2dVar.a = size;
        }
        f2d f2dVar2 = ujeVar.h;
        if (!size2.equals(f2dVar2.b)) {
            f2dVar2.b = size2;
        }
        f2d f2dVar3 = ujeVar.h;
        float[] fArr = f2dVar3.c;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        oc9.o("glClearColor", new int[0]);
        GLES20.glClear(16384);
        oc9.o("glClear", 1285);
        u6g u6gVar = f2dVar3.f;
        if (u6gVar != null) {
            u6gVar.i = hleVar.b;
            SurfaceTexture surfaceTexture = (SurfaceTexture) hleVar.c;
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(fArr);
            }
            u6gVar.g = fArr;
            u6gVar.f = f2dVar3.d;
            qg7 qg7Var = (qg7) f2dVar3.e.a;
            qg7Var.getClass();
            if (u6gVar.f == null) {
                float[] fArr2 = new float[16];
                u6gVar.f = fArr2;
                Matrix.setIdentityM(fArr2, 0);
            }
            if (u6gVar.g == null) {
                float[] fArr3 = new float[16];
                u6gVar.g = fArr3;
                Matrix.setIdentityM(fArr3, 0);
            }
            GLES20.glUseProgram(u6gVar.a);
            oc9.o("glUseProgram", new int[0]);
            GLES20.glUniformMatrix4fv(u6gVar.d, 1, false, u6gVar.f, 0);
            oc9.o("glUniformMatrix4fv", new int[0]);
            GLES20.glUniformMatrix4fv(u6gVar.e, 1, false, u6gVar.g, 0);
            oc9.o("glUniformMatrix4fv", new int[0]);
            GLES20.glUniform1i(u6gVar.h, 0);
            oc9.o("glUniform1i", new int[0]);
            GLES20.glActiveTexture(33984);
            oc9.o("glActiveTexture", new int[0]);
            GLES20.glBindTexture(36197, u6gVar.i);
            oc9.o("glBindTexture", new int[0]);
            FloatBuffer floatBuffer = (FloatBuffer) qg7Var.b;
            int i = u6gVar.b;
            oc9.C(i, floatBuffer);
            FloatBuffer floatBuffer2 = (FloatBuffer) qg7Var.c;
            int i2 = u6gVar.c;
            oc9.C(i2, floatBuffer2);
            GLES20.glDrawArrays(5, 0, 4);
            oc9.o("glDrawArrays", 1285);
            GLES20.glDisableVertexAttribArray(i);
            oc9.o("glDisableVertexAttribArray", new int[0]);
            GLES20.glDisableVertexAttribArray(i2);
            oc9.o("glDisableVertexAttribArray", new int[0]);
            GLES20.glBindTexture(36197, 0);
            oc9.o("glBindTexture", new int[0]);
            GLES20.glUseProgram(0);
            oc9.o("glUseProgram", new int[0]);
        }
        boolean zT = g85Var.T();
        sbi sbiVar = sbi.a;
        if (zT) {
            ol olVar = ujeVar.d;
            SurfaceTexture surfaceTexture2 = (SurfaceTexture) hleVar.c;
            olVar.invoke(Long.valueOf(surfaceTexture2 != null ? surfaceTexture2.getTimestamp() : 0L));
            if (!ujeVar.l) {
                ujeVar.l = true;
                ujeVar.c.invoke();
            }
        }
        return sbiVar;
    }

    private final Object k(Object obj) {
        c2f c2fVar = (c2f) this.c;
        String str = (String) this.b;
        Object obj2 = this.d;
        String str2 = c2fVar.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "schedule: cancel for owner=" + str + ", value=" + obj2 + ", scheduledValues=[" + c2fVar.j.keySet() + "])", null);
            }
        }
        return sbi.a;
    }

    private final Object l(Object obj) {
        View view = (View) this.c;
        w5f w5fVar = (w5f) this.b;
        r5f r5fVar = (r5f) this.d;
        ValueAnimator valueAnimator = (ValueAnimator) obj;
        float translationY = 1.0f - (view.getTranslationY() / (yl5.d().getDisplayMetrics().density * 4.0f));
        float translationY2 = view.getTranslationY() == 0.0f ? yl5.d().getDisplayMetrics().density * 4.0f : view.getTranslationY();
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY2, 0.0f);
        valueAnimatorOfFloat.setDuration((long) (200.0f * translationY));
        valueAnimatorOfFloat.setInterpolator(w5f.k);
        valueAnimatorOfFloat.addListener(new scc(w5fVar, r5fVar, view, 2));
        valueAnimatorOfFloat.addUpdateListener(new gte(view, animatedFraction));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    private final Object m(Object obj) {
        TelecomCallService telecomCallService = (TelecomCallService) this.c;
        ue1 ue1Var = (ue1) this.b;
        String str = (String) this.d;
        o02 o02Var = telecomCallService.c;
        if (!o02Var.b) {
            o02Var.b = true;
            ue1Var.m(str);
        }
        return sbi.a;
    }

    private final Object n(Object obj) {
        TelecomCallService telecomCallService = (TelecomCallService) this.c;
        ue1 ue1Var = (ue1) this.b;
        x02 x02Var = (x02) this.d;
        o02 o02Var = telecomCallService.c;
        if (!o02Var.b) {
            o02Var.b = true;
            ue1Var.m(x02Var.s());
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    private final Object o(Object obj) {
        int i;
        h4c h4cVar;
        tw5 tw5Var = (tw5) this.c;
        sfe sfeVar = (sfe) this.b;
        UploadTask uploadTask = (UploadTask) this.d;
        e0i e0iVar = (e0i) obj;
        zui zuiVar = (zui) tw5Var.b;
        wec wecVar = (wec) tw5Var.a;
        vfe vfeVar = (vfe) tw5Var.e;
        njd njdVar = (njd) tw5Var.c;
        boolean z = e0iVar instanceof c0i;
        zzh zzhVar = zzh.a;
        d0i d0iVar = d0i.a;
        if (z) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - vfeVar.a >= 1000) {
                vfeVar.a = jElapsedRealtime;
            }
            if (e0iVar.equals(d0iVar)) {
                ((zid) wecVar.f.getValue()).d(8L);
                i = wecVar.g + 1;
                wecVar.g = i;
                if (i == 1) {
                    h4cVar = (h4c) ((c2a) wecVar.d.e.getValue());
                    h4cVar.q.set(true);
                    if (!h4cVar.g.isEmpty()) {
                        h4cVar.f.post(new tr0(h4cVar, 1));
                    }
                }
            } else if (e0iVar instanceof a0i) {
                tw5.t(wecVar);
            } else if (e0iVar instanceof b0i) {
                ku6.B(zuiVar.c);
                tw5.t(wecVar);
                njdVar.i(new f3i(((b0i) e0iVar).a, zuiVar, (String) tw5Var.d));
            } else if (e0iVar.equals(zzhVar)) {
                ku6.B(zuiVar.c);
                tw5.t(wecVar);
            } else if (!z) {
                ore.o();
                return null;
            }
            if (e0iVar.equals(d0iVar)) {
                sfeVar.a = true;
            } else if (z) {
                uploadTask.c(((c0i) e0iVar).b, false);
            } else if (e0iVar instanceof a0i) {
                uploadTask.c(((a0i) e0iVar).b, true);
            } else {
                if (e0iVar.equals(zzhVar) && !(e0iVar instanceof b0i)) {
                    ore.o();
                    return null;
                }
                uploadTask.a();
            }
            return sbi.a;
        }
        if (!e0iVar.equals(d0iVar) && !e0iVar.equals(zzhVar) && !(e0iVar instanceof a0i) && !(e0iVar instanceof b0i)) {
            ore.o();
            return null;
        }
        njdVar.c(new ylc(e0iVar, null));
        if (e0iVar.equals(d0iVar)) {
            ((zid) wecVar.f.getValue()).d(8L);
            i = wecVar.g + 1;
            wecVar.g = i;
            if (i == 1) {
                h4cVar = (h4c) ((c2a) wecVar.d.e.getValue());
                h4cVar.q.set(true);
                if (!h4cVar.g.isEmpty()) {
                    h4cVar.f.post(new tr0(h4cVar, 1));
                }
            }
        } else if (e0iVar instanceof a0i) {
            tw5.t(wecVar);
        } else if (e0iVar instanceof b0i) {
            ku6.B(zuiVar.c);
            tw5.t(wecVar);
            njdVar.i(new f3i(((b0i) e0iVar).a, zuiVar, (String) tw5Var.d));
        } else if (e0iVar.equals(zzhVar)) {
            ku6.B(zuiVar.c);
            tw5.t(wecVar);
        } else if (!z) {
            ore.o();
            return null;
        }
        if (e0iVar.equals(d0iVar)) {
            sfeVar.a = true;
        } else if (z) {
            uploadTask.c(((c0i) e0iVar).b, false);
        } else if (e0iVar instanceof a0i) {
            uploadTask.c(((a0i) e0iVar).b, true);
        } else {
            if (e0iVar.equals(zzhVar)) {
            }
            uploadTask.a();
        }
        return sbi.a;
    }

    private final Object p(Object obj) {
        k1i k1iVar = (k1i) this.c;
        q36 q36Var = (q36) this.b;
        k0i k0iVar = (k0i) this.d;
        c60 c60Var = (c60) obj;
        String strName = k1iVar.name();
        for (x60 x60Var : x60.values()) {
            if (x60Var.name().equals(strName)) {
                ((tf7) q36Var.d).i(x60Var, k0iVar.c, c60Var);
                return sbi.a;
            }
        }
        x60Var = x60.a;
        ((tf7) q36Var.d).i(x60Var, k0iVar.c, c60Var);
        return sbi.a;
    }

    private final Object q(Object obj) {
        ((tf7) this.c).i((View) obj, (zmi) this.b, Integer.valueOf(((cni) this.d).l()));
        return sbi.a;
    }

    private final Object r(Object obj) {
        gpi gpiVar = (gpi) this.c;
        lsg lsgVar = (lsg) this.b;
        gpiVar.y1.remove(Long.valueOf(lsgVar.c()), (sgg) this.d);
        return sbi.a;
    }

    private final Object s(Object obj) {
        wui wuiVar = (wui) this.c;
        mvi mviVar = (mvi) this.b;
        xf5 xf5Var = (xf5) this.d;
        xui xuiVar = wuiVar.a;
        boolean zRemove = mviVar.d.remove(xuiVar, xf5Var);
        String str = mvi.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "removed(" + zRemove + ") job by key " + xuiVar, null);
            }
        }
        ((zid) mviVar.e.getValue()).a(8L);
        return sbi.a;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        String string;
        String str = "localized_error";
        String str2 = "error";
        switch (this.a) {
            case 0:
                qs1 qs1Var = (qs1) this.c;
                ns1 ns1Var = (ns1) this.b;
                af7 af7Var = (af7) this.d;
                ms1 ms1Var = (ms1) obj;
                ms1Var.getClass();
                try {
                    qs1Var.getClass();
                    EGLSurface eGLSurface = ns1Var.a;
                    ns1Var.a = null;
                    ms1Var.d(eGLSurface);
                    return sbi.a;
                } finally {
                    af7Var.invoke();
                }
            case 1:
                ns1 ns1Var2 = (ns1) this.b;
                Object obj2 = this.d;
                qs1 qs1Var2 = (qs1) this.c;
                ms1 ms1Var2 = (ms1) obj;
                ms1Var2.getClass();
                ns1Var2.b(ms1Var2, obj2);
                qs1Var2.i.add(ns1Var2);
                return sbi.a;
            case 2:
                ((ew3) this.c).n1.invoke(new dna((yv3) this.b, ((MessageModel) this.d).a, (String) obj));
                return sbi.a;
            case 3:
                ((ew3) this.c).n1.invoke(new dna((yv3) this.b, ((MessageModel) this.d).a, (String) obj));
                return sbi.a;
            case 4:
                String str3 = (String) this.c;
                Collection collection = (Collection) this.b;
                g24 g24Var = (g24) this.d;
                vxe vxeVarO0 = ((qxe) obj).O0(str3);
                try {
                    Iterator it = collection.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        vxeVarO0.c(i, ((Number) it.next()).longValue());
                        i++;
                        str = str;
                        str2 = str2;
                    }
                    String str4 = str;
                    String str5 = str2;
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "server_id");
                    int iE3 = qyj.E(vxeVarO0, "time");
                    int iE4 = qyj.E(vxeVarO0, "update_time");
                    int iE5 = qyj.E(vxeVarO0, "sender");
                    int iE6 = qyj.E(vxeVarO0, "cid");
                    int iE7 = qyj.E(vxeVarO0, "text");
                    int iE8 = qyj.E(vxeVarO0, "delivery_status");
                    int iE9 = qyj.E(vxeVarO0, "status");
                    int iE10 = qyj.E(vxeVarO0, "status_in_process");
                    int iE11 = qyj.E(vxeVarO0, "time_local");
                    int iE12 = qyj.E(vxeVarO0, str5);
                    int iE13 = qyj.E(vxeVarO0, str4);
                    int iE14 = qyj.E(vxeVarO0, "attaches");
                    int iE15 = qyj.E(vxeVarO0, "media_type");
                    int iE16 = qyj.E(vxeVarO0, "message_type");
                    int iE17 = qyj.E(vxeVarO0, "detect_share");
                    int iE18 = qyj.E(vxeVarO0, "msg_link_type");
                    int iE19 = qyj.E(vxeVarO0, "msg_link_id");
                    int iE20 = qyj.E(vxeVarO0, "inserted_from_msg_link");
                    int iE21 = qyj.E(vxeVarO0, "msg_link_out_chat_id");
                    int iE22 = qyj.E(vxeVarO0, "msg_link_out_post_id");
                    int iE23 = qyj.E(vxeVarO0, "msg_link_out_msg_id");
                    int iE24 = qyj.E(vxeVarO0, "options");
                    int iE25 = qyj.E(vxeVarO0, "elements");
                    int iE26 = qyj.E(vxeVarO0, "reactions");
                    int iE27 = qyj.E(vxeVarO0, "reactions_update_time");
                    int iE28 = qyj.E(vxeVarO0, "parent_chat_server_id");
                    int iE29 = qyj.E(vxeVarO0, "parent_message_server_id");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        long j = vxeVarO0.getLong(iE);
                        long j2 = vxeVarO0.getLong(iE2);
                        long j3 = vxeVarO0.getLong(iE3);
                        long j4 = vxeVarO0.getLong(iE4);
                        long j5 = vxeVarO0.getLong(iE5);
                        long j6 = vxeVarO0.getLong(iE6);
                        String strB0 = vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7);
                        int i2 = (int) vxeVarO0.getLong(iE8);
                        g24Var.a().getClass();
                        xfa xfaVarB = dwa.b(i2);
                        int i3 = (int) vxeVarO0.getLong(iE9);
                        g24Var.a().getClass();
                        wja wjaVarD = dwa.d(i3);
                        boolean z = ((int) vxeVarO0.getLong(iE10)) != 0;
                        long j7 = vxeVarO0.getLong(iE11);
                        String strB1 = vxeVarO0.isNull(iE12) ? null : vxeVarO0.B0(iE12);
                        String strB2 = vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13);
                        byte[] blob = vxeVarO0.isNull(iE14) ? null : vxeVarO0.getBlob(iE14);
                        g24Var.a().getClass();
                        c46 c46VarA = dwa.a(blob);
                        int i4 = iE15;
                        int i5 = iE3;
                        int i6 = (int) vxeVarO0.getLong(i4);
                        int i7 = iE16;
                        int i8 = (int) vxeVarO0.getLong(i7);
                        g24Var.a().getClass();
                        int iE30 = dwa.e(i8);
                        int i9 = iE17;
                        boolean z2 = ((int) vxeVarO0.getLong(i9)) != 0;
                        int i10 = iE4;
                        int i11 = iE18;
                        int i12 = iE5;
                        int i13 = (int) vxeVarO0.getLong(i11);
                        int i14 = iE19;
                        long j8 = vxeVarO0.getLong(i14);
                        int i15 = iE20;
                        boolean z3 = ((int) vxeVarO0.getLong(i15)) != 0;
                        int i16 = iE21;
                        long j9 = vxeVarO0.getLong(i16);
                        int i17 = iE22;
                        long j10 = vxeVarO0.getLong(i17);
                        int i18 = iE23;
                        long j11 = vxeVarO0.getLong(i18);
                        iE23 = i18;
                        int i19 = iE24;
                        int i20 = (int) vxeVarO0.getLong(i19);
                        int i21 = iE25;
                        byte[] blob2 = vxeVarO0.getBlob(i21);
                        g24Var.a().getClass();
                        List listC = dwa.c(blob2);
                        int i22 = iE26;
                        kja kjaVarF = g24Var.a().f(vxeVarO0.isNull(i22) ? null : vxeVarO0.getBlob(i22));
                        int i23 = iE27;
                        long j12 = vxeVarO0.getLong(i23);
                        int i24 = iE28;
                        iE27 = i23;
                        int i25 = iE29;
                        arrayList.add(new uy3(j, new q24(vxeVarO0.getLong(i24), vxeVarO0.getLong(i25)), j2, j3, j4, j5, j6, strB0, xfaVarB, wjaVarD, z, j7, strB1, strB2, c46VarA, i6, iE30, z2, i13, j8, z3, j9, j10, j11, i20, listC, kjaVarF, j12));
                        iE3 = i5;
                        iE15 = i4;
                        iE16 = i7;
                        iE5 = i12;
                        iE17 = i9;
                        iE18 = i11;
                        iE20 = i15;
                        iE21 = i16;
                        iE22 = i17;
                        iE24 = i19;
                        iE19 = i14;
                        iE25 = i21;
                        iE28 = i24;
                        iE = iE;
                        iE2 = iE2;
                        iE4 = i10;
                        iE26 = i22;
                        iE29 = i25;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            case 5:
                String str6 = (String) this.c;
                long[] jArr = (long[]) this.b;
                g24 g24Var2 = (g24) this.d;
                vxe vxeVarO1 = ((qxe) obj).O0(str6);
                try {
                    int length = jArr.length;
                    int i26 = 1;
                    int i27 = 0;
                    while (i27 < length) {
                        int i28 = i27;
                        vxeVarO1.c(i26, jArr[i28]);
                        i26++;
                        i27 = i28 + 1;
                        str2 = str2;
                    }
                    String str7 = str2;
                    int iE31 = qyj.E(vxeVarO1, "id");
                    int iE32 = qyj.E(vxeVarO1, "server_id");
                    int iE33 = qyj.E(vxeVarO1, "time");
                    int iE34 = qyj.E(vxeVarO1, "update_time");
                    int iE35 = qyj.E(vxeVarO1, "sender");
                    int iE36 = qyj.E(vxeVarO1, "cid");
                    int iE37 = qyj.E(vxeVarO1, "text");
                    int iE38 = qyj.E(vxeVarO1, "delivery_status");
                    int iE39 = qyj.E(vxeVarO1, "status");
                    int iE40 = qyj.E(vxeVarO1, "status_in_process");
                    int iE41 = qyj.E(vxeVarO1, "time_local");
                    int iE42 = qyj.E(vxeVarO1, str7);
                    int iE43 = qyj.E(vxeVarO1, "localized_error");
                    int iE44 = qyj.E(vxeVarO1, "attaches");
                    int iE45 = qyj.E(vxeVarO1, "media_type");
                    int iE46 = qyj.E(vxeVarO1, "message_type");
                    int iE47 = qyj.E(vxeVarO1, "detect_share");
                    int iE48 = qyj.E(vxeVarO1, "msg_link_type");
                    int iE49 = qyj.E(vxeVarO1, "msg_link_id");
                    int iE50 = qyj.E(vxeVarO1, "inserted_from_msg_link");
                    int iE51 = qyj.E(vxeVarO1, "msg_link_out_chat_id");
                    int iE52 = qyj.E(vxeVarO1, "msg_link_out_post_id");
                    int iE53 = qyj.E(vxeVarO1, "msg_link_out_msg_id");
                    int iE54 = qyj.E(vxeVarO1, "options");
                    int iE55 = qyj.E(vxeVarO1, "elements");
                    int iE56 = qyj.E(vxeVarO1, "reactions");
                    int iE57 = qyj.E(vxeVarO1, "reactions_update_time");
                    int iE58 = qyj.E(vxeVarO1, "parent_chat_server_id");
                    int iE59 = qyj.E(vxeVarO1, "parent_message_server_id");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO1.M0()) {
                        long j13 = vxeVarO1.getLong(iE31);
                        long j14 = vxeVarO1.getLong(iE32);
                        long j15 = vxeVarO1.getLong(iE33);
                        long j16 = vxeVarO1.getLong(iE34);
                        long j17 = vxeVarO1.getLong(iE35);
                        long j18 = vxeVarO1.getLong(iE36);
                        String strB3 = vxeVarO1.isNull(iE37) ? null : vxeVarO1.B0(iE37);
                        int i29 = (int) vxeVarO1.getLong(iE38);
                        g24Var2.a().getClass();
                        xfa xfaVarB2 = dwa.b(i29);
                        int i30 = (int) vxeVarO1.getLong(iE39);
                        g24Var2.a().getClass();
                        wja wjaVarD2 = dwa.d(i30);
                        boolean z4 = ((int) vxeVarO1.getLong(iE40)) != 0;
                        long j19 = vxeVarO1.getLong(iE41);
                        String strB4 = vxeVarO1.isNull(iE42) ? null : vxeVarO1.B0(iE42);
                        String strB5 = vxeVarO1.isNull(iE43) ? null : vxeVarO1.B0(iE43);
                        byte[] blob3 = vxeVarO1.isNull(iE44) ? null : vxeVarO1.getBlob(iE44);
                        g24Var2.a().getClass();
                        c46 c46VarA2 = dwa.a(blob3);
                        int i31 = iE45;
                        int i32 = iE33;
                        int i33 = (int) vxeVarO1.getLong(i31);
                        int i34 = iE46;
                        int i35 = (int) vxeVarO1.getLong(i34);
                        g24Var2.a().getClass();
                        int iE60 = dwa.e(i35);
                        int i36 = iE47;
                        boolean z5 = ((int) vxeVarO1.getLong(i36)) != 0;
                        int i37 = iE34;
                        int i38 = iE48;
                        int i39 = iE35;
                        int i40 = (int) vxeVarO1.getLong(i38);
                        int i41 = iE49;
                        long j20 = vxeVarO1.getLong(i41);
                        int i42 = iE50;
                        boolean z6 = ((int) vxeVarO1.getLong(i42)) != 0;
                        int i43 = iE51;
                        long j21 = vxeVarO1.getLong(i43);
                        int i44 = iE52;
                        long j22 = vxeVarO1.getLong(i44);
                        int i45 = iE53;
                        long j23 = vxeVarO1.getLong(i45);
                        iE53 = i45;
                        int i46 = iE54;
                        int i47 = (int) vxeVarO1.getLong(i46);
                        int i48 = iE55;
                        byte[] blob4 = vxeVarO1.getBlob(i48);
                        g24Var2.a().getClass();
                        List listC2 = dwa.c(blob4);
                        int i49 = iE56;
                        kja kjaVarF2 = g24Var2.a().f(vxeVarO1.isNull(i49) ? null : vxeVarO1.getBlob(i49));
                        int i50 = iE57;
                        long j24 = vxeVarO1.getLong(i50);
                        int i51 = iE58;
                        iE57 = i50;
                        int i52 = iE59;
                        arrayList2.add(new uy3(j13, new q24(vxeVarO1.getLong(i51), vxeVarO1.getLong(i52)), j14, j15, j16, j17, j18, strB3, xfaVarB2, wjaVarD2, z4, j19, strB4, strB5, c46VarA2, i33, iE60, z5, i40, j20, z6, j21, j22, j23, i47, listC2, kjaVarF2, j24));
                        iE33 = i32;
                        iE45 = i31;
                        iE46 = i34;
                        iE35 = i39;
                        iE47 = i36;
                        iE48 = i38;
                        iE50 = i42;
                        iE51 = i43;
                        iE52 = i44;
                        iE54 = i46;
                        iE49 = i41;
                        iE55 = i48;
                        iE58 = i51;
                        iE31 = iE31;
                        iE32 = iE32;
                        iE34 = i37;
                        iE56 = i49;
                        iE59 = i52;
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO1.close();
                }
            case 6:
                in4 in4Var = (in4) this.c;
                xi4 xi4Var = (xi4) this.b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d;
                long j25 = xi4Var.b;
                rre rreVar = in4Var.a;
                long jLongValue = ((Number) ch3.G(rreVar, false, true, new w14(in4Var, 6, xi4Var))).longValue();
                ki4 ki4Var = xi4Var.c;
                List list = ki4Var.f;
                int i53 = ki4Var.j;
                if (i53 == 0) {
                    i53 = 1;
                }
                if (i53 == 1 || !ki4Var.a()) {
                    Object obj3 = concurrentHashMap.get(Long.valueOf(j25));
                    if (!(obj3 == null ? false : obj3.equals(Integer.valueOf(list.hashCode())))) {
                        concurrentHashMap.remove(Long.valueOf(j25));
                        lge lgeVar = ve7.a;
                        te7 te7VarB = ve7.b(list);
                        if (te7VarB != null) {
                            long j26 = xi4Var.b;
                            String strB = xoh.b(ki4Var.o);
                            if (ch3.r(strB)) {
                                strB = "";
                            }
                            String strJ = daf.j(strB);
                            String str8 = te7VarB.a;
                            String str9 = te7VarB.b;
                            te7 te7Var = te7VarB.c;
                            ch3.G(rreVar, false, true, new en4(j26, strJ, str8, str9, te7Var != null ? te7Var.a : null, te7Var != null ? te7Var.b : null));
                            concurrentHashMap.put(Long.valueOf(j25), Integer.valueOf(list.hashCode()));
                            gm0.n(in4.class.getName(), "update_fts_title_contacts2 for #" + j25);
                        }
                    }
                }
                return Long.valueOf(jLongValue);
            case 7:
                y85 y85Var = (y85) this.c;
                sv1 sv1Var = (sv1) this.b;
                wfe wfeVar = (wfe) this.d;
                Conversation conversation = (Conversation) obj;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallEngineTag", y85Var + " conversation for answer is created " + conversation.getConversationId(), null);
                    }
                }
                y85Var.O().e = 2;
                String strA = ns4.a(sv1Var.g());
                boolean zA = sv1Var.a();
                tv1 tv1VarE = sv1Var.e();
                sa2 sa2VarO = y85Var.O();
                long j27 = zA ? 2L : 1L;
                String strValueOf = String.valueOf(tv1VarE.a);
                sa2VarO.getClass();
                sa2.c(sa2VarO, "INCOMING_CALL_INIT", strA, strValueOf, Long.valueOf(j27), null, null, false, null, 464);
                y85Var.R().a = 3;
                ff1 ff1Var = (ff1) wfeVar.a;
                if (ff1Var != null) {
                    y85Var.H(new ff1(ff1Var.a, ff1Var.b, ff1Var.c, ff1Var.d, sv1Var.m(), sv1Var.k(), sv1Var.b()));
                }
                return sbi.a;
            case 8:
                y85 y85Var2 = (y85) this.c;
                hhg hhgVar = (hhg) this.b;
                wfe wfeVar2 = (wfe) this.d;
                y85Var2.O().e = 2;
                af7 af7Var2 = hhgVar.d;
                if (af7Var2 != null) {
                    af7Var2.invoke();
                }
                ff1 ff1Var2 = (ff1) wfeVar2.a;
                if (ff1Var2 != null) {
                    y85Var2.H(ff1Var2);
                }
                return sbi.a;
            case 9:
                Void r3 = (Void) obj;
                ((tw5) this.c).s((ri2) this.b, jq4.a((Context) this.d));
                return r3;
            case 10:
                LinkInterceptorWidget linkInterceptorWidget = (LinkInterceptorWidget) this.c;
                String str10 = (String) this.b;
                ar arVar = (ar) this.d;
                Intent intent = (Intent) obj;
                intent.putExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, linkInterceptorWidget.getArgs().getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
                if (str10 != null) {
                    Intent intent2 = arVar.getIntent();
                    Bundle extras = intent2 != null ? intent2.getExtras() : null;
                    intent.putExtra("external_callback_param_arg", str10);
                    if (extras != null && (string = extras.getString("DIGITAL_ID")) != null && intent.putExtra("DIGITAL_ID", string) != null) {
                        intent.putExtra("USER_ID", extras.getLong("USER_ID"));
                        byte[] byteArray = extras.getByteArray("PHOTO_DATA");
                        if (byteArray != null) {
                            intent.putExtra("PHOTO_DATA", byteArray);
                        }
                    }
                }
                return sbi.a;
            case 11:
                m8b m8bVar = (m8b) this.c;
                wfe wfeVar3 = (wfe) this.b;
                vg4 vg4Var = (vg4) obj;
                return Boolean.valueOf((vg4Var.I() || m8bVar.d(vg4Var.v()) || vg4Var.v() == ((s7f) ((qaa) wfeVar3.a).h).t() || (vg4Var.v() != ((sfa) this.d).e && !((qaa) wfeVar3.a).w.containsKey(Long.valueOf(vg4Var.v())))) ? false : true);
            case 12:
                return a(obj);
            case 13:
                return c(obj);
            case 14:
                return e(obj);
            case 15:
                return h(obj);
            case 16:
                ((dge) this.c).g.remove((ele) this.b, (i64) this.d);
                return sbi.a;
            case 17:
                return j(obj);
            case 18:
                return k(obj);
            case 19:
                return l(obj);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return m(obj);
            case 21:
                return n(obj);
            case 22:
                return o(obj);
            case 23:
                return p(obj);
            case 24:
                return q(obj);
            case 25:
                return r(obj);
            case 26:
                return s(obj);
            default:
                String str11 = (String) this.c;
                List list2 = (List) this.b;
                qzj qzjVar = (qzj) this.d;
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO2 = qxeVar.O0(str11);
                try {
                    Iterator it2 = list2.iterator();
                    int i54 = 1;
                    while (it2.hasNext()) {
                        vxeVarO2.B(i54, (String) it2.next());
                        i54++;
                    }
                    int i55 = 0;
                    mw mwVar = new mw(0);
                    mw mwVar2 = new mw(0);
                    while (vxeVarO2.M0()) {
                        String strB6 = vxeVarO2.B0(i55);
                        if (!mwVar.containsKey(strB6)) {
                            mwVar.put(strB6, new ArrayList());
                        }
                        String strB7 = vxeVarO2.B0(0);
                        if (!mwVar2.containsKey(strB7)) {
                            mwVar2.put(strB7, new ArrayList());
                        }
                        i55 = 0;
                    }
                    vxeVarO2.reset();
                    qzjVar.b(qxeVar, mwVar);
                    qzjVar.a(qxeVar, mwVar2);
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO2.M0()) {
                        String strB8 = vxeVarO2.B0(0);
                        kyj kyjVarN = rx8.N((int) vxeVarO2.getLong(1));
                        byte[] blob5 = vxeVarO2.getBlob(2);
                        d25 d25Var = d25.b;
                        arrayList3.add(new lzj(strB8, kyjVarN, f55.i(blob5), vxeVarO2.getLong(14), vxeVarO2.getLong(15), vxeVarO2.getLong(16), new kg4(rx8.k0(vxeVarO2.getBlob(6)), rx8.L((int) vxeVarO2.getLong(5)), ((int) vxeVarO2.getLong(7)) != 0, ((int) vxeVarO2.getLong(8)) != 0, ((int) vxeVarO2.getLong(9)) != 0, ((int) vxeVarO2.getLong(10)) != 0, vxeVarO2.getLong(11), vxeVarO2.getLong(12), rx8.k(vxeVarO2.getBlob(13))), (int) vxeVarO2.getLong(3), rx8.K((int) vxeVarO2.getLong(17)), vxeVarO2.getLong(18), vxeVarO2.getLong(19), (int) vxeVarO2.getLong(20), (int) vxeVarO2.getLong(4), vxeVarO2.getLong(21), (int) vxeVarO2.getLong(22), (List) wm9.N0(mwVar, vxeVarO2.B0(0)), (List) wm9.N0(mwVar2, vxeVarO2.B0(0))));
                        break;
                    }
                    return arrayList3;
                } finally {
                    vxeVarO2.close();
                }
        }
    }

    public /* synthetic */ os1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }
}
