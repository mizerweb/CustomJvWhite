package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.sdk.arch.Widget;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class uf3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf3(Object obj, lq4 lq4Var, Long l, g4b g4bVar, q87 q87Var) {
        super(2, lq4Var);
        this.e = 1;
        this.f = obj;
        this.g = l;
        this.h = g4bVar;
        this.i = q87Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                uf3 uf3Var = new uf3((wf3) obj4, (ny8) obj3, (ny8) obj2, lq4Var, 0);
                uf3Var.f = obj;
                return uf3Var;
            case 1:
                return new uf3(this.f, lq4Var, (Long) obj4, (g4b) obj3, (q87) obj2);
            case 2:
                uf3 uf3Var2 = new uf3((fb9) obj4, (List) obj3, (rui) obj2, lq4Var, 2);
                uf3Var2.f = obj;
                return uf3Var2;
            case 3:
                uf3 uf3Var3 = new uf3((Uri) obj4, (k7a) obj3, (g4b) obj2, lq4Var, 3);
                uf3Var3.f = obj;
                return uf3Var3;
            case 4:
                return new uf3(4, lq4Var, (qdb) this.f, (Rect) obj4, (RectF) obj3, (gu4) obj2);
            case 5:
                uf3 uf3Var4 = new uf3((xx6) obj4, lq4Var, (dc) obj3, (ProfileReactionsSettingsScreen) obj2);
                uf3Var4.f = obj;
                return uf3Var4;
            case 6:
                uf3 uf3Var5 = new uf3(lq4Var, (ProfileReactionsSettingsScreen) obj4, (wf4) obj3, (cyb) obj2);
                uf3Var5.f = obj;
                return uf3Var5;
            case 7:
                uf3 uf3Var6 = new uf3((xn6) obj4, (azd) obj3, (syd) obj2, lq4Var, 7);
                uf3Var6.f = obj;
                return uf3Var6;
            case 8:
                return new uf3(8, lq4Var, (x3i) this.f, (CharSequence) obj4, (CharSequence) obj3, (Integer) obj2);
            case 9:
                uf3 uf3Var7 = new uf3((cii) obj4, (AtomicBoolean) obj3, (AtomicReference) obj2, lq4Var, 9);
                uf3Var7.f = obj;
                return uf3Var7;
            case 10:
                uf3 uf3Var8 = new uf3((Bitmap) obj4, (ki1) obj3, (File) obj2, lq4Var, 10);
                uf3Var8.f = obj;
                return uf3Var8;
            default:
                uf3 uf3Var9 = new uf3((String) obj4, (WebAppRootScreen) obj3, (wpj) obj2, lq4Var, 11);
                uf3Var9.f = obj;
                return uf3Var9;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((uf3) create((qv4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                return ((uf3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                ((uf3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((uf3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((uf3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((uf3) create((ec6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ((uf3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((uf3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((uf3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                return ((uf3) create((gka) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((uf3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                ((uf3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01b9  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IOException {
        Bitmap scaledFrameAtTime;
        Object poeVar;
        int iD;
        Object next;
        gka gkaVar;
        xx6 tzVar;
        Object poeVar2;
        int i = 8;
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                wf3 wf3Var = (wf3) this.g;
                AtomicLong atomicLong = wf3Var.t;
                qv4 qv4Var = (qv4) this.f;
                ch3.d0(obj);
                if (!(qv4Var instanceof ov4)) {
                    if (!(qv4Var instanceof pv4)) {
                        ore.o();
                        return null;
                    }
                    pv4 pv4Var = (pv4) qv4Var;
                    long j = pv4Var.b;
                    if (pv4Var.a == atomicLong.get()) {
                        wf3Var.v.B(wf3Var, wf3.A[1], a8j.t(wf3Var, ((n0c) ((xhh) ((ny8) this.h).getValue())).b(), new k23(wf3Var, qv4Var, null, 15), 2));
                        boolean zBooleanValue = ((Boolean) ((e5d) ((ny8) this.i).getValue()).M1.a(e5d.S6[141]).i()).booleanValue();
                        ic6 ic6Var = wf3Var.r;
                        if (zBooleanValue) {
                            a8j.x(ic6Var, new if3(j));
                        } else {
                            a8j.x(ic6Var, new hf3(j));
                        }
                    }
                } else if (((ov4) qv4Var).a == atomicLong.get()) {
                    a8j.x(wf3Var.s, sf3.a);
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                sfa sfaVar = ((fda) this.f).a;
                nkf nkfVar = new nkf(sfaVar.h, sfaVar.a, ((Long) this.g).longValue());
                nkfVar.g = (g4b) this.h;
                nkfVar.f = ((q87) this.i).f;
                return new okf(nkfVar);
            case 2:
                sbi sbiVar2 = sbi.a;
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                List<Bitmap> list = (List) this.h;
                zv8[] zv8VarArr = fb9.i;
                for (Bitmap bitmap : list) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
                ((MediaMetadataRetriever) ((fb9) this.g).f.getValue()).setDataSource(((rui) this.i).d().getPath());
                try {
                    String strExtractMetadata = ((MediaMetadataRetriever) ((fb9) this.g).f.getValue()).extractMetadata(9);
                    ((fb9) this.g).h = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : ((rui) this.i).getDuration();
                    break;
                } catch (Exception e) {
                    gm0.V(((fb9) this.g).b, "Can't extract duration", e);
                    ((fb9) this.g).h = ((rui) this.i).getDuration();
                }
                ArrayList arrayList = new ArrayList();
                int i2 = ((fb9) this.g).g;
                for (int i3 = 0; i3 < i2 && cqk.x(gu4Var); i3++) {
                    long j2 = ((fb9) this.g).h;
                    fb9 fb9Var = (fb9) this.g;
                    long j3 = (j2 / ((long) fb9Var.g)) * ((long) i3) * 1000;
                    int i4 = Build.VERSION.SDK_INT;
                    ifh ifhVar = fb9Var.f;
                    if (i4 >= 27) {
                        MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) ifhVar.getValue();
                        jc7 jc7Var = fb9Var.a;
                        scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j3, 2, jc7Var.b, jc7Var.c);
                    } else {
                        Bitmap frameAtTime = ((MediaMetadataRetriever) ifhVar.getValue()).getFrameAtTime(j3);
                        if (frameAtTime == null) {
                            scaledFrameAtTime = null;
                        } else {
                            jc7 jc7Var2 = fb9Var.a;
                            int i5 = jc7Var2.b;
                            int i6 = jc7Var2.c;
                            int i7 = sb8.j;
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                            float width = i5 / frameAtTime.getWidth();
                            float height = i6 / frameAtTime.getHeight();
                            Matrix matrix = new Matrix();
                            matrix.setScale(width, height, 0.0f, 0.0f);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            canvas.setMatrix(matrix);
                            canvas.drawBitmap(frameAtTime, 0.0f, 0.0f, new Paint(2));
                            frameAtTime.recycle();
                            scaledFrameAtTime = bitmapCreateBitmap;
                        }
                    }
                    if (scaledFrameAtTime != null && cqk.x(gu4Var)) {
                        arrayList.add(scaledFrameAtTime);
                        mjg mjgVar = ((fb9) this.g).d;
                        mjgVar.getClass();
                        mjgVar.j(null, arrayList);
                    }
                }
                return sbiVar2;
            case 3:
                gu4 gu4Var2 = (gu4) this.f;
                ch3.d0(obj);
                Uri uri = (Uri) this.g;
                k7a k7aVar = (k7a) this.h;
                h7a h7aVar = k7aVar.c;
                if (l21.k(k7aVar.f, uri)) {
                    gm0.Y(gu4Var2.getClass().getName(), "try to share internal file!");
                } else {
                    a8j.x(h7aVar.e, new d7a(uri, (g4b) this.i));
                    a8j.x(h7aVar.d, e7a.a);
                }
                return sbi.a;
            case 4:
                ch3.d0(obj);
                String absolutePath = ((qdb) this.f).a().t(((qdb) this.f).n).getAbsolutePath();
                qdb qdbVar = (qdb) this.f;
                yab.i0((gu4) this.i, ((n0c) ((xhh) qdbVar.i.getValue())).b(), 0, new pdb(qdbVar, absolutePath, (Rect) this.g, (RectF) this.h, 1, null), 2);
                return sbi.a;
            case 5:
                sbi sbiVar3 = sbi.a;
                ProfileReactionsSettingsScreen profileReactionsSettingsScreen = (ProfileReactionsSettingsScreen) this.i;
                ec6 ec6Var = (ec6) this.f;
                ch3.d0(obj);
                Object objA = ec6Var.a();
                if (roe.a(objA) == null) {
                    try {
                        ((dc) this.h).clearFocus();
                        zv8[] zv8VarArr2 = ProfileReactionsSettingsScreen.p;
                        profileReactionsSettingsScreen.q1();
                        Object value = profileReactionsSettingsScreen.p1().o.a.getValue();
                        la3 la3Var = value instanceof la3 ? (la3) value : null;
                        cyb cybVar = (cyb) profileReactionsSettingsScreen.n.m(profileReactionsSettingsScreen, ProfileReactionsSettingsScreen.p[5]);
                        if (la3Var != null && la3Var.f && !la3Var.g) {
                            i = 0;
                        }
                        cybVar.setVisibility(i);
                        poeVar = sbiVar3;
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    ch3.d0(poeVar);
                }
                return sbiVar3;
            case 6:
                wf4 wf4Var = (wf4) this.h;
                cyb cybVar2 = (cyb) this.i;
                ProfileReactionsSettingsScreen profileReactionsSettingsScreen2 = (ProfileReactionsSettingsScreen) this.g;
                Object obj2 = this.f;
                ch3.d0(obj);
                zsd zsdVar = (zsd) obj2;
                if (zsdVar instanceof vsd) {
                    h8c h8cVar = (h8c) profileReactionsSettingsScreen2.o.getValue();
                    h8cVar.n(np4.q(wf4Var.getContext(), R.string.profile_edit_reactions_settings_error_title));
                    h8cVar.b(np4.q(wf4Var.getContext(), R.string.profile_edit_reactions_settings_snackbar_error_caption));
                    h8cVar.p();
                } else if (zsdVar instanceof ysd) {
                    cybVar2.setLoading(false);
                    cybVar2.setVisibility(8);
                    profileReactionsSettingsScreen2.getRouter().D();
                } else if (zsdVar instanceof xsd) {
                    cybVar2.setLoading(false);
                    h8c h8cVar2 = (h8c) profileReactionsSettingsScreen2.o.getValue();
                    h8cVar2.n(((xsd) zsdVar).a);
                    h8cVar2.p();
                } else {
                    if (!(zsdVar instanceof wsd)) {
                        ore.o();
                        return null;
                    }
                    profileReactionsSettingsScreen2.getRouter().D();
                }
                return sbi.a;
            case 7:
                sbi sbiVar4 = sbi.a;
                gu4 gu4Var3 = (gu4) this.f;
                ch3.d0(obj);
                String str = ((xn6) this.g).o;
                if (str == null || str.length() == 0) {
                    xn6 xn6Var = (xn6) this.g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "azd", nbh.s(xn6Var.b, "can't sendMsgDelivery for messageId(", ") deliveryToken isNullOrEmpty"), null);
                        }
                    }
                } else {
                    yab.i0(gu4Var3, null, 0, new gv7(15, null, (azd) this.h, (xn6) this.g, str, (syd) this.i), 3);
                }
                return sbiVar4;
            case 8:
                sbi sbiVar5 = sbi.a;
                ch3.d0(obj);
                x3i x3iVar = (x3i) this.f;
                zv8[] zv8VarArr3 = x3i.w;
                lve lveVar = (lve) ww3.D1(x3iVar.e().w1().e());
                br4 br4Var = lveVar != null ? lveVar.a : null;
                Widget widget = br4Var instanceof Widget ? (Widget) br4Var : null;
                if (widget != null) {
                    br4 parentController = widget;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    View view = parentController.getView();
                    ViewParent parent = view != null ? view.getParent() : null;
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 != null) {
                        txb.h.getClass();
                        iD = nhb.d(view2);
                    } else {
                        iD = 0;
                    }
                    int iB = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, iD);
                    h8c h8cVar3 = new h8c(widget);
                    h8cVar3.c(new o8c(0, 0, iB, 11));
                    CharSequence charSequence = (CharSequence) this.g;
                    CharSequence charSequence2 = (CharSequence) this.h;
                    Integer num = (Integer) this.i;
                    if (charSequence == null || r5h.X0(charSequence)) {
                        h8cVar3.n(charSequence2);
                    } else {
                        h8cVar3.n(charSequence);
                        h8cVar3.b(charSequence2);
                    }
                    if (num != null) {
                        h8cVar3.h(new w8c(num.intValue()));
                    }
                    h8cVar3.p();
                }
                return sbiVar5;
            case 9:
                gka gkaVar2 = (gka) this.f;
                ch3.d0(obj);
                oji ojiVar = gkaVar2.d;
                ojiVar.getClass();
                oji ojiVar2 = oji.VIDEO_MESSAGE;
                i3 = ojiVar == ojiVar2 ? 1 : 0;
                cii ciiVar = (cii) this.g;
                if (i3 != 0) {
                    n0j n0jVar = (n0j) ciiVar.m.getValue();
                    n0jVar.getClass();
                    oji ojiVar3 = gkaVar2.d;
                    ojiVar3.getClass();
                    if (ojiVar3 != ojiVar2) {
                        tzVar = new tz(7, gkaVar2);
                    } else {
                        fvi fviVar = gkaVar2.e;
                        List list2 = fviVar != null ? fviVar.d : null;
                        if (list2 == null || list2.isEmpty()) {
                            tzVar = new tz(7, gkaVar2);
                        } else {
                            tzVar = e9i.T(new bye(new l0j(gkaVar2, n0jVar, null)), ((n0c) ((xhh) n0jVar.c.getValue())).b());
                        }
                    }
                    return new hde(tzVar, 13);
                }
                if (gkaVar2.d != oji.VIDEO || !((List) ((f5d) ((wo6) ciiVar.b.getValue())).a.F1.a(e5d.S6[134]).i()).contains(Integer.valueOf(((pk5) ciiVar.n.getValue()).a))) {
                    return new tz(7, new vii(v0m.a(gkaVar2), null));
                }
                cii ciiVar2 = (cii) this.g;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.h;
                AtomicReference atomicReference = (AtomicReference) this.i;
                pia piaVar = gkaVar2.a;
                long j4 = piaVar.a;
                String str2 = piaVar.c;
                oji ojiVar4 = gkaVar2.d;
                ((i50) ciiVar2.o.getValue()).a(new m5e(j4, str2, 0.0f, ojiVar4));
                whi whiVar = new whi(ciiVar2, j4, str2, ojiVar4);
                atomicReference.set(whiVar);
                hfd hfdVar = (hfd) ciiVar2.i.getValue();
                je9 je9Var2 = je9.d;
                String str3 = hfdVar.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str3, "convertVideo: messageUpload = " + gkaVar2, null);
                }
                fvi fviVar2 = gkaVar2.e;
                if (fviVar2 == null) {
                    a70 a70Var = new a70(1);
                    y0e y0eVar = ((nni) hfdVar.b.getValue()).l().a;
                    List listA = ((h4c) ((c2a) hfdVar.c.getValue())).a(gkaVar2.b);
                    if (listA == null) {
                        gkaVar = gkaVar2;
                    } else {
                        Iterator it = listA.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                y0e y0eVar2 = ((d1e) next).a;
                                while (true) {
                                    Object next2 = it.next();
                                    gkaVar = gkaVar2;
                                    y0e y0eVar3 = ((d1e) next2).a;
                                    if (y0eVar2.compareTo(y0eVar3) > 0) {
                                        y0eVar2 = y0eVar3;
                                        next = next2;
                                    }
                                    if (it.hasNext()) {
                                        gkaVar2 = gkaVar;
                                    }
                                }
                            } else {
                                gkaVar = gkaVar2;
                            }
                        } else {
                            gkaVar = gkaVar2;
                            next = null;
                        }
                        d1e d1eVar = (d1e) next;
                        if (d1eVar != null) {
                            y0e y0eVar4 = (y0e) oc9.s(d1eVar.a, y0eVar);
                            String str4 = hfdVar.a;
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                                a4cVar3.c(je9Var2, str4, "MessageUpload.autoQuality, result=" + y0eVar4 + ", defQuality=" + y0eVar + ", maxQuality=" + d1eVar, null);
                            }
                            y0eVar = y0eVar4;
                        }
                        a70Var.a = y0eVar;
                        fviVar2 = new fvi(a70Var);
                        uj6 uj6VarA = gkaVar.a();
                        uj6VarA.e = fviVar2;
                        gkaVar2 = new gka(uj6VarA);
                    }
                    atomicReference = atomicReference;
                    a70Var.a = y0eVar;
                    fviVar2 = new fvi(a70Var);
                    uj6 uj6VarA2 = gkaVar.a();
                    uj6VarA2.e = fviVar2;
                    gkaVar2 = new gka(uj6VarA2);
                } else {
                    atomicReference = atomicReference;
                }
                a70 a70Var2 = new a70(1);
                a70Var2.a = fviVar2.a;
                a70Var2.b = fviVar2.b;
                a70Var2.c = fviVar2.c;
                a70Var2.e = fviVar2.e;
                fvi fviVar3 = new fvi(a70Var2);
                wze wzeVar = new wze(10);
                wzeVar.b = gkaVar2.b;
                wzeVar.c = fviVar3;
                xui xuiVar = new xui(wzeVar);
                ur2 ur2VarM0 = e9i.M0(new bye(new b2f(ciiVar2, gkaVar2, xuiVar, (lq4) null)), new bii(null, ciiVar2, atomicBoolean, j4, str2, ojiVar4, whiVar, atomicReference));
                ns7 ns7Var = (ns7) ciiVar2.l.getValue();
                ns7Var.getClass();
                return new j3(ur2VarM0, 14, new ms7(gkaVar2, ns7Var, xuiVar, null));
            case 10:
                gu4 gu4Var4 = (gu4) this.f;
                ch3.d0(obj);
                Bitmap bitmap2 = (Bitmap) this.g;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() * 0.2f), (int) (bitmap2.getHeight() * 0.2f), true);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 25, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bitmap2.recycle();
                    bitmapCreateScaledBitmap.recycle();
                    byteArrayOutputStream.close();
                    String strEncodeToString = Base64.encodeToString(byteArray, 2);
                    String str5 = "data:" + sya.IMAGE_JPEG + ";base64," + strEncodeToString;
                    yab.i0(gu4Var4, ((n0c) ((xhh) ((ki1) this.h).a.getValue())).b(), 0, new jyf((File) this.i, byteArray, (lq4) null, 13), 2);
                    return sb8.L(Uri.parse(str5).toString());
                } catch (Throwable th2) {
                    bitmap2.recycle();
                    bitmapCreateScaledBitmap.recycle();
                    byteArrayOutputStream.close();
                    throw th2;
                }
            default:
                sbi sbiVar6 = sbi.a;
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.h;
                ch3.d0(obj);
                String str6 = (String) this.g;
                if (str6 == null) {
                    Context context = webAppRootScreen.getContext();
                    g5d g5dVar = (g5d) ((gjf) webAppRootScreen.l.getAccessor().c(97));
                    str6 = String.format(context.getString(R.string.tt_sms_invite_text), Arrays.copyOf(new Object[]{g5dVar.b()}, 1));
                }
                wpj wpjVar = (wpj) this.i;
                try {
                    if (wpjVar == null) {
                        String str7 = sj8.a;
                        sj8.j(webAppRootScreen.getContext(), str6, null);
                    } else {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", (CharSequence) str6);
                        WebAppRootScreen.D1(webAppRootScreen, intent, wpjVar);
                        String str8 = sj8.a;
                        Intent intentB = sj8.b(webAppRootScreen.getContext(), intent);
                        if (intentB != null) {
                            intent = intentB;
                        }
                        webAppRootScreen.getContext().startActivity(intent);
                    }
                    poeVar2 = sbiVar6;
                    break;
                } catch (Throwable th3) {
                    poeVar2 = new poe(th3);
                }
                if (!(poeVar2 instanceof poe)) {
                    zv8[] zv8VarArr4 = WebAppRootScreen.G;
                    webAppRootScreen.K1().evaluateJavascript("window.navigator.__share__receive()", new zcc(1));
                }
                Throwable thA = roe.a(poeVar2);
                if (thA != null) {
                    gm0.l(webAppRootScreen.p, "showShareDialog: shareFile error", thA);
                    webAppRootScreen.K1().evaluateJavascript("window.navigator.__share__receive(abort)", new zcc(1));
                }
                return sbiVar6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf3(lq4 lq4Var, ProfileReactionsSettingsScreen profileReactionsSettingsScreen, wf4 wf4Var, cyb cybVar) {
        super(2, lq4Var);
        this.e = 6;
        this.g = profileReactionsSettingsScreen;
        this.h = wf4Var;
        this.i = cybVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf3(xx6 xx6Var, lq4 lq4Var, dc dcVar, ProfileReactionsSettingsScreen profileReactionsSettingsScreen) {
        super(2, lq4Var);
        this.e = 5;
        this.g = xx6Var;
        this.h = dcVar;
        this.i = profileReactionsSettingsScreen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uf3(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uf3(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
