package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.a;
import one.me.mediapicker.MediaPickerScreen;
import one.me.mediapicker.permissions.MediaPickerPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.gallery.permissions.PartialMediaAccessWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m1a extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MediaPickerScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1a(lq4 lq4Var, MediaPickerScreen mediaPickerScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = mediaPickerScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MediaPickerScreen mediaPickerScreen = this.g;
        switch (i) {
            case 0:
                m1a m1aVar = new m1a(lq4Var, mediaPickerScreen, 0);
                m1aVar.f = obj;
                return m1aVar;
            case 1:
                m1a m1aVar2 = new m1a(lq4Var, mediaPickerScreen, 1);
                m1aVar2.f = obj;
                return m1aVar2;
            case 2:
                m1a m1aVar3 = new m1a(lq4Var, mediaPickerScreen, 2);
                m1aVar3.f = obj;
                return m1aVar3;
            case 3:
                m1a m1aVar4 = new m1a(lq4Var, mediaPickerScreen, 3);
                m1aVar4.f = obj;
                return m1aVar4;
            case 4:
                m1a m1aVar5 = new m1a(lq4Var, mediaPickerScreen, 4);
                m1aVar5.f = obj;
                return m1aVar5;
            case 5:
                m1a m1aVar6 = new m1a(lq4Var, mediaPickerScreen, 5);
                m1aVar6.f = obj;
                return m1aVar6;
            case 6:
                m1a m1aVar7 = new m1a(lq4Var, mediaPickerScreen, 6);
                m1aVar7.f = obj;
                return m1aVar7;
            case 7:
                m1a m1aVar8 = new m1a(lq4Var, mediaPickerScreen, 7);
                m1aVar8.f = obj;
                return m1aVar8;
            case 8:
                m1a m1aVar9 = new m1a(lq4Var, mediaPickerScreen, 8);
                m1aVar9.f = obj;
                return m1aVar9;
            default:
                m1a m1aVar10 = new m1a(lq4Var, mediaPickerScreen, 9);
                m1aVar10.f = obj;
                return m1aVar10;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((m1a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((m1a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((m1a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((m1a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((m1a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((m1a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((m1a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((m1a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((m1a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((m1a) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02de  */
    /* JADX WARN: Code duplicated, block: B:78:0x0243  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        j1a j1aVar;
        j1a j1aVar2;
        int i = this.e;
        sbi sbiVar = sbi.a;
        MediaPickerScreen mediaPickerScreen = this.g;
        Object obj2 = null;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (((Boolean) obj3).booleanValue()) {
                    zp3 zp3VarP1 = MediaPickerScreen.p1(mediaPickerScreen);
                    hve hveVar = zp3VarP1.a;
                    if (!cqk.d(zp3VarP1.b(), "partial_media_access_widget")) {
                        hveVar.S(false);
                        lve lveVarE = oc9.e(new PartialMediaAccessWidget(mediaPickerScreen.d.b()), null, null);
                        lveVarE.e("partial_media_access_widget");
                        hveVar.T(lveVarE);
                    }
                } else {
                    MediaPickerScreen.p1(mediaPickerScreen).c();
                }
                View view = mediaPickerScreen.getView();
                if (view != null) {
                    n7j.c(view, 300L, new n1a(mediaPickerScreen, 0));
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                jp4 jp4Var = (jp4) obj3;
                if (jp4Var instanceof fp4) {
                    MediaPickerScreen.o1(mediaPickerScreen, false);
                    rcc rccVarV1 = mediaPickerScreen.v1();
                    CharSequence charSequenceB = ((fp4) jp4Var).a.b(mediaPickerScreen.getContext());
                    if (charSequenceB == null) {
                        charSequenceB = "";
                    }
                    rccVarV1.setTitle(charSequenceB);
                    zp3 zp3Var = (zp3) mediaPickerScreen.c.m(mediaPickerScreen, MediaPickerScreen.J[0]);
                    hve hveVar2 = zp3Var.a;
                    if (cqk.d(zp3Var.b(), "MEDIA_GALLERY_WIDGET_TAG")) {
                        return sbiVar;
                    }
                    hveVar2.S(false);
                    lve lveVarE2 = oc9.e(new MediaGalleryWidget(mediaPickerScreen.d, (ph7) mediaPickerScreen.g.getValue()), null, null);
                    lveVarE2.e("MEDIA_GALLERY_WIDGET_TAG");
                    hveVar2.T(lveVarE2);
                    return sbiVar;
                }
                if (jp4Var instanceof gp4) {
                    MediaPickerScreen.o1(mediaPickerScreen, true);
                    if (!mediaPickerScreen.x1()) {
                        return sbiVar;
                    }
                    zp3 zp3Var2 = (zp3) mediaPickerScreen.c.m(mediaPickerScreen, MediaPickerScreen.J[0]);
                    hve hveVar3 = zp3Var2.a;
                    if (!cqk.d(zp3Var2.b(), "MEDIA_GALLERY_WIDGET_TAG")) {
                        hveVar3.S(false);
                        lve lveVarE3 = oc9.e(new MediaGalleryWidget(mediaPickerScreen.d, (ph7) mediaPickerScreen.g.getValue()), null, null);
                        lveVarE3.e("MEDIA_GALLERY_WIDGET_TAG");
                        hveVar3.T(lveVarE3);
                    }
                    mediaPickerScreen.t1().setVisibility(0);
                    return sbiVar;
                }
                if (!(jp4Var instanceof hp4)) {
                    ore.o();
                    return null;
                }
                MediaPickerScreen.o1(mediaPickerScreen, false);
                zp3 zp3Var3 = (zp3) mediaPickerScreen.c.m(mediaPickerScreen, MediaPickerScreen.J[0]);
                hve hveVar4 = zp3Var3.a;
                if (cqk.d(zp3Var3.b(), "MEDIA_GALLERY_WIDGET_PERMISSION_TAG")) {
                    return sbiVar;
                }
                hveVar4.S(false);
                lve lveVarE4 = oc9.e(new MediaPickerPermissionWidget(mediaPickerScreen.d), null, null);
                lveVarE4.e("MEDIA_GALLERY_WIDGET_PERMISSION_TAG");
                hveVar4.T(lveVarE4);
                return sbiVar;
            case 2:
                ch3.d0(obj);
                fi7 fi7Var = (fi7) obj3;
                zv8[] zv8VarArr = MediaPickerScreen.J;
                if (fi7Var instanceof ai7) {
                    q1a q1aVarW1 = mediaPickerScreen.w1();
                    ai7 ai7Var = (ai7) fi7Var;
                    String str = ai7Var.b;
                    int i2 = ai7Var.a;
                    kb9 kb9Var = ai7Var.c;
                    ic6 ic6Var = q1aVarW1.t;
                    Uri uri = kb9Var.b;
                    ph7 ph7Var = q1aVarW1.c;
                    if (ph7Var.l) {
                        rq9 rq9Var = (rq9) q1aVarW1.i.getValue();
                        rq9Var.getClass();
                        vd7.A().d(rq9Var.a(uri), null);
                        a8j.x(ic6Var, new e1a(kb9Var.a, str, i2, h1h.b(kb9Var).a));
                        return sbiVar;
                    }
                    if (!ph7Var.o) {
                        a8j.x(ic6Var, new h1a(uri.toString()));
                        return sbiVar;
                    }
                    sgg sggVar = q1aVarW1.s;
                    if (sggVar != null && sggVar.isActive()) {
                        return sbiVar;
                    }
                    q1aVarW1.s = a8j.t(q1aVarW1, ((n0c) ((xhh) q1aVarW1.f.getValue())).b(), new gv7(q1aVarW1, kb9Var, null, 10), 2);
                    return sbiVar;
                }
                if (!(fi7Var instanceof ci7)) {
                    if (!(fi7Var instanceof di7)) {
                        if (!(fi7Var instanceof ei7) || !mediaPickerScreen.x1()) {
                            return sbiVar;
                        }
                        mediaPickerScreen.u1().setTranslationX(((ei7) fi7Var).a);
                        mediaPickerScreen.A1();
                        return sbiVar;
                    }
                    if (mediaPickerScreen.r1()) {
                        mediaPickerScreen.E = ((di7) fi7Var).a;
                        mediaPickerScreen.z1();
                    }
                    if (!mediaPickerScreen.x1()) {
                        return sbiVar;
                    }
                    mediaPickerScreen.A1();
                    return sbiVar;
                }
                if (mediaPickerScreen.r1()) {
                    ci7 ci7Var = (ci7) fi7Var;
                    int i3 = ci7Var.b;
                    mediaPickerScreen.F = i3;
                    mediaPickerScreen.q1().f(ci7Var.a, i3);
                }
                if (!mediaPickerScreen.x1()) {
                    return sbiVar;
                }
                joh johVarU1 = mediaPickerScreen.u1();
                ViewGroup.LayoutParams layoutParams = johVarU1.getLayoutParams();
                if (layoutParams == null) {
                    p51.d();
                    return null;
                }
                ci7 ci7Var2 = (ci7) fi7Var;
                layoutParams.width = ci7Var2.a;
                layoutParams.height = ci7Var2.b;
                johVarU1.setLayoutParams(layoutParams);
                return sbiVar;
            case 3:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj3;
                if (!(rbbVar instanceof i1a)) {
                    return sbiVar;
                }
                i1a i1aVar = (i1a) rbbVar;
                zv8[] zv8VarArr2 = MediaPickerScreen.J;
                if (i1aVar instanceof d1a) {
                    d1a d1aVar = (d1a) i1aVar;
                    c1a.b.j(d1aVar.b, d1aVar.c, mediaPickerScreen.s1().k);
                    return sbiVar;
                }
                if (!(i1aVar instanceof h1a)) {
                    if (i1aVar instanceof g1a) {
                        c1a.b.b().f();
                        return sbiVar;
                    }
                    if (i1aVar instanceof e1a) {
                        mediaPickerScreen.I = false;
                        e1a e1aVar = (e1a) i1aVar;
                        c1a.b.k(Long.valueOf(e1aVar.d), e1aVar.e);
                        return sbiVar;
                    }
                    if (i1aVar instanceof f1a) {
                        c1a.b.k(null, 0);
                        return sbiVar;
                    }
                    ore.o();
                    return null;
                }
                hve router = mediaPickerScreen.getRouter();
                zv zvVar = new zv();
                zvVar.addLast(router);
                while (!zvVar.isEmpty()) {
                    ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
                    int iO0 = xw3.O0(arrayListE);
                    while (true) {
                        if (-1 < iO0) {
                            br4 br4Var = ((lve) arrayListE.get(iO0)).a;
                            if (br4Var instanceof j1a) {
                                obj2 = br4Var;
                                j1aVar = (j1a) obj2;
                                if (j1aVar != null) {
                                    j1aVar.Y(((h1a) i1aVar).b);
                                }
                                c1a.b.b().f();
                                return sbiVar;
                            }
                            Iterator it = new upe(br4Var.getChildRouters()).iterator();
                            while (true) {
                                ListIterator listIterator = ((tpe) it).b;
                                if (listIterator.hasPrevious()) {
                                    zvVar.addLast((hve) listIterator.previous());
                                } else {
                                    iO0--;
                                }
                            }
                        }
                    }
                }
                j1aVar = (j1a) obj2;
                if (j1aVar != null) {
                    j1aVar.Y(((h1a) i1aVar).b);
                }
                c1a.b.b().f();
                return sbiVar;
            case 4:
                ch3.d0(obj);
                b1a b1aVar = (b1a) obj3;
                if (b1aVar == null) {
                    ore.o();
                    return null;
                }
                hve router2 = mediaPickerScreen.getRouter();
                zv zvVar2 = new zv();
                zvVar2.addLast(router2);
                while (!zvVar2.isEmpty()) {
                    ArrayList arrayListE2 = ((hve) zvVar2.removeLast()).e();
                    int iO1 = xw3.O0(arrayListE2);
                    while (true) {
                        if (-1 < iO1) {
                            br4 br4Var2 = ((lve) arrayListE2.get(iO1)).a;
                            if (br4Var2 instanceof j1a) {
                                obj2 = br4Var2;
                                j1aVar2 = (j1a) obj2;
                                if (j1aVar2 != null) {
                                    j1aVar2.q(b1aVar.a, b1aVar.b, b1aVar.c);
                                }
                                a8j.x(mediaPickerScreen.w1().t, g1a.b);
                                return sbiVar;
                            }
                            Iterator it2 = new upe(br4Var2.getChildRouters()).iterator();
                            while (true) {
                                ListIterator listIterator2 = ((tpe) it2).b;
                                if (listIterator2.hasPrevious()) {
                                    zvVar2.addLast((hve) listIterator2.previous());
                                } else {
                                    iO1--;
                                }
                            }
                        }
                    }
                }
                j1aVar2 = (j1a) obj2;
                if (j1aVar2 != null) {
                    j1aVar2.q(b1aVar.a, b1aVar.b, b1aVar.c);
                }
                a8j.x(mediaPickerScreen.w1().t, g1a.b);
                return sbiVar;
            case 5:
                ch3.d0(obj);
                zv8[] zv8VarArr3 = MediaPickerScreen.J;
                mediaPickerScreen.u1().setPatternDrawable((Drawable) obj3);
                return sbiVar;
            case 6:
                ch3.d0(obj);
                zv8[] zv8VarArr4 = MediaPickerScreen.J;
                mediaPickerScreen.u1().setIconLayout((foh) obj3);
                return sbiVar;
            case 7:
                ch3.d0(obj);
                edf edfVar = (edf) obj3;
                float fIntValue = 0.0f;
                if (edfVar instanceof ddf) {
                    zv8[] zv8VarArr5 = MediaPickerScreen.J;
                    mediaPickerScreen.v1().setDropdownRotationProgress(0.0f);
                    mediaPickerScreen.y1(0);
                    ow0 ow0Var = mediaPickerScreen.r;
                    zv8[] zv8VarArr6 = MediaPickerScreen.J;
                    zv8 zv8Var = zv8VarArr6[4];
                    ((tp2) ow0Var.getValue()).setVisibility(8);
                    ow0 ow0Var2 = mediaPickerScreen.v;
                    zv8 zv8Var2 = zv8VarArr6[8];
                    ((View) ow0Var2.getValue()).setVisibility(8);
                } else if (edfVar instanceof bdf) {
                    int i4 = ((bdf) edfVar).a;
                    vv vvVar = mediaPickerScreen.s;
                    zv8[] zv8VarArr7 = MediaPickerScreen.J;
                    zv8 zv8Var3 = zv8VarArr7[5];
                    if (i4 > ((Number) vvVar.a(mediaPickerScreen)).intValue()) {
                        mediaPickerScreen.y1(i4);
                    }
                    vv vvVar2 = mediaPickerScreen.s;
                    zv8 zv8Var4 = zv8VarArr7[5];
                    if (((Number) vvVar2.a(mediaPickerScreen)).intValue() > 0) {
                        vv vvVar3 = mediaPickerScreen.s;
                        zv8 zv8Var5 = zv8VarArr7[5];
                        fIntValue = i4 / ((Number) vvVar3.a(mediaPickerScreen)).intValue();
                    }
                    mediaPickerScreen.v1().setDropdownRotationProgress(fIntValue);
                    mediaPickerScreen.G = i4;
                    mediaPickerScreen.z1();
                    mediaPickerScreen.A1();
                }
                return sbiVar;
            case 8:
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                zv8[] zv8VarArr8 = MediaPickerScreen.J;
                if (mediaPickerScreen.r1()) {
                    mediaPickerScreen.q1().setVisibility(zBooleanValue ? 0 : 8);
                }
                if (mediaPickerScreen.x1()) {
                    mediaPickerScreen.u1().setVisibility(zBooleanValue ? 0 : 8);
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                f2e f2eVar = (f2e) obj3;
                if (!(f2eVar instanceof c2e)) {
                    if (f2eVar instanceof e2e) {
                        zv8[] zv8VarArr9 = MediaPickerScreen.J;
                        ((wsc) mediaPickerScreen.j.getValue()).p(new svj(mediaPickerScreen, 1));
                        return sbiVar;
                    }
                    if (!(f2eVar instanceof d2e)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr10 = MediaPickerScreen.J;
                    wsc wscVar = (wsc) mediaPickerScreen.j.getValue();
                    svj svjVar = new svj(mediaPickerScreen, 1);
                    wscVar.getClass();
                    wsc.q(wscVar, svjVar, wsc.i, 171, R.string.permissions_audio_for_video_request, 0, null, 48);
                    return sbiVar;
                }
                hb9 hb9Var = ((c2e) f2eVar).a;
                long j = hb9Var.b;
                int i5 = hb9Var.a;
                zv8[] zv8VarArr11 = MediaPickerScreen.J;
                if (!mediaPickerScreen.x1() || !mediaPickerScreen.r1()) {
                    if (!mediaPickerScreen.r1()) {
                        return sbiVar;
                    }
                    o65.c(c1a.b.b(), ":media-editor", n1g.i(new ylc("initial_id", String.valueOf(j)), new ylc("multi_select", Boolean.FALSE)), null, 4);
                    return sbiVar;
                }
                int i6 = ((vqg) ((e5d) mediaPickerScreen.m.getValue()).r().i()).b;
                if (i5 == 3) {
                    long j2 = hb9Var.f;
                    ghb ghbVar = ew5.b;
                    if (j2 > ew5.g(qe7.O(i6, lw5.MINUTES))) {
                        vnh vnhVar = new vnh(R.string.stories_max_allowed_video_duration, a.n1(new Object[]{Integer.valueOf(i6)}));
                        g8c g8cVar = mediaPickerScreen.H;
                        if (g8cVar != null) {
                            g8cVar.a();
                        }
                        h8c h8cVar = new h8c(mediaPickerScreen);
                        h8cVar.m(vnhVar);
                        h8cVar.h(new w8c(R.drawable.icon_info));
                        mediaPickerScreen.H = h8cVar.p();
                        return sbiVar;
                    }
                }
                mediaPickerScreen.I = mediaPickerScreen.q1().n;
                c1a.b.k(Long.valueOf(j), i5);
                return sbiVar;
        }
    }
}
