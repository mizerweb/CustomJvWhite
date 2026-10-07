package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.LegacyConversions$ConversionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class pv9 implements hu9 {
    public final Context a;
    public final iu9 b;
    public final xnf c;
    public final u89 d;
    public final nv9 e;
    public final xx0 f;
    public final Bundle g;
    public final long h;
    public qg7 i;
    public ks9 j;
    public boolean k;
    public boolean l;
    public ov9 m = new ov9();
    public ov9 n = new ov9();
    public boolean o;
    public js8 p;
    public long q;
    public long r;

    public pv9(Context context, iu9 iu9Var, xnf xnfVar, Bundle bundle, Looper looper, xx0 xx0Var) {
        js8 js8Var = new js8();
        js8Var.a = c4d.H.k(r1e.g);
        js8Var.b = fmf.b;
        js8Var.c = h3d.b;
        js8Var.d = ghe.e;
        js8Var.e = Bundle.EMPTY;
        js8Var.f = null;
        this.p = js8Var;
        this.d = new u89(looper, qt3.a, new mv9(this));
        this.a = context;
        this.b = iu9Var;
        this.e = new nv9(this, looper);
        this.c = xnfVar;
        this.g = bundle;
        this.f = xx0Var;
        this.h = 100L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        ghe gheVar = ghe.e;
    }

    public static List Y(ArrayList arrayList) {
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static x2d Z(x2d x2dVar) {
        if (x2dVar == null) {
            return null;
        }
        if (x2dVar.d > 0.0f) {
            return x2dVar;
        }
        lvb.G0("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        long j = x2dVar.c;
        long j2 = x2dVar.e;
        int i = x2dVar.f;
        CharSequence charSequence = x2dVar.g;
        List list = x2dVar.i;
        if (list != null) {
            arrayList.addAll(list);
        }
        return new x2d(x2dVar.a, x2dVar.b, j, 1.0f, j2, i, charSequence, x2dVar.h, arrayList, x2dVar.j, x2dVar.k);
    }

    public static k3d a0(int i, ry9 ry9Var, long j, boolean z) {
        return new k3d(null, i, ry9Var, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    @Override // defpackage.hu9
    public final void A(boolean z) {
        if (z != H()) {
            c4d c4dVarJ = ((c4d) this.p.a).j(z);
            js8 js8Var = this.p;
            i0(new js8(c4dVarJ, (fmf) js8Var.b, (h3d) js8Var.c, (c98) js8Var.d, (Bundle) js8Var.e, null), null, null);
        }
        ft0 ft0VarN = this.i.n();
        u98 u98Var = mz8.a;
        Bundle bundle = new Bundle();
        bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, z ? 1 : 0);
        ft0VarN.B(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
    }

    @Override // defpackage.hu9
    public final int B() {
        return F();
    }

    @Override // defpackage.hu9
    public final int C() {
        return -1;
    }

    @Override // defpackage.hu9
    public final void D(int i) {
        g0(i, 0L);
    }

    @Override // defpackage.hu9
    public final long E() {
        return e();
    }

    @Override // defpackage.hu9
    public final int F() {
        return ((c4d) this.p.a).c.a.b;
    }

    @Override // defpackage.hu9
    public final void G(ry9 ry9Var) {
        t(ry9Var);
    }

    @Override // defpackage.hu9
    public final boolean H() {
        return ((c4d) this.p.a).i;
    }

    @Override // defpackage.hu9
    public final void I() {
        ((MediaController.TransportControls) this.i.n().a).fastForward();
    }

    @Override // defpackage.hu9
    public final void J() {
        ((MediaController.TransportControls) this.i.n().a).rewind();
    }

    @Override // defpackage.hu9
    public final void K(List list) {
        x(0, -9223372036854775807L, list);
    }

    @Override // defpackage.hu9
    public final fmf L() {
        return (fmf) this.p.b;
    }

    @Override // defpackage.hu9
    public final int M() {
        return -1;
    }

    @Override // defpackage.hu9
    public final void N(int i) {
        f0(i, i + 1);
    }

    @Override // defpackage.hu9
    public final int O() {
        return -1;
    }

    @Override // defpackage.hu9
    public final void P(p70 p70Var, boolean z) {
        lvb.G0("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // defpackage.hu9
    public final h3d Q() {
        return (h3d) this.p.c;
    }

    @Override // defpackage.hu9
    public final c98 R() {
        return (c98) this.p.d;
    }

    @Override // defpackage.hu9
    public final void S(j3d j3dVar) {
        this.d.a(j3dVar);
    }

    @Override // defpackage.hu9
    public final Bundle T() {
        return this.g;
    }

    @Override // defpackage.hu9
    public final long U() {
        return ((c4d) this.p.a).c.e;
    }

    @Override // defpackage.hu9
    public final void V(j3d j3dVar) {
        this.d.e(j3dVar);
    }

    @Override // defpackage.hu9
    public final e89 W(emf emfVar) {
        Bundle bundle = emfVar.c;
        Bundle bundle2 = Bundle.EMPTY;
        if (this.i == null) {
            return rx8.J(new wmf(-100));
        }
        if (!bundle2.isEmpty()) {
            if (bundle.isEmpty()) {
                bundle = bundle2;
            } else {
                Bundle bundle3 = new Bundle(bundle);
                bundle3.putAll(bundle2);
                bundle = bundle3;
            }
        }
        this.i.n().B(emfVar.b, bundle);
        return rx8.J(new wmf(0));
    }

    @Override // defpackage.hu9
    public final b0a X() {
        ry9 ry9VarQ = ((c4d) this.p.a).q();
        return ry9VarQ == null ? b0a.K : ry9VarQ.d;
    }

    @Override // defpackage.hu9
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.hu9
    public final void b(float f) {
        lvb.G0("MCImplLegacy", "Session doesn't support setting player volume");
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0202  */
    /* JADX WARN: Code duplicated, block: B:117:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x021b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0228 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x022c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0253  */
    /* JADX WARN: Code duplicated, block: B:130:0x025e  */
    /* JADX WARN: Code duplicated, block: B:131:0x025f A[DONT_INVERT, PHI: r4
  0x025f: PHI (r4v15 int) = (r4v14 int), (r4v23 int) binds: [B:124:0x0226, B:130:0x025e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x0261  */
    /* JADX WARN: Code duplicated, block: B:134:0x026b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0271  */
    /* JADX WARN: Code duplicated, block: B:137:0x0273  */
    /* JADX WARN: Code duplicated, block: B:140:0x028c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0297  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:150:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:169:0x0330  */
    /* JADX WARN: Code duplicated, block: B:174:0x033f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0341  */
    /* JADX WARN: Code duplicated, block: B:181:0x0356  */
    /* JADX WARN: Code duplicated, block: B:184:0x0363  */
    /* JADX WARN: Code duplicated, block: B:186:0x036b  */
    /* JADX WARN: Code duplicated, block: B:197:0x039f  */
    /* JADX WARN: Code duplicated, block: B:200:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:203:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:206:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:209:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:212:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:215:0x0402  */
    /* JADX WARN: Code duplicated, block: B:218:0x040c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0415  */
    /* JADX WARN: Code duplicated, block: B:222:0x0418  */
    /* JADX WARN: Code duplicated, block: B:225:0x0432  */
    /* JADX WARN: Code duplicated, block: B:227:0x043f  */
    /* JADX WARN: Code duplicated, block: B:229:0x0446  */
    /* JADX WARN: Code duplicated, block: B:231:0x044f  */
    /* JADX WARN: Code duplicated, block: B:234:0x045d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0471  */
    /* JADX WARN: Code duplicated, block: B:239:0x047a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x047c  */
    /* JADX WARN: Code duplicated, block: B:241:0x047f  */
    /* JADX WARN: Code duplicated, block: B:244:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:250:0x04b9 A[LOOP:4: B:248:0x04b5->B:250:0x04b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:255:0x04da  */
    /* JADX WARN: Code duplicated, block: B:259:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:262:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:264:0x0506  */
    /* JADX WARN: Code duplicated, block: B:268:0x0516  */
    /* JADX WARN: Code duplicated, block: B:269:0x0522  */
    /* JADX WARN: Code duplicated, block: B:272:0x0535  */
    /* JADX WARN: Code duplicated, block: B:274:0x0541  */
    /* JADX WARN: Code duplicated, block: B:275:0x054d  */
    /* JADX WARN: Code duplicated, block: B:278:0x055f  */
    /* JADX WARN: Code duplicated, block: B:279:0x0562  */
    /* JADX WARN: Code duplicated, block: B:282:0x056b  */
    /* JADX WARN: Code duplicated, block: B:283:0x056d  */
    /* JADX WARN: Code duplicated, block: B:286:0x0581  */
    /* JADX WARN: Code duplicated, block: B:288:0x0586  */
    /* JADX WARN: Code duplicated, block: B:289:0x058d  */
    /* JADX WARN: Code duplicated, block: B:291:0x0590  */
    /* JADX WARN: Code duplicated, block: B:293:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:295:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:299:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:305:0x05e3 A[PHI: r1
  0x05e3: PHI (r1v65 pmf) = (r1v21 pmf), (r1v25 pmf) binds: [B:304:0x05e1, B:317:0x060a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:306:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:308:0x05f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:321:0x0638  */
    /* JADX WARN: Code duplicated, block: B:322:0x063a  */
    /* JADX WARN: Code duplicated, block: B:326:0x0647  */
    /* JADX WARN: Code duplicated, block: B:327:0x064a  */
    /* JADX WARN: Code duplicated, block: B:329:0x0653  */
    /* JADX WARN: Code duplicated, block: B:330:0x065a  */
    /* JADX WARN: Code duplicated, block: B:332:0x0664  */
    /* JADX WARN: Code duplicated, block: B:333:0x0667  */
    /* JADX WARN: Code duplicated, block: B:336:0x066d  */
    /* JADX WARN: Code duplicated, block: B:338:0x0671  */
    /* JADX WARN: Code duplicated, block: B:339:0x0673 A[PHI: r25
  0x0673: PHI (r25v11 pmf) = (r25v3 pmf), (r25v12 pmf) binds: [B:358:0x06b8, B:338:0x0671] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:342:0x0684  */
    /* JADX WARN: Code duplicated, block: B:343:0x0686 A[Catch: LegacyConversions$ConversionException -> 0x06be, TryCatch #1 {LegacyConversions$ConversionException -> 0x06be, blocks: (B:340:0x0675, B:346:0x068f, B:347:0x0692, B:343:0x0686), top: B:442:0x0675 }] */
    /* JADX WARN: Code duplicated, block: B:347:0x0692 A[Catch: LegacyConversions$ConversionException -> 0x06be, TRY_LEAVE, TryCatch #1 {LegacyConversions$ConversionException -> 0x06be, blocks: (B:340:0x0675, B:346:0x068f, B:347:0x0692, B:343:0x0686), top: B:442:0x0675 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:352:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:353:0x06ae A[PHI: r25
  0x06ae: PHI (r25v6 pmf) = (r25v5 pmf), (r25v7 pmf) binds: [B:355:0x06b2, B:352:0x06ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:354:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:356:0x06b4 A[PHI: r25
  0x06b4: PHI (r25v4 pmf) = (r25v3 pmf), (r25v5 pmf) binds: [B:358:0x06b8, B:355:0x06b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:357:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:364:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:365:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:369:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:371:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:373:0x0705  */
    /* JADX WARN: Code duplicated, block: B:374:0x0707  */
    /* JADX WARN: Code duplicated, block: B:377:0x0715 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:380:0x071a  */
    /* JADX WARN: Code duplicated, block: B:383:0x0727  */
    /* JADX WARN: Code duplicated, block: B:384:0x072a  */
    /* JADX WARN: Code duplicated, block: B:386:0x0732  */
    /* JADX WARN: Code duplicated, block: B:387:0x0735  */
    /* JADX WARN: Code duplicated, block: B:392:0x0754  */
    /* JADX WARN: Code duplicated, block: B:393:0x0758  */
    /* JADX WARN: Code duplicated, block: B:396:0x07e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:399:0x07ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:400:0x07ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:402:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:404:0x0801  */
    /* JADX WARN: Code duplicated, block: B:407:0x080a  */
    /* JADX WARN: Code duplicated, block: B:410:0x0813  */
    /* JADX WARN: Code duplicated, block: B:413:0x0823 A[LOOP:3: B:408:0x080b->B:413:0x0823, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:416:0x0829  */
    /* JADX WARN: Code duplicated, block: B:417:0x0830  */
    /* JADX WARN: Code duplicated, block: B:419:0x083a  */
    /* JADX WARN: Code duplicated, block: B:421:0x084a  */
    /* JADX WARN: Code duplicated, block: B:424:0x0851  */
    /* JADX WARN: Code duplicated, block: B:426:0x085c  */
    /* JADX WARN: Code duplicated, block: B:428:0x0864  */
    /* JADX WARN: Code duplicated, block: B:430:0x086a  */
    /* JADX WARN: Code duplicated, block: B:433:0x088c  */
    /* JADX WARN: Code duplicated, block: B:435:0x089b  */
    /* JADX WARN: Code duplicated, block: B:436:0x089e  */
    /* JADX WARN: Code duplicated, block: B:442:0x0675 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0826 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0821 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:? A[LOOP:5: B:253:0x04d4->B:460:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x0508 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    public final void b0(boolean z, ov9 ov9Var) {
        boolean z2;
        ou9 ou9Var;
        boolean z3;
        int i;
        r1e r1eVar;
        long j;
        long j2;
        boolean z4;
        int iO;
        boolean z5;
        int i2;
        b0a b0aVarI;
        c98 c98Var;
        r1e r1eVar2;
        int i3;
        ry9 ry9Var;
        ry9 ry9VarH;
        c98 c98Var2;
        int size;
        q1e q1eVar;
        boolean z6;
        b0a b0aVar;
        ou9 ou9Var2;
        int i4;
        r1e r1eVar3;
        boolean z7;
        long j3;
        h3d h3dVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        b0a b0aVar2;
        int iP;
        boolean zR;
        HashSet<emf> hashSet;
        ghe gheVar;
        int i5;
        Object[] objArrCopyOf;
        Iterator it;
        int i6;
        int i7;
        boolean z8;
        pmf pmfVar;
        ghe gheVarK;
        Bundle bundle;
        int i8;
        ay3 ay3Var;
        Bundle bundle2;
        boolean z9;
        String string;
        int iB;
        Uri uri;
        String scheme;
        fmf fmfVar;
        c98 c98Var3;
        Bundle bundle3;
        int i9;
        boolean z10;
        s2d s2dVar;
        ou9 ou9Var3;
        p70 p70Var;
        boolean z11;
        int i10;
        int i11;
        long jC;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        ok5 ok5VarB;
        int iH;
        boolean z15;
        r1e r1eVar4;
        ry9 ry9Var2;
        c4d c4dVar;
        ov9 ov9Var2;
        js8 js8Var;
        long j4;
        Integer num;
        boolean zP;
        ry9 ry9VarQ;
        q1e q1eVar2;
        int i13;
        c98 c98Var4;
        boolean z16;
        boolean z17;
        Integer num2;
        long jB;
        long jB2;
        Integer num3;
        boolean z18;
        int i14;
        t2a t2aVar;
        Bitmap bitmap;
        d0a d0aVar;
        Bitmap bitmapF;
        if (this.k || !this.l) {
            return;
        }
        ov9 ov9Var3 = this.m;
        js8 js8Var2 = this.p;
        String packageName = ((mu9) this.i.b).a.getPackageName();
        long flags = ((mu9) this.i.b).a.getFlags();
        boolean z19 = ((mu9) this.i.b).e.a() != null;
        int ratingType = ((mu9) this.i.b).a.getRatingType();
        iu9 iu9Var = this.b;
        long j5 = iu9Var.g;
        boolean z20 = this.o;
        d0a d0aVar2 = ov9Var3.c;
        x2d x2dVar = ov9Var3.b;
        List list = ov9Var3.d;
        if (d0aVar2 == null || (d0aVar = ov9Var.c) == null || d0aVar2.c == null || (bitmapF = d0aVar.f()) == null) {
            z2 = z19;
        } else {
            z2 = z19;
            Bitmap bitmapF2 = d0aVar2.f();
            if (bitmapF2 != null && bitmapF.sameAs(bitmapF2)) {
                d0aVar.c = d0aVar2.c;
            }
        }
        List list2 = ov9Var.d;
        Bundle bundle4 = ov9Var.h;
        x2d x2dVar2 = ov9Var.b;
        d0a d0aVar3 = ov9Var.c;
        ou9 ou9Var4 = ov9Var.a;
        if (list != list2) {
            HashMap map = new HashMap();
            int i15 = 0;
            while (i15 < list.size()) {
                t2a t2aVar2 = (t2a) list.get(i15);
                ou9 ou9Var5 = ou9Var4;
                if (t2aVar2.a.e != null) {
                    map.put(Long.valueOf(t2aVar2.b), t2aVar2);
                }
                i15++;
                ou9Var4 = ou9Var5;
            }
            ou9Var = ou9Var4;
            int i16 = 0;
            while (i16 < list2.size()) {
                t2a t2aVar3 = (t2a) list2.get(i16);
                if (t2aVar3.a.e == null || (t2aVar = (t2a) map.get(Long.valueOf(t2aVar3.b))) == null) {
                    i14 = i16;
                } else {
                    uv9 uv9Var = t2aVar3.a;
                    uv9 uv9Var2 = t2aVar.a;
                    uv9Var.getClass();
                    if (uv9Var2.f == null || (bitmap = uv9Var.e) == null) {
                        i14 = i16;
                    } else {
                        i14 = i16;
                        Bitmap bitmap2 = uv9Var2.e;
                        if (bitmap2 != null && bitmap.sameAs(bitmap2)) {
                            uv9Var.f = uv9Var2.f;
                        }
                    }
                }
                i16 = i14 + 1;
            }
        } else {
            ou9Var = ou9Var4;
        }
        boolean z21 = list != list2;
        if (z21) {
            r1e r1eVar5 = r1e.g;
            oc9.p(4, "initialCapacity");
            Object[] objArrCopyOf2 = new Object[4];
            int i17 = 0;
            int i18 = 0;
            while (i18 < list2.size()) {
                t2a t2aVar4 = (t2a) list2.get(i18);
                u98 u98Var = mz8.a;
                boolean z22 = z21;
                int i19 = ratingType;
                q1e q1eVar3 = new q1e(mz8.g(t2aVar4.a), t2aVar4.b, -9223372036854775807L);
                int i20 = i17 + 1;
                int iB2 = r88.b(objArrCopyOf2.length, i20);
                if (iB2 > objArrCopyOf2.length) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iB2);
                }
                objArrCopyOf2[i17] = q1eVar3;
                i18++;
                i17 = i20;
                z21 = z22;
                ratingType = i19;
            }
            z3 = z21;
            i = ratingType;
            r1eVar = new r1e(c98.j(objArrCopyOf2, i17), null);
        } else {
            z3 = z21;
            i = ratingType;
            r1e r1eVar6 = (r1e) ((c4d) js8Var2.a).j;
            r1eVar = new r1e(r1eVar6.e, r1eVar6.f);
        }
        boolean z23 = ov9Var3.c != d0aVar3 || z;
        long j6 = x2dVar == null ? -1L : x2dVar.j;
        if (x2dVar2 == null) {
            j2 = -1;
            j = -1;
        } else {
            j = -1;
            j2 = x2dVar2.j;
        }
        boolean z24 = j6 != j2 || z;
        long jC2 = mz8.c(d0aVar3);
        if (z23 || z24 || z3) {
            if (list2 == null || j2 == j) {
                z4 = z23;
            } else {
                z4 = z23;
                long j7 = j2;
                iO = 0;
                while (true) {
                    if (iO < list2.size()) {
                        if (((t2a) list2.get(iO)).b == j7) {
                            break;
                        } else {
                            iO++;
                        }
                    }
                }
                if (d0aVar3 != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 || !z4) {
                    i2 = i;
                    if (z5 && z24) {
                        b0aVarI = iO == -1 ? b0a.K : mz8.i(((t2a) list2.get(iO)).a, i2);
                    } else {
                        b0aVarI = ((c4d) js8Var2.a).B;
                    }
                } else {
                    i2 = i;
                    b0aVarI = mz8.j(d0aVar3, i2);
                }
                c98Var = r1eVar.e;
                r1eVar2 = r1eVar;
                i3 = -1;
                if (iO != -1) {
                    if (iO != i3) {
                        b0aVarI = b0aVarI;
                        r1eVar = new r1e(c98Var, null);
                        if (z5) {
                            if (iO >= r1eVar.o()) {
                                ry9Var = null;
                            } else {
                                ry9Var = r1eVar.r(iO).a;
                            }
                            ry9Var.getClass();
                            ry9VarH = mz8.h(ry9Var.a, d0aVar3, i2);
                            c98Var2 = r1eVar.e;
                            size = c98Var2.size();
                            q1eVar = r1eVar.f;
                            if (iO >= size || (iO == c98Var2.size() && q1eVar != null)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            lvb.R(z6);
                            if (iO == c98Var2.size()) {
                                r1eVar = new r1e(c98Var2, new q1e(ry9VarH, -1L, jC2));
                            } else {
                                long j8 = ((q1e) c98Var2.get(iO)).b;
                                z88 z88Var = new z88(4);
                                z88Var.f(c98Var2.subList(0, iO));
                                z88Var.c(new q1e(ry9VarH, j8, jC2));
                                z88Var.f(c98Var2.subList(iO + 1, c98Var2.size()));
                                r1eVar = new r1e(z88Var.h(), q1eVar);
                            }
                        }
                    } else {
                        r1eVar = r1eVar2;
                        iO = 0;
                    }
                } else if (z4) {
                    i3 = -1;
                    if (iO != i3) {
                        b0aVarI = b0aVarI;
                        r1eVar = new r1e(c98Var, null);
                        if (z5) {
                            if (iO >= r1eVar.o()) {
                                ry9Var = null;
                            } else {
                                ry9Var = r1eVar.r(iO).a;
                            }
                            ry9Var.getClass();
                            ry9VarH = mz8.h(ry9Var.a, d0aVar3, i2);
                            c98Var2 = r1eVar.e;
                            size = c98Var2.size();
                            q1eVar = r1eVar.f;
                            if (iO >= size) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            lvb.R(z6);
                            if (iO == c98Var2.size()) {
                                r1eVar = new r1e(c98Var2, new q1e(ry9VarH, -1L, jC2));
                            } else {
                                long j9 = ((q1e) c98Var2.get(iO)).b;
                                z88 z88Var2 = new z88(4);
                                z88Var2.f(c98Var2.subList(0, iO));
                                z88Var2.c(new q1e(ry9VarH, j9, jC2));
                                z88Var2.f(c98Var2.subList(iO + 1, c98Var2.size()));
                                r1eVar = new r1e(z88Var2.h(), q1eVar);
                            }
                        }
                    } else {
                        r1eVar = r1eVar2;
                        iO = 0;
                    }
                } else if (z5) {
                    lvb.G0("MCImplLegacy", "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
                    r1eVar = new r1e(c98Var, new q1e(mz8.h(d0aVar3.k(MediaMetadataCompat.METADATA_KEY_MEDIA_ID), d0aVar3, i2), -1L, jC2));
                    iO = r1eVar.o() - 1;
                    b0aVarI = b0aVarI;
                } else {
                    r1eVar = new r1e(c98Var, null);
                    iO = 0;
                }
                b0aVar = b0aVarI;
            }
            iO = -1;
            if (d0aVar3 != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                i2 = i;
                if (z5) {
                    b0aVarI = ((c4d) js8Var2.a).B;
                } else {
                    b0aVarI = ((c4d) js8Var2.a).B;
                }
            } else {
                i2 = i;
                if (z5) {
                    b0aVarI = ((c4d) js8Var2.a).B;
                } else {
                    b0aVarI = ((c4d) js8Var2.a).B;
                }
            }
            c98Var = r1eVar.e;
            r1eVar2 = r1eVar;
            i3 = -1;
            if (iO != -1) {
                if (iO != i3) {
                    b0aVarI = b0aVarI;
                    r1eVar = new r1e(c98Var, null);
                    if (z5) {
                        if (iO >= r1eVar.o()) {
                            ry9Var = null;
                        } else {
                            ry9Var = r1eVar.r(iO).a;
                        }
                        ry9Var.getClass();
                        ry9VarH = mz8.h(ry9Var.a, d0aVar3, i2);
                        c98Var2 = r1eVar.e;
                        size = c98Var2.size();
                        q1eVar = r1eVar.f;
                        if (iO >= size) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        lvb.R(z6);
                        if (iO == c98Var2.size()) {
                            r1eVar = new r1e(c98Var2, new q1e(ry9VarH, -1L, jC2));
                        } else {
                            long j10 = ((q1e) c98Var2.get(iO)).b;
                            z88 z88Var3 = new z88(4);
                            z88Var3.f(c98Var2.subList(0, iO));
                            z88Var3.c(new q1e(ry9VarH, j10, jC2));
                            z88Var3.f(c98Var2.subList(iO + 1, c98Var2.size()));
                            r1eVar = new r1e(z88Var3.h(), q1eVar);
                        }
                    }
                } else {
                    r1eVar = r1eVar2;
                    iO = 0;
                }
            } else if (z4) {
                i3 = -1;
                if (iO != i3) {
                    b0aVarI = b0aVarI;
                    r1eVar = new r1e(c98Var, null);
                    if (z5) {
                        if (iO >= r1eVar.o()) {
                            ry9Var = null;
                        } else {
                            ry9Var = r1eVar.r(iO).a;
                        }
                        ry9Var.getClass();
                        ry9VarH = mz8.h(ry9Var.a, d0aVar3, i2);
                        c98Var2 = r1eVar.e;
                        size = c98Var2.size();
                        q1eVar = r1eVar.f;
                        if (iO >= size) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        lvb.R(z6);
                        if (iO == c98Var2.size()) {
                            r1eVar = new r1e(c98Var2, new q1e(ry9VarH, -1L, jC2));
                        } else {
                            long j11 = ((q1e) c98Var2.get(iO)).b;
                            z88 z88Var4 = new z88(4);
                            z88Var4.f(c98Var2.subList(0, iO));
                            z88Var4.c(new q1e(ry9VarH, j11, jC2));
                            z88Var4.f(c98Var2.subList(iO + 1, c98Var2.size()));
                            r1eVar = new r1e(z88Var4.h(), q1eVar);
                        }
                    }
                } else {
                    r1eVar = r1eVar2;
                    iO = 0;
                }
            } else if (z5) {
                lvb.G0("MCImplLegacy", "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
                r1eVar = new r1e(c98Var, new q1e(mz8.h(d0aVar3.k(MediaMetadataCompat.METADATA_KEY_MEDIA_ID), d0aVar3, i2), -1L, jC2));
                iO = r1eVar.o() - 1;
                b0aVarI = b0aVarI;
            } else {
                r1eVar = new r1e(c98Var, null);
                iO = 0;
            }
            b0aVar = b0aVarI;
        } else {
            c4d c4dVar2 = (c4d) js8Var2.a;
            iO = c4dVar2.c.a.b;
            b0aVar = c4dVar2.B;
        }
        if (ou9Var != null) {
            ou9Var2 = ou9Var;
            i4 = ou9Var2.b;
        } else {
            ou9Var2 = ou9Var;
            i4 = 0;
        }
        s74 s74Var = new s74(1);
        long j12 = x2dVar2 == null ? 0L : x2dVar2.e;
        if (x2dVar2 != null) {
            r1eVar3 = r1eVar;
            switch (x2dVar2.a) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    z7 = true;
                    break;
            }
            if (mz8.v(j12, 4L) || z7) {
                j3 = 4;
                if ((mz8.v(j12, 2L) && z7) || mz8.v(j12, 512L)) {
                }
                if (mz8.v(j12, PlaybackStateCompat.ACTION_PREPARE)) {
                    s74Var.a(2);
                }
                if ((mz8.v(j12, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) && mz8.v(j12, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) || ((mz8.v(j12, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) && mz8.v(j12, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) || (mz8.v(j12, PlaybackStateCompat.ACTION_PREPARE_FROM_URI) && mz8.v(j12, PlaybackStateCompat.ACTION_PLAY_FROM_URI)))) {
                    s74Var.c(31, 2);
                }
                if (mz8.v(j12, 8L)) {
                    s74Var.a(11);
                }
                if (mz8.v(j12, 64L)) {
                    s74Var.a(12);
                }
                if (mz8.v(j12, 256L)) {
                    s74Var.c(5, 4);
                }
                if (mz8.v(j12, 32L)) {
                    s74Var.c(9, 8);
                }
                if (mz8.v(j12, 16L)) {
                    s74Var.c(7, 6);
                }
                if (mz8.v(j12, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
                    s74Var.a(13);
                }
                if (mz8.v(j12, 1L)) {
                    s74Var.a(3);
                }
                if (i4 == 1) {
                    s74Var.c(26, 34);
                } else if (i4 == 2) {
                    s74Var.c(26, 34, 25, 33);
                }
                s74Var.c(23, 17, 18, 16, 21, 32);
                if ((flags & j3) != 0) {
                    s74Var.a(20);
                    if (mz8.v(j12, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
                        s74Var.a(10);
                    }
                }
                if (z2) {
                    if (mz8.v(j12, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
                        s74Var.a(15);
                    }
                    if (mz8.v(j12, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
                        s74Var.a(14);
                    }
                }
                h3dVar = new h3d(s74Var.d());
                charSequence = ov9Var3.e;
                charSequence2 = ov9Var.e;
                if (charSequence == charSequence2) {
                    b0aVar2 = ((c4d) js8Var2.a).m;
                } else if (charSequence2 == null) {
                    b0aVar2 = b0a.K;
                } else {
                    zz9 zz9Var = new zz9();
                    zz9Var.a = charSequence2;
                    b0aVar2 = new b0a(zz9Var);
                }
                b0a b0aVar3 = b0aVar2;
                iP = mz8.p(ov9Var.f);
                zR = mz8.r(ov9Var.g);
                if (x2dVar == x2dVar2 || z20) {
                    hashSet = new HashSet();
                    gheVar = emf.d;
                    for (i5 = 0; i5 < gheVar.d; i5++) {
                        hashSet.add(new emf(((Integer) gheVar.get(i5)).intValue()));
                    }
                    if (!z2) {
                        for (emf emfVar : hashSet) {
                            if (emfVar.a == 40010) {
                                hashSet.remove(emfVar);
                            }
                        }
                    }
                    if (x2dVar2 != null) {
                        for (w2d w2dVar : x2dVar2.i) {
                            String str = w2dVar.a;
                            bundle3 = w2dVar.d;
                            if (bundle3 == null) {
                                bundle3 = Bundle.EMPTY;
                            }
                            hashSet.add(new emf(str, bundle3));
                        }
                    }
                    fmf fmfVar2 = new fmf(hashSet);
                    if (x2dVar2 == null) {
                        a98 a98Var = c98.b;
                        i7 = iP;
                        z8 = zR;
                        gheVarK = ghe.e;
                        pmfVar = null;
                    } else {
                        List list3 = x2dVar2.i;
                        oc9.p(4, "initialCapacity");
                        objArrCopyOf = new Object[4];
                        it = list3.iterator();
                        i6 = 0;
                        while (it.hasNext()) {
                            w2d w2dVar2 = (w2d) it.next();
                            String str2 = w2dVar2.a;
                            bundle = w2dVar2.d;
                            if (bundle != null) {
                                i8 = bundle.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                            } else {
                                i8 = 0;
                            }
                            Iterator it2 = it;
                            ay3Var = new ay3(i8, w2dVar2.c);
                            if (bundle == null) {
                                bundle2 = Bundle.EMPTY;
                            } else {
                                bundle2 = bundle;
                            }
                            emf emfVar2 = new emf(str2, bundle2);
                            if (ay3Var.c == -1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            lvb.O("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z9);
                            ay3Var.b = emfVar2;
                            ay3Var.j = null;
                            ay3Var.f = w2dVar2.b;
                            ay3Var.h = true;
                            if (bundle != null) {
                                ay3Var.d(bundle);
                            }
                            if (bundle != null) {
                                string = bundle.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                            } else {
                                string = null;
                            }
                            if (string != null) {
                                uri = Uri.parse(string);
                                scheme = uri.getScheme();
                                if (Objects.equals(scheme, "content") || Objects.equals(scheme, "android.resource")) {
                                    ay3Var.e(uri);
                                }
                            }
                            by3 by3VarA = ay3Var.a();
                            int i21 = i6 + 1;
                            iB = r88.b(objArrCopyOf.length, i21);
                            if (iB > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                            }
                            objArrCopyOf[i6] = by3VarA;
                            i6 = i21;
                            iP = iP;
                            zR = zR;
                            it = it2;
                        }
                        i7 = iP;
                        z8 = zR;
                        pmfVar = null;
                        gheVarK = by3.k(c98.j(objArrCopyOf, i6), h3dVar, bundle4);
                    }
                    fmfVar = fmfVar2;
                    c98Var3 = gheVarK;
                } else {
                    fmfVar = (fmf) js8Var2.b;
                    c98Var3 = (c98) js8Var2.d;
                    i7 = iP;
                    z8 = zR;
                    pmfVar = null;
                }
                Context context = this.a;
                PlaybackException playbackExceptionL = mz8.l(x2dVar2, context);
                if (x2dVar2 != null) {
                    i9 = x2dVar2.a;
                    int i22 = x2dVar2.f;
                    CharSequence charSequence3 = x2dVar2.g;
                    Bundle bundle5 = x2dVar2.k;
                    if (i9 != 7 || i22 == 0) {
                        pmfVar = null;
                    } else {
                        int iQ = mz8.q(i22);
                        String string2 = charSequence3 != null ? charSequence3.toString() : mz8.u(context, iQ);
                        if (bundle5 == null) {
                            bundle5 = Bundle.EMPTY;
                        }
                        pmfVar = new pmf(string2, iQ, bundle5);
                    }
                }
                long jB3 = mz8.b(x2dVar2, d0aVar3, j5);
                long jA = mz8.a(x2dVar2, d0aVar3, j5);
                fmf fmfVar3 = fmfVar;
                c98 c98Var5 = c98Var3;
                int iE = gm0.e(mz8.a(x2dVar2, d0aVar3, j5), mz8.c(d0aVar3));
                long jA2 = mz8.a(x2dVar2, d0aVar3, j5) - mz8.b(x2dVar2, d0aVar3, j5);
                if (d0aVar3 == null && d0aVar3.d(MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (x2dVar2 == null) {
                    s2dVar = s2d.d;
                } else {
                    s2dVar = new s2d(x2dVar2.d);
                }
                if (ou9Var2 == 0) {
                    p70Var = p70.i;
                    ou9Var3 = ou9Var2;
                } else {
                    ou9Var3 = ou9Var2;
                    p70Var = (p70) ou9Var3.e;
                }
                if (x2dVar2 != null) {
                    switch (x2dVar2.a) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            z11 = true;
                            break;
                        case 7:
                        case 8:
                        default:
                            z11 = false;
                            break;
                    }
                } else {
                    z11 = false;
                }
                if (x2dVar2 == null) {
                    pmfVar = pmfVar;
                    i10 = 1;
                } else {
                    try {
                        i11 = x2dVar2.a;
                        jC = mz8.c(d0aVar3);
                        if (jC == -9223372036854775807L && mz8.b(x2dVar2, d0aVar3, j5) >= jC) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        switch (i11) {
                            case 0:
                            case 7:
                            case 8:
                                pmfVar = pmfVar;
                                i10 = 1;
                                break;
                            case 1:
                                pmfVar = pmfVar;
                                if (z12) {
                                    i10 = 4;
                                } else {
                                    i10 = 1;
                                }
                                break;
                            case 2:
                                pmfVar = pmfVar;
                                if (z12) {
                                    i10 = 4;
                                } else {
                                    i10 = 3;
                                }
                                break;
                            case 3:
                                pmfVar = pmfVar;
                                i10 = 3;
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 9:
                            case 10:
                            case 11:
                                pmfVar = pmfVar;
                                i10 = 2;
                                break;
                            default:
                                try {
                                    throw new LegacyConversions$ConversionException("Invalid state of PlaybackStateCompat: " + i11);
                                } catch (LegacyConversions$ConversionException unused) {
                                    lvb.k0("MCImplLegacy", "Received invalid playback state " + x2dVar2.a + " from package " + packageName + ". Keeping the previous state.");
                                    i10 = ((c4d) js8Var2.a).A;
                                    int i23 = i10;
                                    if (x2dVar2 == null) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (ou9Var3 == null) {
                                        ok5VarB = ok5.e;
                                    } else {
                                        if (ou9Var3.a == 2) {
                                            i12 = 1;
                                        } else {
                                            i12 = 0;
                                        }
                                        nk5 nk5Var = new nk5(i12);
                                        nk5Var.c = ou9Var3.c;
                                        String str3 = (String) ou9Var3.f;
                                        if (i12 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = true;
                                        }
                                        lvb.R(z14);
                                        nk5Var.d = str3;
                                        ok5VarB = nk5Var.b();
                                    }
                                    ok5 ok5Var = ok5VarB;
                                    if (ou9Var3 == null) {
                                        iH = 0;
                                    } else {
                                        iH = ou9Var3.h();
                                    }
                                    if (ou9Var3 == null) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    c4d c4dVar3 = (c4d) js8Var2.a;
                                    long j13 = c4dVar3.C;
                                    long j14 = c4dVar3.D;
                                    s2d s2dVar2 = s2dVar;
                                    long j15 = c4dVar3.E;
                                    Bundle bundle6 = ov9Var.h;
                                    if (iO >= r1eVar3.o()) {
                                        r1eVar4 = r1eVar3;
                                        ry9Var2 = null;
                                    } else {
                                        r1eVar4 = r1eVar3;
                                        ry9Var2 = r1eVar4.r(iO).a;
                                    }
                                    umf umfVar = new umf(a0(iO, ry9Var2, jB3, z10), z10, SystemClock.elapsedRealtime(), jC2, jA, iE, jA2, -9223372036854775807L, jC2, jA);
                                    k3d k3dVar = umf.k;
                                    int i24 = i7;
                                    c4dVar = new c4d(playbackExceptionL, 0, umfVar, k3dVar, k3dVar, 0, s2dVar2, i24, z8, k4j.d, r1eVar4, 0, b0aVar3, 1.0f, 1.0f, p70Var, 0, zy4.d, ok5Var, iH, z15, z11, 1, 0, i23, z13, false, b0aVar, j13, j14, j15, fzh.b, ryh.J);
                                    js8 js8Var3 = new js8(c4dVar, fmfVar3, h3dVar, c98Var5, bundle6, pmfVar);
                                    ov9Var2 = this.m;
                                    js8Var = this.p;
                                    j4 = iu9Var.g;
                                    num = 3;
                                    zP = ((c4d) js8Var.a).j.p();
                                    boolean zP2 = r1eVar4.p();
                                    if (!zP) {
                                        if (zP) {
                                            ry9VarQ = ((c4d) js8Var.a).q();
                                            ry9VarQ.getClass();
                                            q1eVar2 = r1eVar4.f;
                                            if (q1eVar2 == null) {
                                                i13 = 0;
                                                while (true) {
                                                    c98Var4 = r1eVar4.e;
                                                    if (i13 >= c98Var4.size()) {
                                                        z16 = false;
                                                    } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                                        z16 = true;
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            } else {
                                                i13 = 0;
                                                while (true) {
                                                    c98Var4 = r1eVar4.e;
                                                    if (i13 >= c98Var4.size()) {
                                                        z16 = false;
                                                    } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                                        z16 = true;
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            }
                                            if (z16) {
                                                num2 = 4;
                                            } else if (ry9VarQ.equals(c4dVar.q())) {
                                                jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                                                jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                                                if (jB2 == 0) {
                                                    if (Math.abs(jB - jB2) > 100) {
                                                        num2 = 5;
                                                    } else {
                                                        num2 = null;
                                                    }
                                                    num3 = null;
                                                } else {
                                                    if (Math.abs(jB - jB2) > 100) {
                                                        num2 = 5;
                                                    } else {
                                                        num2 = null;
                                                    }
                                                    num3 = null;
                                                }
                                                num = num3;
                                            } else {
                                                z17 = true;
                                                num = 1;
                                                num2 = 0;
                                            }
                                            z17 = true;
                                        } else {
                                            ry9VarQ = ((c4d) js8Var.a).q();
                                            ry9VarQ.getClass();
                                            q1eVar2 = r1eVar4.f;
                                            if (q1eVar2 == null) {
                                                i13 = 0;
                                                while (true) {
                                                    c98Var4 = r1eVar4.e;
                                                    if (i13 >= c98Var4.size()) {
                                                        z16 = false;
                                                    } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                                        z16 = true;
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            } else {
                                                i13 = 0;
                                                while (true) {
                                                    c98Var4 = r1eVar4.e;
                                                    if (i13 >= c98Var4.size()) {
                                                        z16 = false;
                                                    } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                                        z16 = true;
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            }
                                            if (z16) {
                                                num2 = 4;
                                            } else if (ry9VarQ.equals(c4dVar.q())) {
                                                jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                                                jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                                                if (jB2 == 0) {
                                                    if (Math.abs(jB - jB2) > 100) {
                                                        num2 = 5;
                                                    } else {
                                                        num2 = null;
                                                    }
                                                    num3 = null;
                                                } else {
                                                    if (Math.abs(jB - jB2) > 100) {
                                                        num2 = 5;
                                                    } else {
                                                        num2 = null;
                                                    }
                                                    num3 = null;
                                                }
                                                num = num3;
                                            } else {
                                                z17 = true;
                                                num = 1;
                                                num2 = 0;
                                            }
                                            z17 = true;
                                        }
                                    } else if (zP) {
                                        ry9VarQ = ((c4d) js8Var.a).q();
                                        ry9VarQ.getClass();
                                        q1eVar2 = r1eVar4.f;
                                        if (q1eVar2 == null) {
                                            i13 = 0;
                                            while (true) {
                                                c98Var4 = r1eVar4.e;
                                                if (i13 >= c98Var4.size()) {
                                                    z16 = false;
                                                } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                                    z16 = true;
                                                } else {
                                                    i13++;
                                                }
                                            }
                                        } else {
                                            i13 = 0;
                                            while (true) {
                                                c98Var4 = r1eVar4.e;
                                                if (i13 >= c98Var4.size()) {
                                                    z16 = false;
                                                } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                                    z16 = true;
                                                } else {
                                                    i13++;
                                                }
                                            }
                                        }
                                        if (z16) {
                                            num2 = 4;
                                        } else if (ry9VarQ.equals(c4dVar.q())) {
                                            jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                                            jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                                            if (jB2 == 0) {
                                                if (Math.abs(jB - jB2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            } else {
                                                if (Math.abs(jB - jB2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            }
                                            num = num3;
                                        } else {
                                            z17 = true;
                                            num = 1;
                                            num2 = 0;
                                        }
                                        z17 = true;
                                    } else {
                                        ry9VarQ = ((c4d) js8Var.a).q();
                                        ry9VarQ.getClass();
                                        q1eVar2 = r1eVar4.f;
                                        if (q1eVar2 == null) {
                                            i13 = 0;
                                            while (true) {
                                                c98Var4 = r1eVar4.e;
                                                if (i13 >= c98Var4.size()) {
                                                    z16 = false;
                                                } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                                    z16 = true;
                                                } else {
                                                    i13++;
                                                }
                                            }
                                        } else {
                                            i13 = 0;
                                            while (true) {
                                                c98Var4 = r1eVar4.e;
                                                if (i13 >= c98Var4.size()) {
                                                    z16 = false;
                                                } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                                    z16 = true;
                                                } else {
                                                    i13++;
                                                }
                                            }
                                        }
                                        if (z16) {
                                            num2 = 4;
                                        } else if (ry9VarQ.equals(c4dVar.q())) {
                                            jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                                            jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                                            if (jB2 == 0) {
                                                if (Math.abs(jB - jB2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            } else {
                                                if (Math.abs(jB - jB2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            }
                                            num = num3;
                                        } else {
                                            z17 = true;
                                            num = 1;
                                            num2 = 0;
                                        }
                                        z17 = true;
                                    }
                                    Pair pairCreate = Pair.create(num2, num);
                                    h0(z, ov9Var, true, js8Var3, (Integer) pairCreate.first, (Integer) pairCreate.second);
                                    if (this.o) {
                                        this.o = false;
                                        if (Looper.myLooper() == iu9Var.f.getLooper()) {
                                            z18 = z17;
                                        } else {
                                            z18 = false;
                                        }
                                        lvb.b0(z18);
                                        iu9Var.e.getClass();
                                    }
                                }
                        }
                    } catch (LegacyConversions$ConversionException unused2) {
                    }
                }
                int i25 = i10;
                if (x2dVar2 == null && x2dVar2.a == 3) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (ou9Var3 == null) {
                    ok5VarB = ok5.e;
                } else {
                    if (ou9Var3.a == 2) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    nk5 nk5Var2 = new nk5(i12);
                    nk5Var2.c = ou9Var3.c;
                    String str4 = (String) ou9Var3.f;
                    if (i12 == 0 || str4 == null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    lvb.R(z14);
                    nk5Var2.d = str4;
                    ok5VarB = nk5Var2.b();
                }
                ok5 ok5Var2 = ok5VarB;
                if (ou9Var3 == null) {
                    iH = 0;
                } else {
                    iH = ou9Var3.h();
                }
                if (ou9Var3 == null && ou9Var3.h() == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                c4d c4dVar4 = (c4d) js8Var2.a;
                long j16 = c4dVar4.C;
                long j17 = c4dVar4.D;
                s2d s2dVar3 = s2dVar;
                long j18 = c4dVar4.E;
                Bundle bundle7 = ov9Var.h;
                if (iO >= r1eVar3.o()) {
                    r1eVar4 = r1eVar3;
                    ry9Var2 = null;
                } else {
                    r1eVar4 = r1eVar3;
                    ry9Var2 = r1eVar4.r(iO).a;
                }
                umf umfVar2 = new umf(a0(iO, ry9Var2, jB3, z10), z10, SystemClock.elapsedRealtime(), jC2, jA, iE, jA2, -9223372036854775807L, jC2, jA);
                k3d k3dVar2 = umf.k;
                int i26 = i7;
                c4dVar = new c4d(playbackExceptionL, 0, umfVar2, k3dVar2, k3dVar2, 0, s2dVar3, i26, z8, k4j.d, r1eVar4, 0, b0aVar3, 1.0f, 1.0f, p70Var, 0, zy4.d, ok5Var2, iH, z15, z11, 1, 0, i25, z13, false, b0aVar, j16, j17, j18, fzh.b, ryh.J);
                js8 js8Var4 = new js8(c4dVar, fmfVar3, h3dVar, c98Var5, bundle7, pmfVar);
                ov9Var2 = this.m;
                js8Var = this.p;
                j4 = iu9Var.g;
                num = 3;
                zP = ((c4d) js8Var.a).j.p();
                boolean zP3 = r1eVar4.p();
                if (!zP && zP3) {
                    num = null;
                    num2 = null;
                } else if (zP || zP3) {
                    ry9VarQ = ((c4d) js8Var.a).q();
                    ry9VarQ.getClass();
                    q1eVar2 = r1eVar4.f;
                    if (q1eVar2 == null && ry9VarQ.equals(q1eVar2.a)) {
                        z16 = true;
                    } else {
                        i13 = 0;
                        while (true) {
                            c98Var4 = r1eVar4.e;
                            if (i13 >= c98Var4.size()) {
                                z16 = false;
                            } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                z16 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z16) {
                        if (ry9VarQ.equals(c4dVar.q())) {
                            jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                            jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                            if (jB2 == 0 || i26 != 1) {
                                if (Math.abs(jB - jB2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                num2 = 0;
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z17 = true;
                            num = 1;
                            num2 = 0;
                        }
                        Pair pairCreate2 = Pair.create(num2, num);
                        h0(z, ov9Var, true, js8Var4, (Integer) pairCreate2.first, (Integer) pairCreate2.second);
                        if (this.o) {
                            this.o = false;
                            if (Looper.myLooper() == iu9Var.f.getLooper()) {
                                z18 = z17;
                            } else {
                                z18 = false;
                            }
                            lvb.b0(z18);
                            iu9Var.e.getClass();
                        }
                    }
                    num2 = 4;
                } else {
                    num2 = 0;
                }
                z17 = true;
                Pair pairCreate3 = Pair.create(num2, num);
                h0(z, ov9Var, true, js8Var4, (Integer) pairCreate3.first, (Integer) pairCreate3.second);
                if (this.o) {
                    this.o = false;
                    if (Looper.myLooper() == iu9Var.f.getLooper()) {
                        z18 = z17;
                    } else {
                        z18 = false;
                    }
                    lvb.b0(z18);
                    iu9Var.e.getClass();
                }
            }
            j3 = 4;
            s74Var.a(1);
            if (mz8.v(j12, PlaybackStateCompat.ACTION_PREPARE)) {
                s74Var.a(2);
            }
            if (mz8.v(j12, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                s74Var.c(31, 2);
            } else {
                s74Var.c(31, 2);
            }
            if (mz8.v(j12, 8L)) {
                s74Var.a(11);
            }
            if (mz8.v(j12, 64L)) {
                s74Var.a(12);
            }
            if (mz8.v(j12, 256L)) {
                s74Var.c(5, 4);
            }
            if (mz8.v(j12, 32L)) {
                s74Var.c(9, 8);
            }
            if (mz8.v(j12, 16L)) {
                s74Var.c(7, 6);
            }
            if (mz8.v(j12, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
                s74Var.a(13);
            }
            if (mz8.v(j12, 1L)) {
                s74Var.a(3);
            }
            if (i4 == 1) {
                s74Var.c(26, 34);
            } else if (i4 == 2) {
                s74Var.c(26, 34, 25, 33);
            }
            s74Var.c(23, 17, 18, 16, 21, 32);
            if ((flags & j3) != 0) {
                s74Var.a(20);
                if (mz8.v(j12, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
                    s74Var.a(10);
                }
            }
            if (z2) {
                if (mz8.v(j12, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
                    s74Var.a(15);
                }
                if (mz8.v(j12, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
                    s74Var.a(14);
                }
            }
            h3dVar = new h3d(s74Var.d());
            charSequence = ov9Var3.e;
            charSequence2 = ov9Var.e;
            if (charSequence == charSequence2) {
                b0aVar2 = ((c4d) js8Var2.a).m;
            } else if (charSequence2 == null) {
                b0aVar2 = b0a.K;
            } else {
                zz9 zz9Var2 = new zz9();
                zz9Var2.a = charSequence2;
                b0aVar2 = new b0a(zz9Var2);
            }
            b0a b0aVar4 = b0aVar2;
            iP = mz8.p(ov9Var.f);
            zR = mz8.r(ov9Var.g);
            if (x2dVar == x2dVar2) {
                hashSet = new HashSet();
                gheVar = emf.d;
                while (i5 < gheVar.d) {
                    hashSet.add(new emf(((Integer) gheVar.get(i5)).intValue()));
                }
                if (!z2) {
                    while (r8.hasNext()) {
                        if (emfVar.a == 40010) {
                            hashSet.remove(emfVar);
                        }
                    }
                }
                if (x2dVar2 != null) {
                    while (r8.hasNext()) {
                        String str5 = w2dVar.a;
                        bundle3 = w2dVar.d;
                        if (bundle3 == null) {
                            bundle3 = Bundle.EMPTY;
                        }
                        hashSet.add(new emf(str5, bundle3));
                    }
                }
                fmf fmfVar4 = new fmf(hashSet);
                if (x2dVar2 == null) {
                    a98 a98Var2 = c98.b;
                    i7 = iP;
                    z8 = zR;
                    gheVarK = ghe.e;
                    pmfVar = null;
                } else {
                    List list4 = x2dVar2.i;
                    oc9.p(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    it = list4.iterator();
                    i6 = 0;
                    while (it.hasNext()) {
                        w2d w2dVar3 = (w2d) it.next();
                        String str6 = w2dVar3.a;
                        bundle = w2dVar3.d;
                        if (bundle != null) {
                            i8 = bundle.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                        } else {
                            i8 = 0;
                        }
                        Iterator it3 = it;
                        ay3Var = new ay3(i8, w2dVar3.c);
                        if (bundle == null) {
                            bundle2 = Bundle.EMPTY;
                        } else {
                            bundle2 = bundle;
                        }
                        emf emfVar3 = new emf(str6, bundle2);
                        if (ay3Var.c == -1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        lvb.O("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z9);
                        ay3Var.b = emfVar3;
                        ay3Var.j = null;
                        ay3Var.f = w2dVar3.b;
                        ay3Var.h = true;
                        if (bundle != null) {
                            ay3Var.d(bundle);
                        }
                        if (bundle != null) {
                            string = bundle.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                        } else {
                            string = null;
                        }
                        if (string != null) {
                            uri = Uri.parse(string);
                            scheme = uri.getScheme();
                            if (Objects.equals(scheme, "content")) {
                                ay3Var.e(uri);
                            } else {
                                ay3Var.e(uri);
                            }
                        }
                        by3 by3VarA2 = ay3Var.a();
                        int i27 = i6 + 1;
                        iB = r88.b(objArrCopyOf.length, i27);
                        if (iB > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                        }
                        objArrCopyOf[i6] = by3VarA2;
                        i6 = i27;
                        iP = iP;
                        zR = zR;
                        it = it3;
                    }
                    i7 = iP;
                    z8 = zR;
                    pmfVar = null;
                    gheVarK = by3.k(c98.j(objArrCopyOf, i6), h3dVar, bundle4);
                }
                fmfVar = fmfVar4;
                c98Var3 = gheVarK;
            } else {
                hashSet = new HashSet();
                gheVar = emf.d;
                while (i5 < gheVar.d) {
                    hashSet.add(new emf(((Integer) gheVar.get(i5)).intValue()));
                }
                if (!z2) {
                    while (r8.hasNext()) {
                        if (emfVar.a == 40010) {
                            hashSet.remove(emfVar);
                        }
                    }
                }
                if (x2dVar2 != null) {
                    while (r8.hasNext()) {
                        String str7 = w2dVar.a;
                        bundle3 = w2dVar.d;
                        if (bundle3 == null) {
                            bundle3 = Bundle.EMPTY;
                        }
                        hashSet.add(new emf(str7, bundle3));
                    }
                }
                fmf fmfVar5 = new fmf(hashSet);
                if (x2dVar2 == null) {
                    a98 a98Var3 = c98.b;
                    i7 = iP;
                    z8 = zR;
                    gheVarK = ghe.e;
                    pmfVar = null;
                } else {
                    List list5 = x2dVar2.i;
                    oc9.p(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    it = list5.iterator();
                    i6 = 0;
                    while (it.hasNext()) {
                        w2d w2dVar4 = (w2d) it.next();
                        String str8 = w2dVar4.a;
                        bundle = w2dVar4.d;
                        if (bundle != null) {
                            i8 = bundle.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                        } else {
                            i8 = 0;
                        }
                        Iterator it4 = it;
                        ay3Var = new ay3(i8, w2dVar4.c);
                        if (bundle == null) {
                            bundle2 = Bundle.EMPTY;
                        } else {
                            bundle2 = bundle;
                        }
                        emf emfVar4 = new emf(str8, bundle2);
                        if (ay3Var.c == -1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        lvb.O("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z9);
                        ay3Var.b = emfVar4;
                        ay3Var.j = null;
                        ay3Var.f = w2dVar4.b;
                        ay3Var.h = true;
                        if (bundle != null) {
                            ay3Var.d(bundle);
                        }
                        if (bundle != null) {
                            string = bundle.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                        } else {
                            string = null;
                        }
                        if (string != null) {
                            uri = Uri.parse(string);
                            scheme = uri.getScheme();
                            if (Objects.equals(scheme, "content")) {
                                ay3Var.e(uri);
                            } else {
                                ay3Var.e(uri);
                            }
                        }
                        by3 by3VarA3 = ay3Var.a();
                        int i28 = i6 + 1;
                        iB = r88.b(objArrCopyOf.length, i28);
                        if (iB > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                        }
                        objArrCopyOf[i6] = by3VarA3;
                        i6 = i28;
                        iP = iP;
                        zR = zR;
                        it = it4;
                    }
                    i7 = iP;
                    z8 = zR;
                    pmfVar = null;
                    gheVarK = by3.k(c98.j(objArrCopyOf, i6), h3dVar, bundle4);
                }
                fmfVar = fmfVar5;
                c98Var3 = gheVarK;
            }
            Context context2 = this.a;
            PlaybackException playbackExceptionL2 = mz8.l(x2dVar2, context2);
            if (x2dVar2 != null) {
                i9 = x2dVar2.a;
                int i29 = x2dVar2.f;
                CharSequence charSequence4 = x2dVar2.g;
                Bundle bundle8 = x2dVar2.k;
                if (i9 != 7) {
                }
                pmfVar = null;
            }
            long jB4 = mz8.b(x2dVar2, d0aVar3, j5);
            long jA3 = mz8.a(x2dVar2, d0aVar3, j5);
            fmf fmfVar6 = fmfVar;
            c98 c98Var6 = c98Var3;
            int iE2 = gm0.e(mz8.a(x2dVar2, d0aVar3, j5), mz8.c(d0aVar3));
            long jA4 = mz8.a(x2dVar2, d0aVar3, j5) - mz8.b(x2dVar2, d0aVar3, j5);
            if (d0aVar3 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (x2dVar2 == null) {
                s2dVar = s2d.d;
            } else {
                s2dVar = new s2d(x2dVar2.d);
            }
            if (ou9Var2 == 0) {
                p70Var = p70.i;
                ou9Var3 = ou9Var2;
            } else {
                ou9Var3 = ou9Var2;
                p70Var = (p70) ou9Var3.e;
            }
            if (x2dVar2 != null) {
                switch (x2dVar2.a) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        z11 = true;
                        break;
                    case 7:
                    case 8:
                    default:
                        z11 = false;
                        break;
                }
            } else {
                z11 = false;
            }
            if (x2dVar2 == null) {
                pmfVar = pmfVar;
                i10 = 1;
            } else {
                i11 = x2dVar2.a;
                jC = mz8.c(d0aVar3);
                if (jC == -9223372036854775807L) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                switch (i11) {
                    case 0:
                    case 7:
                    case 8:
                        pmfVar = pmfVar;
                        i10 = 1;
                        break;
                    case 1:
                        pmfVar = pmfVar;
                        if (z12) {
                            i10 = 4;
                        } else {
                            i10 = 1;
                        }
                        break;
                    case 2:
                        pmfVar = pmfVar;
                        if (z12) {
                            i10 = 4;
                        } else {
                            i10 = 3;
                        }
                        break;
                    case 3:
                        pmfVar = pmfVar;
                        i10 = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        pmfVar = pmfVar;
                        i10 = 2;
                        break;
                    default:
                        throw new LegacyConversions$ConversionException("Invalid state of PlaybackStateCompat: " + i11);
                }
            }
            int i210 = i10;
            if (x2dVar2 == null) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (ou9Var3 == null) {
                ok5VarB = ok5.e;
            } else {
                if (ou9Var3.a == 2) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                nk5 nk5Var3 = new nk5(i12);
                nk5Var3.c = ou9Var3.c;
                String str9 = (String) ou9Var3.f;
                if (i12 == 0) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                lvb.R(z14);
                nk5Var3.d = str9;
                ok5VarB = nk5Var3.b();
            }
            ok5 ok5Var3 = ok5VarB;
            if (ou9Var3 == null) {
                iH = 0;
            } else {
                iH = ou9Var3.h();
            }
            if (ou9Var3 == null) {
                z15 = false;
            } else {
                z15 = true;
            }
            c4d c4dVar5 = (c4d) js8Var2.a;
            long j19 = c4dVar5.C;
            long j110 = c4dVar5.D;
            s2d s2dVar4 = s2dVar;
            long j111 = c4dVar5.E;
            Bundle bundle9 = ov9Var.h;
            if (iO >= r1eVar3.o()) {
                r1eVar4 = r1eVar3;
                ry9Var2 = null;
            } else {
                r1eVar4 = r1eVar3;
                ry9Var2 = r1eVar4.r(iO).a;
            }
            umf umfVar3 = new umf(a0(iO, ry9Var2, jB4, z10), z10, SystemClock.elapsedRealtime(), jC2, jA3, iE2, jA4, -9223372036854775807L, jC2, jA3);
            k3d k3dVar3 = umf.k;
            int i211 = i7;
            c4dVar = new c4d(playbackExceptionL2, 0, umfVar3, k3dVar3, k3dVar3, 0, s2dVar4, i211, z8, k4j.d, r1eVar4, 0, b0aVar4, 1.0f, 1.0f, p70Var, 0, zy4.d, ok5Var3, iH, z15, z11, 1, 0, i210, z13, false, b0aVar, j19, j110, j111, fzh.b, ryh.J);
            js8 js8Var5 = new js8(c4dVar, fmfVar6, h3dVar, c98Var6, bundle9, pmfVar);
            ov9Var2 = this.m;
            js8Var = this.p;
            j4 = iu9Var.g;
            num = 3;
            zP = ((c4d) js8Var.a).j.p();
            boolean zP4 = r1eVar4.p();
            if (!zP) {
                if (zP) {
                    ry9VarQ = ((c4d) js8Var.a).q();
                    ry9VarQ.getClass();
                    q1eVar2 = r1eVar4.f;
                    if (q1eVar2 == null) {
                        i13 = 0;
                        while (true) {
                            c98Var4 = r1eVar4.e;
                            if (i13 >= c98Var4.size()) {
                                z16 = false;
                            } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                z16 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            c98Var4 = r1eVar4.e;
                            if (i13 >= c98Var4.size()) {
                                z16 = false;
                            } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                z16 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z16) {
                        num2 = 4;
                    } else if (ry9VarQ.equals(c4dVar.q())) {
                        jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                        jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                        if (jB2 == 0) {
                            if (Math.abs(jB - jB2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jB - jB2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z17 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z17 = true;
                } else {
                    ry9VarQ = ((c4d) js8Var.a).q();
                    ry9VarQ.getClass();
                    q1eVar2 = r1eVar4.f;
                    if (q1eVar2 == null) {
                        i13 = 0;
                        while (true) {
                            c98Var4 = r1eVar4.e;
                            if (i13 >= c98Var4.size()) {
                                z16 = false;
                            } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                z16 = true;
                            } else {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                        while (true) {
                            c98Var4 = r1eVar4.e;
                            if (i13 >= c98Var4.size()) {
                                z16 = false;
                            } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                                z16 = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    if (z16) {
                        num2 = 4;
                    } else if (ry9VarQ.equals(c4dVar.q())) {
                        jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                        jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                        if (jB2 == 0) {
                            if (Math.abs(jB - jB2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jB - jB2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z17 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z17 = true;
                }
            } else if (zP) {
                ry9VarQ = ((c4d) js8Var.a).q();
                ry9VarQ.getClass();
                q1eVar2 = r1eVar4.f;
                if (q1eVar2 == null) {
                    i13 = 0;
                    while (true) {
                        c98Var4 = r1eVar4.e;
                        if (i13 >= c98Var4.size()) {
                            z16 = false;
                        } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                            z16 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        c98Var4 = r1eVar4.e;
                        if (i13 >= c98Var4.size()) {
                            z16 = false;
                        } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                            z16 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z16) {
                    num2 = 4;
                } else if (ry9VarQ.equals(c4dVar.q())) {
                    jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                    jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                    if (jB2 == 0) {
                        if (Math.abs(jB - jB2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jB - jB2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z17 = true;
                    num = 1;
                    num2 = 0;
                }
                z17 = true;
            } else {
                ry9VarQ = ((c4d) js8Var.a).q();
                ry9VarQ.getClass();
                q1eVar2 = r1eVar4.f;
                if (q1eVar2 == null) {
                    i13 = 0;
                    while (true) {
                        c98Var4 = r1eVar4.e;
                        if (i13 >= c98Var4.size()) {
                            z16 = false;
                        } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                            z16 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        c98Var4 = r1eVar4.e;
                        if (i13 >= c98Var4.size()) {
                            z16 = false;
                        } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                            z16 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z16) {
                    num2 = 4;
                } else if (ry9VarQ.equals(c4dVar.q())) {
                    jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                    jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                    if (jB2 == 0) {
                        if (Math.abs(jB - jB2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jB - jB2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z17 = true;
                    num = 1;
                    num2 = 0;
                }
                z17 = true;
            }
            Pair pairCreate4 = Pair.create(num2, num);
            h0(z, ov9Var, true, js8Var5, (Integer) pairCreate4.first, (Integer) pairCreate4.second);
            if (this.o) {
                this.o = false;
                if (Looper.myLooper() == iu9Var.f.getLooper()) {
                    z18 = z17;
                } else {
                    z18 = false;
                }
                lvb.b0(z18);
                iu9Var.e.getClass();
            }
        }
        r1eVar3 = r1eVar;
        z7 = false;
        if (mz8.v(j12, 4L)) {
            j3 = 4;
            if (mz8.v(j12, 2L)) {
                s74Var.a(1);
            } else {
                s74Var.a(1);
            }
        } else {
            j3 = 4;
            if (mz8.v(j12, 2L)) {
                s74Var.a(1);
            } else {
                s74Var.a(1);
            }
        }
        if (mz8.v(j12, PlaybackStateCompat.ACTION_PREPARE)) {
            s74Var.a(2);
        }
        if (mz8.v(j12, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            s74Var.c(31, 2);
        } else {
            s74Var.c(31, 2);
        }
        if (mz8.v(j12, 8L)) {
            s74Var.a(11);
        }
        if (mz8.v(j12, 64L)) {
            s74Var.a(12);
        }
        if (mz8.v(j12, 256L)) {
            s74Var.c(5, 4);
        }
        if (mz8.v(j12, 32L)) {
            s74Var.c(9, 8);
        }
        if (mz8.v(j12, 16L)) {
            s74Var.c(7, 6);
        }
        if (mz8.v(j12, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            s74Var.a(13);
        }
        if (mz8.v(j12, 1L)) {
            s74Var.a(3);
        }
        if (i4 == 1) {
            s74Var.c(26, 34);
        } else if (i4 == 2) {
            s74Var.c(26, 34, 25, 33);
        }
        s74Var.c(23, 17, 18, 16, 21, 32);
        if ((flags & j3) != 0) {
            s74Var.a(20);
            if (mz8.v(j12, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
                s74Var.a(10);
            }
        }
        if (z2) {
            if (mz8.v(j12, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
                s74Var.a(15);
            }
            if (mz8.v(j12, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
                s74Var.a(14);
            }
        }
        h3dVar = new h3d(s74Var.d());
        charSequence = ov9Var3.e;
        charSequence2 = ov9Var.e;
        if (charSequence == charSequence2) {
            b0aVar2 = ((c4d) js8Var2.a).m;
        } else if (charSequence2 == null) {
            b0aVar2 = b0a.K;
        } else {
            zz9 zz9Var3 = new zz9();
            zz9Var3.a = charSequence2;
            b0aVar2 = new b0a(zz9Var3);
        }
        b0a b0aVar5 = b0aVar2;
        iP = mz8.p(ov9Var.f);
        zR = mz8.r(ov9Var.g);
        if (x2dVar == x2dVar2) {
            hashSet = new HashSet();
            gheVar = emf.d;
            while (i5 < gheVar.d) {
                hashSet.add(new emf(((Integer) gheVar.get(i5)).intValue()));
            }
            if (!z2) {
                while (r8.hasNext()) {
                    if (emfVar.a == 40010) {
                        hashSet.remove(emfVar);
                    }
                }
            }
            if (x2dVar2 != null) {
                while (r8.hasNext()) {
                    String str10 = w2dVar.a;
                    bundle3 = w2dVar.d;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    hashSet.add(new emf(str10, bundle3));
                }
            }
            fmf fmfVar7 = new fmf(hashSet);
            if (x2dVar2 == null) {
                a98 a98Var4 = c98.b;
                i7 = iP;
                z8 = zR;
                gheVarK = ghe.e;
                pmfVar = null;
            } else {
                List list6 = x2dVar2.i;
                oc9.p(4, "initialCapacity");
                objArrCopyOf = new Object[4];
                it = list6.iterator();
                i6 = 0;
                while (it.hasNext()) {
                    w2d w2dVar5 = (w2d) it.next();
                    String str11 = w2dVar5.a;
                    bundle = w2dVar5.d;
                    if (bundle != null) {
                        i8 = bundle.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                    } else {
                        i8 = 0;
                    }
                    Iterator it5 = it;
                    ay3Var = new ay3(i8, w2dVar5.c);
                    if (bundle == null) {
                        bundle2 = Bundle.EMPTY;
                    } else {
                        bundle2 = bundle;
                    }
                    emf emfVar5 = new emf(str11, bundle2);
                    if (ay3Var.c == -1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    lvb.O("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z9);
                    ay3Var.b = emfVar5;
                    ay3Var.j = null;
                    ay3Var.f = w2dVar5.b;
                    ay3Var.h = true;
                    if (bundle != null) {
                        ay3Var.d(bundle);
                    }
                    if (bundle != null) {
                        string = bundle.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        uri = Uri.parse(string);
                        scheme = uri.getScheme();
                        if (Objects.equals(scheme, "content")) {
                            ay3Var.e(uri);
                        } else {
                            ay3Var.e(uri);
                        }
                    }
                    by3 by3VarA4 = ay3Var.a();
                    int i212 = i6 + 1;
                    iB = r88.b(objArrCopyOf.length, i212);
                    if (iB > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                    }
                    objArrCopyOf[i6] = by3VarA4;
                    i6 = i212;
                    iP = iP;
                    zR = zR;
                    it = it5;
                }
                i7 = iP;
                z8 = zR;
                pmfVar = null;
                gheVarK = by3.k(c98.j(objArrCopyOf, i6), h3dVar, bundle4);
            }
            fmfVar = fmfVar7;
            c98Var3 = gheVarK;
        } else {
            hashSet = new HashSet();
            gheVar = emf.d;
            while (i5 < gheVar.d) {
                hashSet.add(new emf(((Integer) gheVar.get(i5)).intValue()));
            }
            if (!z2) {
                while (r8.hasNext()) {
                    if (emfVar.a == 40010) {
                        hashSet.remove(emfVar);
                    }
                }
            }
            if (x2dVar2 != null) {
                while (r8.hasNext()) {
                    String str12 = w2dVar.a;
                    bundle3 = w2dVar.d;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    hashSet.add(new emf(str12, bundle3));
                }
            }
            fmf fmfVar8 = new fmf(hashSet);
            if (x2dVar2 == null) {
                a98 a98Var5 = c98.b;
                i7 = iP;
                z8 = zR;
                gheVarK = ghe.e;
                pmfVar = null;
            } else {
                List list7 = x2dVar2.i;
                oc9.p(4, "initialCapacity");
                objArrCopyOf = new Object[4];
                it = list7.iterator();
                i6 = 0;
                while (it.hasNext()) {
                    w2d w2dVar6 = (w2d) it.next();
                    String str13 = w2dVar6.a;
                    bundle = w2dVar6.d;
                    if (bundle != null) {
                        i8 = bundle.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                    } else {
                        i8 = 0;
                    }
                    Iterator it6 = it;
                    ay3Var = new ay3(i8, w2dVar6.c);
                    if (bundle == null) {
                        bundle2 = Bundle.EMPTY;
                    } else {
                        bundle2 = bundle;
                    }
                    emf emfVar6 = new emf(str13, bundle2);
                    if (ay3Var.c == -1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    lvb.O("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z9);
                    ay3Var.b = emfVar6;
                    ay3Var.j = null;
                    ay3Var.f = w2dVar6.b;
                    ay3Var.h = true;
                    if (bundle != null) {
                        ay3Var.d(bundle);
                    }
                    if (bundle != null) {
                        string = bundle.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        uri = Uri.parse(string);
                        scheme = uri.getScheme();
                        if (Objects.equals(scheme, "content")) {
                            ay3Var.e(uri);
                        } else {
                            ay3Var.e(uri);
                        }
                    }
                    by3 by3VarA5 = ay3Var.a();
                    int i213 = i6 + 1;
                    iB = r88.b(objArrCopyOf.length, i213);
                    if (iB > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                    }
                    objArrCopyOf[i6] = by3VarA5;
                    i6 = i213;
                    iP = iP;
                    zR = zR;
                    it = it6;
                }
                i7 = iP;
                z8 = zR;
                pmfVar = null;
                gheVarK = by3.k(c98.j(objArrCopyOf, i6), h3dVar, bundle4);
            }
            fmfVar = fmfVar8;
            c98Var3 = gheVarK;
        }
        Context context3 = this.a;
        PlaybackException playbackExceptionL3 = mz8.l(x2dVar2, context3);
        if (x2dVar2 != null) {
            i9 = x2dVar2.a;
            int i214 = x2dVar2.f;
            CharSequence charSequence5 = x2dVar2.g;
            Bundle bundle10 = x2dVar2.k;
            if (i9 != 7) {
            }
            pmfVar = null;
        }
        long jB5 = mz8.b(x2dVar2, d0aVar3, j5);
        long jA5 = mz8.a(x2dVar2, d0aVar3, j5);
        fmf fmfVar9 = fmfVar;
        c98 c98Var7 = c98Var3;
        int iE3 = gm0.e(mz8.a(x2dVar2, d0aVar3, j5), mz8.c(d0aVar3));
        long jA6 = mz8.a(x2dVar2, d0aVar3, j5) - mz8.b(x2dVar2, d0aVar3, j5);
        if (d0aVar3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (x2dVar2 == null) {
            s2dVar = s2d.d;
        } else {
            s2dVar = new s2d(x2dVar2.d);
        }
        if (ou9Var2 == 0) {
            p70Var = p70.i;
            ou9Var3 = ou9Var2;
        } else {
            ou9Var3 = ou9Var2;
            p70Var = (p70) ou9Var3.e;
        }
        if (x2dVar2 != null) {
            switch (x2dVar2.a) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    z11 = true;
                    break;
                case 7:
                case 8:
                default:
                    z11 = false;
                    break;
            }
        } else {
            z11 = false;
        }
        if (x2dVar2 == null) {
            pmfVar = pmfVar;
            i10 = 1;
        } else {
            i11 = x2dVar2.a;
            jC = mz8.c(d0aVar3);
            if (jC == -9223372036854775807L) {
                z12 = false;
            } else {
                z12 = true;
            }
            switch (i11) {
                case 0:
                case 7:
                case 8:
                    pmfVar = pmfVar;
                    i10 = 1;
                    break;
                case 1:
                    pmfVar = pmfVar;
                    if (z12) {
                        i10 = 4;
                    } else {
                        i10 = 1;
                    }
                    break;
                case 2:
                    pmfVar = pmfVar;
                    if (z12) {
                        i10 = 4;
                    } else {
                        i10 = 3;
                    }
                    break;
                case 3:
                    pmfVar = pmfVar;
                    i10 = 3;
                    break;
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    pmfVar = pmfVar;
                    i10 = 2;
                    break;
                default:
                    throw new LegacyConversions$ConversionException("Invalid state of PlaybackStateCompat: " + i11);
            }
        }
        int i215 = i10;
        if (x2dVar2 == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (ou9Var3 == null) {
            ok5VarB = ok5.e;
        } else {
            if (ou9Var3.a == 2) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            nk5 nk5Var4 = new nk5(i12);
            nk5Var4.c = ou9Var3.c;
            String str14 = (String) ou9Var3.f;
            if (i12 == 0) {
                z14 = true;
            } else {
                z14 = true;
            }
            lvb.R(z14);
            nk5Var4.d = str14;
            ok5VarB = nk5Var4.b();
        }
        ok5 ok5Var4 = ok5VarB;
        if (ou9Var3 == null) {
            iH = 0;
        } else {
            iH = ou9Var3.h();
        }
        if (ou9Var3 == null) {
            z15 = false;
        } else {
            z15 = true;
        }
        c4d c4dVar6 = (c4d) js8Var2.a;
        long j112 = c4dVar6.C;
        long j113 = c4dVar6.D;
        s2d s2dVar5 = s2dVar;
        long j114 = c4dVar6.E;
        Bundle bundle11 = ov9Var.h;
        if (iO >= r1eVar3.o()) {
            r1eVar4 = r1eVar3;
            ry9Var2 = null;
        } else {
            r1eVar4 = r1eVar3;
            ry9Var2 = r1eVar4.r(iO).a;
        }
        umf umfVar4 = new umf(a0(iO, ry9Var2, jB5, z10), z10, SystemClock.elapsedRealtime(), jC2, jA5, iE3, jA6, -9223372036854775807L, jC2, jA5);
        k3d k3dVar4 = umf.k;
        int i216 = i7;
        c4dVar = new c4d(playbackExceptionL3, 0, umfVar4, k3dVar4, k3dVar4, 0, s2dVar5, i216, z8, k4j.d, r1eVar4, 0, b0aVar5, 1.0f, 1.0f, p70Var, 0, zy4.d, ok5Var4, iH, z15, z11, 1, 0, i215, z13, false, b0aVar, j112, j113, j114, fzh.b, ryh.J);
        js8 js8Var6 = new js8(c4dVar, fmfVar9, h3dVar, c98Var7, bundle11, pmfVar);
        ov9Var2 = this.m;
        js8Var = this.p;
        j4 = iu9Var.g;
        num = 3;
        zP = ((c4d) js8Var.a).j.p();
        boolean zP5 = r1eVar4.p();
        if (!zP) {
            if (zP) {
                ry9VarQ = ((c4d) js8Var.a).q();
                ry9VarQ.getClass();
                q1eVar2 = r1eVar4.f;
                if (q1eVar2 == null) {
                    i13 = 0;
                    while (true) {
                        c98Var4 = r1eVar4.e;
                        if (i13 >= c98Var4.size()) {
                            z16 = false;
                        } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                            z16 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        c98Var4 = r1eVar4.e;
                        if (i13 >= c98Var4.size()) {
                            z16 = false;
                        } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                            z16 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z16) {
                    num2 = 4;
                } else if (ry9VarQ.equals(c4dVar.q())) {
                    jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                    jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                    if (jB2 == 0) {
                        if (Math.abs(jB - jB2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jB - jB2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z17 = true;
                    num = 1;
                    num2 = 0;
                }
                z17 = true;
            } else {
                ry9VarQ = ((c4d) js8Var.a).q();
                ry9VarQ.getClass();
                q1eVar2 = r1eVar4.f;
                if (q1eVar2 == null) {
                    i13 = 0;
                    while (true) {
                        c98Var4 = r1eVar4.e;
                        if (i13 >= c98Var4.size()) {
                            z16 = false;
                        } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                            z16 = true;
                        } else {
                            i13++;
                        }
                    }
                } else {
                    i13 = 0;
                    while (true) {
                        c98Var4 = r1eVar4.e;
                        if (i13 >= c98Var4.size()) {
                            z16 = false;
                        } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                            z16 = true;
                        } else {
                            i13++;
                        }
                    }
                }
                if (z16) {
                    num2 = 4;
                } else if (ry9VarQ.equals(c4dVar.q())) {
                    jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                    jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                    if (jB2 == 0) {
                        if (Math.abs(jB - jB2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jB - jB2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z17 = true;
                    num = 1;
                    num2 = 0;
                }
                z17 = true;
            }
        } else if (zP) {
            ry9VarQ = ((c4d) js8Var.a).q();
            ry9VarQ.getClass();
            q1eVar2 = r1eVar4.f;
            if (q1eVar2 == null) {
                i13 = 0;
                while (true) {
                    c98Var4 = r1eVar4.e;
                    if (i13 >= c98Var4.size()) {
                        z16 = false;
                    } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                        z16 = true;
                    } else {
                        i13++;
                    }
                }
            } else {
                i13 = 0;
                while (true) {
                    c98Var4 = r1eVar4.e;
                    if (i13 >= c98Var4.size()) {
                        z16 = false;
                    } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                        z16 = true;
                    } else {
                        i13++;
                    }
                }
            }
            if (z16) {
                num2 = 4;
            } else if (ry9VarQ.equals(c4dVar.q())) {
                jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                if (jB2 == 0) {
                    if (Math.abs(jB - jB2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                } else {
                    if (Math.abs(jB - jB2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                }
                num = num3;
            } else {
                z17 = true;
                num = 1;
                num2 = 0;
            }
            z17 = true;
        } else {
            ry9VarQ = ((c4d) js8Var.a).q();
            ry9VarQ.getClass();
            q1eVar2 = r1eVar4.f;
            if (q1eVar2 == null) {
                i13 = 0;
                while (true) {
                    c98Var4 = r1eVar4.e;
                    if (i13 >= c98Var4.size()) {
                        z16 = false;
                    } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                        z16 = true;
                    } else {
                        i13++;
                    }
                }
            } else {
                i13 = 0;
                while (true) {
                    c98Var4 = r1eVar4.e;
                    if (i13 >= c98Var4.size()) {
                        z16 = false;
                    } else if (ry9VarQ.equals(((q1e) c98Var4.get(i13)).a)) {
                        z16 = true;
                    } else {
                        i13++;
                    }
                }
            }
            if (z16) {
                num2 = 4;
            } else if (ry9VarQ.equals(c4dVar.q())) {
                jB = mz8.b(ov9Var2.b, ov9Var2.c, j4);
                jB2 = mz8.b(x2dVar2, d0aVar3, j4);
                if (jB2 == 0) {
                    if (Math.abs(jB - jB2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                } else {
                    if (Math.abs(jB - jB2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                }
                num = num3;
            } else {
                z17 = true;
                num = 1;
                num2 = 0;
            }
            z17 = true;
        }
        Pair pairCreate5 = Pair.create(num2, num);
        h0(z, ov9Var, true, js8Var6, (Integer) pairCreate5.first, (Integer) pairCreate5.second);
        if (this.o) {
            this.o = false;
            if (Looper.myLooper() == iu9Var.f.getLooper()) {
                z18 = z17;
            } else {
                z18 = false;
            }
            lvb.b0(z18);
            iu9Var.e.getClass();
        }
    }

    @Override // defpackage.hu9
    public final s2d c() {
        return ((c4d) this.p.a).g;
    }

    public final void c0() {
        tsh tshVar = new tsh();
        int i = 0;
        lvb.b0(d0() && !((c4d) this.p.a).j.p());
        c4d c4dVar = (c4d) this.p.a;
        r1e r1eVar = (r1e) c4dVar.j;
        int i2 = c4dVar.c.a.b;
        r1eVar.m(i2, tshVar, 0L);
        ry9 ry9Var = tshVar.b;
        if (r1eVar.q(i2) != -1) {
            boolean z = ((c4d) this.p.a).v;
            qg7 qg7Var = this.i;
            if (z) {
                ((MediaController.TransportControls) qg7Var.n().a).play();
            } else {
                ((MediaController.TransportControls) qg7Var.n().a).prepare();
            }
        } else {
            ly9 ly9Var = ry9Var.f;
            String str = ry9Var.a;
            if (ly9Var.a != null) {
                boolean z2 = ((c4d) this.p.a).v;
                qg7 qg7Var2 = this.i;
                if (z2) {
                    ft0 ft0VarN = qg7Var2.n();
                    Uri uri = ly9Var.a;
                    Bundle bundle = ly9Var.c;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) ft0VarN.a).playFromUri(uri, bundle);
                } else {
                    ft0 ft0VarN2 = qg7Var2.n();
                    Uri uri2 = ly9Var.a;
                    Bundle bundle2 = ly9Var.c;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) ft0VarN2.a).prepareFromUri(uri2, bundle2);
                }
            } else {
                String str2 = ly9Var.b;
                js8 js8Var = this.p;
                if (str2 != null) {
                    boolean z3 = ((c4d) js8Var.a).v;
                    qg7 qg7Var3 = this.i;
                    if (z3) {
                        ft0 ft0VarN3 = qg7Var3.n();
                        String str3 = ly9Var.b;
                        Bundle bundle3 = ly9Var.c;
                        if (bundle3 == null) {
                            bundle3 = Bundle.EMPTY;
                        }
                        ((MediaController.TransportControls) ft0VarN3.a).playFromSearch(str3, bundle3);
                    } else {
                        ft0 ft0VarN4 = qg7Var3.n();
                        String str4 = ly9Var.b;
                        Bundle bundle4 = ly9Var.c;
                        if (bundle4 == null) {
                            bundle4 = Bundle.EMPTY;
                        }
                        ((MediaController.TransportControls) ft0VarN4.a).prepareFromSearch(str4, bundle4);
                    }
                } else {
                    boolean z4 = ((c4d) js8Var.a).v;
                    qg7 qg7Var4 = this.i;
                    if (z4) {
                        ft0 ft0VarN5 = qg7Var4.n();
                        Bundle bundle5 = ly9Var.c;
                        if (bundle5 == null) {
                            bundle5 = Bundle.EMPTY;
                        }
                        ((MediaController.TransportControls) ft0VarN5.a).playFromMediaId(str, bundle5);
                    } else {
                        ft0 ft0VarN6 = qg7Var4.n();
                        Bundle bundle6 = ly9Var.c;
                        if (bundle6 == null) {
                            bundle6 = Bundle.EMPTY;
                        }
                        ((MediaController.TransportControls) ft0VarN6.a).prepareFromMediaId(str, bundle6);
                    }
                }
            }
        }
        if (((c4d) this.p.a).c.a.f != 0) {
            ((MediaController.TransportControls) this.i.n().a).seekTo(((c4d) this.p.a).c.a.f);
        }
        if (((h3d) this.p.c).a(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < r1eVar.o(); i3++) {
                if (i3 != i2 && r1eVar.q(i3) == -1) {
                    r1eVar.m(i3, tshVar, 0L);
                    arrayList.add(tshVar.b);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            vk1 vk1Var = new vk1(this, new AtomicInteger(0), arrayList, arrayList2, i, 1);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                byte[] bArr = ((ry9) arrayList.get(i4)).d.k;
                if (bArr == null) {
                    arrayList2.add(null);
                    vk1Var.run();
                } else {
                    e89 e89VarP = this.f.p(bArr);
                    arrayList2.add(e89VarP);
                    Handler handler = this.b.f;
                    Objects.requireNonNull(handler);
                    e89VarP.b(vk1Var, new cc5(0, handler));
                }
            }
        }
    }

    @Override // defpackage.hu9
    public final void connect() {
        xnf xnfVar = this.c;
        int type = xnfVar.a.getType();
        iu9 iu9Var = this.b;
        if (type != 0) {
            iu9Var.S(new lv9(this, 1));
            return;
        }
        Object objD = xnfVar.a.d();
        objD.getClass();
        iu9Var.S(new su6(this, 16, (u2a) objD));
        iu9Var.f.postDelayed(new lv9(this, 0), 500L);
    }

    @Override // defpackage.hu9
    public final boolean d() {
        return ((c4d) this.p.a).x;
    }

    public final boolean d0() {
        return ((c4d) this.p.a).A != 1;
    }

    @Override // defpackage.hu9
    public final long e() {
        long jV = gm0.v((c4d) this.p.a, this.q, this.r, this.b.g);
        this.q = jV;
        return jV;
    }

    public final void e0() {
        ou9 ou9Var;
        ArrayList arrayListA;
        x2d x2dVar;
        d0a d0aVarB;
        int shuffleMode;
        if (this.k || this.l) {
            return;
        }
        this.l = true;
        MediaController.PlaybackInfo playbackInfo = ((mu9) this.i.b).a.getPlaybackInfo();
        if (playbackInfo != null) {
            ou9Var = new ou9(playbackInfo.getPlaybackType(), p70.b(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), Build.VERSION.SDK_INT >= 30 ? playbackInfo.getVolumeControlId() : null);
        } else {
            ou9Var = null;
        }
        x2d x2dVarZ = Z(this.i.j());
        MediaMetadata metadata = ((mu9) this.i.b).a.getMetadata();
        if (metadata != null) {
            d0aVarB = d0a.b(metadata);
            arrayListA = null;
            x2dVar = x2dVarZ;
        } else {
            arrayListA = null;
            x2dVar = x2dVarZ;
            d0aVarB = null;
        }
        List<MediaSession.QueueItem> queue = ((mu9) this.i.b).a.getQueue();
        if (queue != null) {
            arrayListA = t2a.a(queue);
        }
        List listY = Y(arrayListA);
        CharSequence queueTitle = ((mu9) this.i.b).a.getQueueTitle();
        d38 d38VarA = ((mu9) this.i.b).e.a();
        int repeatMode = -1;
        if (d38VarA != null) {
            try {
                repeatMode = d38VarA.getRepeatMode();
            } catch (RemoteException | SecurityException e) {
                lvb.l0("MediaControllerCompat", "Dead object in getRepeatMode.", e);
            }
        }
        d38 d38VarA2 = ((mu9) this.i.b).e.a();
        if (d38VarA2 != null) {
            try {
                shuffleMode = d38VarA2.getShuffleMode();
            } catch (RemoteException | SecurityException e2) {
                lvb.l0("MediaControllerCompat", "Dead object in getShuffleMode.", e2);
                shuffleMode = -1;
            }
        } else {
            shuffleMode = -1;
        }
        b0(true, new ov9(ou9Var, x2dVar, d0aVarB, listY, queueTitle, repeatMode, shuffleMode, vqi.n(((mu9) this.i.b).a.getExtras())));
    }

    @Override // defpackage.hu9
    public final boolean f() {
        return ((c4d) this.p.a).c.b;
    }

    public final void f0(int i, int i2) {
        lvb.R(i >= 0 && i2 >= i);
        int iO = v().o();
        int iMin = Math.min(i2, iO);
        if (i >= iO || i == iMin) {
            return;
        }
        r1e r1eVar = (r1e) ((c4d) this.p.a).j;
        r1eVar.getClass();
        z88 z88Var = new z88(4);
        c98 c98Var = r1eVar.e;
        z88Var.f(c98Var.subList(0, i));
        z88Var.f(c98Var.subList(iMin, c98Var.size()));
        r1e r1eVar2 = new r1e(z88Var.h(), r1eVar.f);
        int iF = F();
        int i3 = iMin - i;
        if (iF >= i) {
            iF = iF < iMin ? -1 : iF - i3;
        }
        if (iF == -1) {
            iF = vqi.j(i, 0, r1eVar2.o() - 1);
            lvb.G0("MCImplLegacy", "Currently playing item is removed. Assumes item at " + iF + " is the new current item");
        }
        int i4 = iF;
        c4d c4dVar = (c4d) this.p.a;
        PlaybackException playbackException = c4dVar.a;
        int i5 = c4dVar.b;
        umf umfVar = c4dVar.c;
        k3d k3dVar = c4dVar.d;
        k3d k3dVar2 = c4dVar.e;
        int i6 = c4dVar.f;
        s2d s2dVar = c4dVar.g;
        int i7 = c4dVar.h;
        boolean z = c4dVar.i;
        k4j k4jVar = c4dVar.l;
        b0a b0aVar = c4dVar.m;
        float f = c4dVar.n;
        float f2 = c4dVar.o;
        int i8 = c4dVar.p;
        p70 p70Var = c4dVar.q;
        zy4 zy4Var = c4dVar.r;
        ok5 ok5Var = c4dVar.s;
        int i9 = c4dVar.t;
        boolean z2 = c4dVar.u;
        boolean z3 = c4dVar.v;
        int i10 = c4dVar.w;
        boolean z4 = c4dVar.x;
        boolean z5 = c4dVar.y;
        int i11 = c4dVar.z;
        int i12 = c4dVar.A;
        b0a b0aVar2 = c4dVar.B;
        long j = c4dVar.C;
        long j2 = c4dVar.D;
        long j3 = c4dVar.E;
        fzh fzhVar = c4dVar.F;
        ryh ryhVar = c4dVar.G;
        k3d k3dVar3 = umfVar.a;
        umf umfVar2 = new umf(new k3d(k3dVar3.a, i4, k3dVar3.c, k3dVar3.d, k3dVar3.e, k3dVar3.f, k3dVar3.g, k3dVar3.h, k3dVar3.i), umfVar.b, umfVar.c, umfVar.d, umfVar.e, umfVar.f, umfVar.g, umfVar.h, umfVar.i, umfVar.j);
        lvb.b0(r1eVar2.p() || umfVar2.a.b < r1eVar2.o());
        c4d c4dVar2 = new c4d(playbackException, i5, umfVar2, k3dVar, k3dVar2, i6, s2dVar, i7, z, k4jVar, r1eVar2, 0, b0aVar, f, f2, p70Var, i8, zy4Var, ok5Var, i9, z2, z3, i10, i11, i12, z4, z5, b0aVar2, j, j2, j3, fzhVar, ryhVar);
        js8 js8Var = this.p;
        i0(new js8(c4dVar2, (fmf) js8Var.b, (h3d) js8Var.c, (c98) js8Var.d, (Bundle) js8Var.e, null), null, null);
        if (d0()) {
            for (int i13 = i; i13 < iMin && i13 < this.m.d.size(); i13++) {
                qg7 qg7Var = this.i;
                uv9 uv9Var = ((t2a) this.m.d.get(i13)).a;
                mu9 mu9Var = (mu9) qg7Var.b;
                if ((mu9Var.a.getFlags() & 4) != 0) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, tab.h(uv9Var, MediaDescriptionCompat.CREATOR));
                    mu9Var.a.sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, null);
                } else {
                    c.i("This session doesn't support queue management operations");
                }
            }
        }
    }

    @Override // defpackage.hu9
    public final long g() {
        return ((c4d) this.p.a).c.g;
    }

    public final void g0(int i, long j) {
        Integer num;
        Integer num2;
        int i2;
        long j2;
        long j3;
        long j4;
        int i3 = i;
        long j5 = j;
        lvb.R(i3 >= 0);
        int iF = F();
        ush ushVar = ((c4d) this.p.a).j;
        if ((ushVar.p() || i3 < ushVar.o()) && !f()) {
            if (i3 != iF) {
                long jQ = ((r1e) ((c4d) this.p.a).j).q(i3);
                if (jQ != -1) {
                    ((MediaController.TransportControls) this.i.n().a).skipToQueueItem(jQ);
                    num = 2;
                } else {
                    qt4.y(i3, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", "MCImplLegacy");
                    i3 = iF;
                    num = null;
                }
            } else {
                i3 = iF;
                num = null;
            }
            long jE = e();
            if (j5 == -9223372036854775807L) {
                j5 = jE;
                num2 = null;
            } else {
                ((MediaController.TransportControls) this.i.n().a).seekTo(j5);
                num2 = 1;
            }
            if (num == null) {
                long jU = U();
                long duration = getDuration();
                long jMax = j5 < jE ? j5 : Math.max(j5, jU);
                j2 = jMax;
                i2 = duration == -9223372036854775807L ? 0 : (int) ((100 * jMax) / duration);
                j3 = jMax - j5;
                j4 = duration;
            } else {
                i2 = 0;
                j2 = 0;
                j3 = 0;
                j4 = -9223372036854775807L;
            }
            c4d c4dVarI = ((c4d) this.p.a).i(new umf(a0(i3, !ushVar.p() ? ushVar.m(i3, new tsh(), 0L).b : null, j5, false), false, SystemClock.elapsedRealtime(), j4, j2, i2, j3, -9223372036854775807L, j4, j2));
            if (c4dVarI.A != 1) {
                c4dVarI = c4dVarI.e(2, null);
            }
            c4d c4dVar = c4dVarI;
            js8 js8Var = this.p;
            i0(new js8(c4dVar, (fmf) js8Var.b, (h3d) js8Var.c, (c98) js8Var.d, (Bundle) js8Var.e, null), num2, num);
        }
    }

    @Override // defpackage.hu9
    public final long getDuration() {
        return ((c4d) this.p.a).c.d;
    }

    @Override // defpackage.hu9
    public final int getPlaybackState() {
        return ((c4d) this.p.a).A;
    }

    @Override // defpackage.hu9
    public final int getRepeatMode() {
        return ((c4d) this.p.a).h;
    }

    @Override // defpackage.hu9
    public final void h(ry9 ry9Var, long j) {
        x(0, j, c98.r(ry9Var));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h0(boolean z, ov9 ov9Var, boolean z2, final js8 js8Var, Integer num, Integer num2) {
        PlaybackException playbackExceptionL;
        final int i;
        final int i2;
        final int i3;
        pmf pmfVar = (pmf) js8Var.f;
        c98 c98Var = (c98) js8Var.d;
        ov9 ov9Var2 = this.m;
        js8 js8Var2 = this.p;
        if (ov9Var2 != ov9Var) {
            this.m = new ov9(ov9Var);
        }
        if (z2) {
            this.n = this.m;
        }
        this.p = js8Var;
        iu9 iu9Var = this.b;
        if (z) {
            iu9Var.P();
            c98 c98Var2 = (c98) js8Var2.d;
            c98Var2.getClass();
            if (j8f.a(c98Var2, c98Var)) {
                return;
            }
            iu9Var.f.post(new lv9(this, js8Var));
            return;
        }
        c4d c4dVar = (c4d) js8Var2.a;
        ush ushVar = c4dVar.j;
        c4d c4dVar2 = (c4d) js8Var.a;
        boolean zEquals = ushVar.equals(c4dVar2.j);
        final int i4 = 4;
        u89 u89Var = this.d;
        if (!zEquals) {
            u89Var.c(0, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i5 = i4;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i5) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        CharSequence charSequence = ov9Var2.e;
        CharSequence charSequence2 = ov9Var.e;
        x2d x2dVar = ov9Var.b;
        boolean zEquals2 = TextUtils.equals(charSequence, charSequence2);
        final int i5 = 5;
        if (!zEquals2) {
            u89Var.c(15, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i6 = i5;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i6) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        int i6 = 11;
        if (num != null) {
            u89Var.c(11, new oo(js8Var2, js8Var, num, i6));
        }
        int i7 = 2;
        if (num2 != null) {
            u89Var.c(1, new fv9(js8Var, i7, num2));
        }
        x2d x2dVar2 = ov9Var2.b;
        boolean z3 = x2dVar2 != null && x2dVar2.a == 7;
        boolean z4 = x2dVar != null && x2dVar.a == 7;
        final int i8 = 10;
        if (z3 && z4) {
            String str = vqi.a;
            if (x2dVar2.f != x2dVar.f || !TextUtils.equals(x2dVar2.g, x2dVar.g)) {
                playbackExceptionL = mz8.l(x2dVar, this.a);
                u89Var.c(10, new dv9(2, playbackExceptionL));
                if (playbackExceptionL != null) {
                    u89Var.c(10, new dv9(3, playbackExceptionL));
                }
            }
        } else if (z3 != z4) {
            playbackExceptionL = mz8.l(x2dVar, this.a);
            u89Var.c(10, new dv9(2, playbackExceptionL));
            if (playbackExceptionL != null) {
                u89Var.c(10, new dv9(3, playbackExceptionL));
            }
        }
        if (ov9Var2.c != ov9Var.c) {
            u89Var.c(14, new mv9(this));
        }
        if (c4dVar.A != c4dVar2.A) {
            final int i9 = 6;
            u89Var.c(4, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i10 = i9;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i10) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (c4dVar.v != c4dVar2.v) {
            i = 7;
            u89Var.c(5, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i10 = i;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i10) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        } else {
            i = 7;
        }
        final int i10 = 8;
        if (c4dVar.x != c4dVar2.x) {
            u89Var.c(i, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i11 = i10;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i11) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        final int i11 = 9;
        final int i12 = 12;
        if (!c4dVar.g.equals(c4dVar2.g)) {
            u89Var.c(12, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i13 = i11;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i13) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (c4dVar.h != c4dVar2.h) {
            u89Var.c(8, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i13 = i8;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i13) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (c4dVar.i != c4dVar2.i) {
            final int i13 = 11;
            u89Var.c(9, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i14 = i13;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i14) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (!c4dVar.q.equals(c4dVar2.q)) {
            u89Var.c(20, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i14 = i12;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i14) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (c4dVar.p != c4dVar2.p) {
            i2 = 0;
            u89Var.c(21, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i14 = i2;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i14) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        } else {
            i2 = 0;
        }
        if (c4dVar.s.equals(c4dVar2.s)) {
            i3 = 1;
        } else {
            i3 = 1;
            u89Var.c(29, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i14 = i3;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i14) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (c4dVar.t != c4dVar2.t || c4dVar.u != c4dVar2.u) {
            final int i14 = 2;
            u89Var.c(30, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i15 = i14;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i15) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (!((h3d) js8Var2.c).equals((h3d) js8Var.c)) {
            final int i15 = 3;
            u89Var.c(13, new r89() { // from class: kv9
                @Override // defpackage.r89
                public final void invoke(Object obj) {
                    int i16 = i15;
                    js8 js8Var3 = js8Var;
                    j3d j3dVar = (j3d) obj;
                    switch (i16) {
                        case 0:
                            j3dVar.f(((c4d) js8Var3.a).p);
                            break;
                        case 1:
                            j3dVar.Q(((c4d) js8Var3.a).s);
                            break;
                        case 2:
                            c4d c4dVar3 = (c4d) js8Var3.a;
                            j3dVar.I(c4dVar3.t, c4dVar3.u);
                            break;
                        case 3:
                            j3dVar.L0((h3d) js8Var3.c);
                            break;
                        case 4:
                            c4d c4dVar4 = (c4d) js8Var3.a;
                            j3dVar.y0(c4dVar4.j, c4dVar4.k);
                            break;
                        case 5:
                            j3dVar.K(((c4d) js8Var3.a).m);
                            break;
                        case 6:
                            j3dVar.z(((c4d) js8Var3.a).A);
                            break;
                        case 7:
                            j3dVar.i0(4, ((c4d) js8Var3.a).v);
                            break;
                        case 8:
                            j3dVar.Y0(((c4d) js8Var3.a).x);
                            break;
                        case 9:
                            j3dVar.K0(((c4d) js8Var3.a).g);
                            break;
                        case 10:
                            j3dVar.onRepeatModeChanged(((c4d) js8Var3.a).h);
                            break;
                        case 11:
                            j3dVar.E(((c4d) js8Var3.a).i);
                            break;
                        default:
                            j3dVar.b0(((c4d) js8Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (!((fmf) js8Var2.b).equals((fmf) js8Var.b)) {
            iu9Var.getClass();
            lvb.b0(Looper.myLooper() == iu9Var.f.getLooper() ? i3 : i2);
            iu9Var.e.s();
        }
        c98 c98Var3 = (c98) js8Var2.d;
        c98Var3.getClass();
        if (!j8f.a(c98Var3, c98Var)) {
            iu9Var.getClass();
            lvb.b0(Looper.myLooper() == iu9Var.f.getLooper() ? i3 : i2);
            gu9 gu9Var = iu9Var.e;
            gu9Var.getClass();
            gu9.p();
            gu9Var.o();
        }
        if (pmfVar != null) {
            iu9Var.getClass();
            lvb.b0(Looper.myLooper() == iu9Var.f.getLooper() ? i3 : i2);
            iu9Var.e.r(pmfVar);
        }
        u89Var.b();
    }

    @Override // defpackage.hu9
    public final void i() {
        ((MediaController.TransportControls) this.i.n().a).skipToPrevious();
    }

    public final void i0(js8 js8Var, Integer num, Integer num2) {
        h0(false, this.m, false, js8Var, num, num2);
    }

    @Override // defpackage.hu9
    public final boolean isConnected() {
        return this.l;
    }

    @Override // defpackage.hu9
    public final void j() {
        g0(F(), 0L);
    }

    @Override // defpackage.hu9
    public final void k(ryh ryhVar) {
    }

    @Override // defpackage.hu9
    public final void l() {
        ((MediaController.TransportControls) this.i.n().a).skipToPrevious();
    }

    @Override // defpackage.hu9
    public final PlaybackException m() {
        return ((c4d) this.p.a).a;
    }

    @Override // defpackage.hu9
    public final void n(boolean z) {
        c4d c4dVar = (c4d) this.p.a;
        if (c4dVar.v == z) {
            return;
        }
        this.q = gm0.v(c4dVar, this.q, this.r, this.b.g);
        this.r = SystemClock.elapsedRealtime();
        c4d c4dVarC = ((c4d) this.p.a).c(1, 0, z);
        js8 js8Var = this.p;
        i0(new js8(c4dVarC, (fmf) js8Var.b, (h3d) js8Var.c, (c98) js8Var.d, (Bundle) js8Var.e, null), null, null);
        if (!d0() || ((c4d) this.p.a).j.p()) {
            return;
        }
        qg7 qg7Var = this.i;
        if (z) {
            ((MediaController.TransportControls) qg7Var.n().a).play();
        } else {
            ((MediaController.TransportControls) qg7Var.n().a).pause();
        }
    }

    @Override // defpackage.hu9
    public final void o() {
        lvb.G0("MCImplLegacy", "Session doesn't support unmuting the player");
    }

    @Override // defpackage.hu9
    public final void p() {
        ((MediaController.TransportControls) this.i.n().a).skipToNext();
    }

    @Override // defpackage.hu9
    public final void pause() {
        n(false);
    }

    @Override // defpackage.hu9
    public final void play() {
        n(true);
    }

    @Override // defpackage.hu9
    public final void prepare() {
        c4d c4dVar = (c4d) this.p.a;
        if (c4dVar.A != 1) {
            return;
        }
        c4d c4dVarE = c4dVar.e(c4dVar.j.p() ? 4 : 2, null);
        js8 js8Var = this.p;
        i0(new js8(c4dVarE, (fmf) js8Var.b, (h3d) js8Var.c, (c98) js8Var.d, (Bundle) js8Var.e, null), null, null);
        if (((c4d) this.p.a).j.p()) {
            return;
        }
        c0();
    }

    @Override // defpackage.hu9
    public final fzh q() {
        return fzh.b;
    }

    @Override // defpackage.hu9
    public final void r(b0a b0aVar) {
        lvb.G0("MCImplLegacy", "Session doesn't support setting playlist metadata");
    }

    @Override // defpackage.hu9
    public final void release() {
        Messenger messenger;
        if (this.k) {
            return;
        }
        this.k = true;
        ks9 ks9Var = this.j;
        if (ks9Var != null) {
            is9 is9Var = (is9) ks9Var.b;
            ih ihVar = is9Var.f;
            if (ihVar != null && (messenger = is9Var.g) != null) {
                try {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 7;
                    messageObtain.arg1 = 1;
                    messageObtain.replyTo = messenger;
                    ((Messenger) ihVar.a).send(messageObtain);
                } catch (RemoteException unused) {
                    lvb.r0("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            is9Var.b.disconnect();
            this.j = null;
        }
        qg7 qg7Var = this.i;
        if (qg7Var != null) {
            Set set = (Set) qg7Var.c;
            nv9 nv9Var = this.e;
            if (set.remove(nv9Var)) {
                try {
                    ((mu9) qg7Var.b).b(nv9Var);
                    nv9Var.d(null);
                } catch (Throwable th) {
                    nv9Var.d(null);
                    throw th;
                }
            } else {
                lvb.G0("MediaControllerCompat", "the callback has never been registered");
            }
            nv9Var.d.removeCallbacksAndMessages(null);
            this.i = null;
        }
        this.l = false;
        this.d.d();
    }

    @Override // defpackage.hu9
    public final int s() {
        return -1;
    }

    @Override // defpackage.hu9
    public final void seekTo(long j) {
        g0(F(), j);
    }

    @Override // defpackage.hu9
    public final void setPlaybackSpeed(float f) {
        if (f != c().a) {
            c4d c4dVarD = ((c4d) this.p.a).d(new s2d(f));
            js8 js8Var = this.p;
            i0(new js8(c4dVarD, (fmf) js8Var.b, (h3d) js8Var.c, (c98) js8Var.d, (Bundle) js8Var.e, null), null, null);
        }
        this.i.n().C(f);
    }

    @Override // defpackage.hu9
    public final void setRepeatMode(int i) {
        if (i != getRepeatMode()) {
            c4d c4dVarH = ((c4d) this.p.a).h(i);
            js8 js8Var = this.p;
            i0(new js8(c4dVarH, (fmf) js8Var.b, (h3d) js8Var.c, (c98) js8Var.d, (Bundle) js8Var.e, null), null, null);
        }
        ft0 ft0VarN = this.i.n();
        int iM = mz8.m(i);
        Bundle bundle = new Bundle();
        bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, iM);
        ft0VarN.B(MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
    }

    @Override // defpackage.hu9
    public final void stop() {
        c4d c4dVar = (c4d) this.p.a;
        if (c4dVar.A == 1) {
            return;
        }
        umf umfVar = c4dVar.c;
        k3d k3dVar = umfVar.a;
        boolean z = umfVar.b;
        long j = umfVar.d;
        long j2 = k3dVar.f;
        c4d c4dVarI = c4dVar.i(new umf(k3dVar, z, SystemClock.elapsedRealtime(), j, j2, gm0.e(j2, j), 0L, -9223372036854775807L, j, j2));
        c4d c4dVar2 = (c4d) this.p.a;
        if (c4dVar2.A != 1) {
            c4dVarI = c4dVarI.e(1, c4dVar2.a);
        }
        c4d c4dVar3 = c4dVarI;
        js8 js8Var = this.p;
        i0(new js8(c4dVar3, (fmf) js8Var.b, (h3d) js8Var.c, (c98) js8Var.d, (Bundle) js8Var.e, null), null, null);
        ((MediaController.TransportControls) this.i.n().a).stop();
    }

    @Override // defpackage.hu9
    public final void t(ry9 ry9Var) {
        h(ry9Var, -9223372036854775807L);
    }

    @Override // defpackage.hu9
    public final int u() {
        return 0;
    }

    @Override // defpackage.hu9
    public final ush v() {
        return ((c4d) this.p.a).j;
    }

    @Override // defpackage.hu9
    public final void w() {
        lvb.G0("MCImplLegacy", "Session doesn't support muting the player");
    }

    @Override // defpackage.hu9
    public final void x(int i, long j, List list) {
        if (list.isEmpty()) {
            f0(0, Integer.MAX_VALUE);
            return;
        }
        r1e r1eVar = r1e.g;
        r1eVar.getClass();
        z88 z88Var = new z88(4);
        c98 c98Var = r1eVar.e;
        z88Var.f(c98Var.subList(0, 0));
        for (int i2 = 0; i2 < list.size(); i2++) {
            z88Var.c(new q1e((ry9) list.get(i2), -1L, -9223372036854775807L));
        }
        z88Var.f(c98Var.subList(0, c98Var.size()));
        c4d c4dVarL = ((c4d) this.p.a).l(new r1e(z88Var.h(), r1eVar.f), new umf(a0(i, (ry9) list.get(i), j == -9223372036854775807L ? 0L : j, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        js8 js8Var = this.p;
        i0(new js8(c4dVarL, (fmf) js8Var.b, (h3d) js8Var.c, (c98) js8Var.d, (Bundle) js8Var.e, null), null, null);
        if (d0()) {
            c0();
        }
    }

    @Override // defpackage.hu9
    public final void y() {
        ((MediaController.TransportControls) this.i.n().a).skipToNext();
    }

    @Override // defpackage.hu9
    public final boolean z() {
        return ((c4d) this.p.a).v;
    }
}
