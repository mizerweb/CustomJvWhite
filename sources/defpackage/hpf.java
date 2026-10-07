package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.Size;
import android.widget.TextView;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import one.me.stories.viewer.viewer.widgets.writebar.StoriesWriteBarWidget;
import one.me.transparent.TransparentWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hpf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpf(lq4 lq4Var, hli hliVar) {
        super(2, lq4Var);
        this.e = 16;
        this.f = hliVar;
    }

    private final Object l(Object obj) {
        vo8 vo8VarA;
        Object next;
        ch3.d0(obj);
        if (!((hli) this.f).h.b()) {
            ze2 ze2VarA = ((hli) this.f).a.a();
            hmi hmiVar = ((hli) this.f).a;
            hmiVar.c.b = hmiVar.a();
            lh2 lh2Var = hmiVar.b;
            ze2 ze2VarA2 = hmiVar.a();
            synchronized (lh2Var.a) {
                try {
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "Camera graph updated from " + lh2Var.d + " to " + ze2VarA2);
                    }
                    of2 of2Var = lh2Var.e;
                    of2 of2Var2 = of2.c;
                    if (of2Var != of2Var2) {
                        lh2Var.c(of2.e, null);
                        lh2Var.c(of2Var2, null);
                    }
                    lh2Var.d = ze2VarA2;
                    lh2Var.e = of2Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (ze2VarA.o.b()) {
                c.p(ze2VarA, " after calling close()", "Cannot start ");
                return null;
            }
            Trace.beginSection(ze2VarA + "#start");
            StringBuilder sb = new StringBuilder("Starting ");
            sb.append(ze2VarA);
            Log.i("CXCP", sb.toString());
            yp7 yp7Var = ze2VarA.b;
            yp7Var.getClass();
            Log.d("CXCP", yp7Var + " onGraphStarting");
            mjg mjgVar = yp7Var.e;
            dq7 dq7Var = dq7.c;
            mjgVar.getClass();
            mjgVar.j(null, dq7Var);
            for (iq7 iq7Var : yp7Var.d) {
                lh2 lh2Var2 = iq7Var.a;
                ze2 ze2Var = iq7Var.b;
                if (ze2Var == null) {
                    ze2Var = null;
                }
                lh2Var2.b(ze2Var, dq7Var);
            }
            kb2 kb2Var = ze2VarA.e;
            synchronized (kb2Var.p) {
                kb2Var.f();
            }
            Trace.endSection();
            Map map = (Map) ((hli) this.f).a.f.getValue();
            hli hliVar = (hli) this.f;
            nmf nmfVar = (nmf) hliVar.j.getValue();
            lmf lmfVar = ((kmf) nmfVar.e.getValue()).c() ? (lmf) nmfVar.f.getValue() : null;
            if (lmfVar != null) {
                List listUnmodifiableList = Collections.unmodifiableList(lmfVar.g.a);
                Iterator it = lmfVar.b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (listUnmodifiableList.contains((wf5) next));
                wf5 wf5Var = (wf5) next;
                if (wf5Var != null) {
                }
            }
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "Setting up Surfaces with UseCaseSurfaceManager");
            }
            if (((kmf) ((nmf) ((hli) this.f).j.getValue()).e.getValue()).c()) {
                nmi nmiVar = (nmi) ((hli) this.f).i.getValue();
                nmf nmfVar2 = (nmf) ((hli) this.f).j.getValue();
                synchronized (nmiVar.e) {
                    try {
                        if (nmiVar.f != null) {
                            throw new IllegalStateException("Surfaces should only be set up once!");
                        }
                        if (nmiVar.i != null) {
                            throw new IllegalStateException("Surfaces being setup after stopped!");
                        }
                        if (nmiVar.h != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        List list = (List) nmfVar2.g.getValue();
                        try {
                            prl.b(list);
                            yf5 yf5VarH = yab.h(nmiVar.a.a, null, 0, new gv7(nmfVar2, nmiVar, list, map, ze2VarA, null, 19), 3);
                            yf5VarH.Y(new sl6(1, list));
                            nmiVar.f = yf5VarH;
                            vo8VarA = yf5VarH;
                        } catch (DeferrableSurface$SurfaceClosedException e) {
                            if (tvj.f(5, "CXCP")) {
                                Log.w("CXCP", "Failed to increment DeferrableSurfaces: Surfaces closed");
                            }
                            yab.i0(nmiVar.a.a, null, 0, new j8g(nmfVar2, e, (lq4) null, 23), 3);
                            vo8VarA = qyj.a(Boolean.FALSE);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                vo8VarA.Y(dz7.r);
            } else if (tvj.f(6, "CXCP")) {
                Log.e("CXCP", "Unable to create capture session due to conflicting configurations");
            }
        } else if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCamera is closed before starting the CameraGraph, skipping setup.");
        }
        return sbi.a;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new hpf((ipf) obj2, lq4Var, 0);
            case 1:
                return new hpf((lqe) obj2, lq4Var, 1);
            case 2:
                return new hpf((xpf) obj2, lq4Var, 2);
            case 3:
                return new hpf((xqf) obj2, lq4Var, 3);
            case 4:
                return new hpf((kwf) obj2, lq4Var, 4);
            case 5:
                return new hpf((xhg) obj2, lq4Var, 5);
            case 6:
                return new hpf((amg) obj2, lq4Var, 6);
            case 7:
                return new hpf((cf7) obj2, lq4Var, 7);
            case 8:
                return new hpf((StoriesWriteBarWidget) obj2, lq4Var, 8);
            case 9:
                return new hpf((oxg) obj2, lq4Var, 9);
            case 10:
                return new hpf((knh) obj2, lq4Var, 10);
            case 11:
                return new hpf((eoh) obj2, lq4Var, 11);
            case 12:
                return new hpf((drh) obj2, lq4Var, 12);
            case 13:
                return new hpf((TransparentWidget) obj2, lq4Var, 13);
            case 14:
                return new hpf((b7i) obj2, lq4Var, 14);
            case 15:
                return new hpf((p8i) obj2, lq4Var, 15);
            case 16:
                return new hpf(lq4Var, (hli) obj2);
            case 17:
                return new hpf((dti) obj2, lq4Var, 17);
            case 18:
                return new hpf((pti) obj2, lq4Var, 18);
            case 19:
                return new hpf((hyi) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new hpf((g1j) obj2, lq4Var, 20);
            case 21:
                return new hpf((Size) obj2, lq4Var, 21);
            case 22:
                return new hpf((f2j) obj2, lq4Var, 22);
            case 23:
                return new hpf((i6j) obj2, lq4Var, 23);
            case 24:
                return new hpf((TextView) obj2, lq4Var, 24);
            case 25:
                return new hpf((v30) obj2, lq4Var, 25);
            case 26:
                return new hpf((rej) obj2, lq4Var, 26);
            default:
                return new hpf((skj) obj2, lq4Var, 27);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((hpf) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((hpf) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((hpf) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((hpf) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                ((hpf) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                return ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                ((hpf) create((uxi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                ((hpf) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((hpf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:310:0x0a00  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object obj2;
        Object value;
        msf isfVar;
        ynh tnhVar;
        Object value2;
        Object value3;
        tnh tnhVar2;
        vnh vnhVar;
        ok8 ok8Var;
        Object value4;
        int i = 5;
        int i2 = -1;
        int i3 = 0;
        i = 0;
        int i4 = 0;
        i = 0;
        int i5 = 0;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                ipf ipfVar = (ipf) this.f;
                c79 c79VarW = yab.w();
                zv8[] zv8VarArr = ipf.i;
                c79VarW.add(new abf(0, w7c.v, new tnh(R.string.oneme_settings_media_screen_autoloading_section)));
                c79VarW.add(new bbf(1, new tnh(R.string.oneme_settings_media_action_always), 0, w7c.p, (osf) null, (tnh) null, new jsf(ipfVar.C(0), true), (bz8) null, 432));
                c79VarW.add(new bbf(2, new tnh(R.string.oneme_settings_media_action_wifi), 0, w7c.s, (osf) null, (tnh) null, new jsf(ipfVar.C(1), true), (bz8) null, 432));
                c79VarW.add(new bbf(3, new tnh(R.string.oneme_settings_media_action_never), 0, w7c.q, (osf) null, (tnh) null, new jsf(ipfVar.C(-1), true), (bz8) null, 432));
                c79VarW.add(new zaf(new tnh(R.string.oneme_settings_media_video_autoload_desc), 0, 0L, 12));
                if (!ipfVar.C(-1)) {
                    c79VarW.add(new abf(1, w7c.z, new tnh(R.string.oneme_settings_media_screen_max_size_video_section)));
                    Iterator it = gpf.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((gpf) next).b == ((nni) ipfVar.d.getValue()).d.getInt("app.video.auto.load.size", 10)) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    gpf gpfVar = (gpf) obj2;
                    if (gpfVar == null) {
                        gpfVar = gpf.FIRST_STEP;
                    }
                    int i6 = w7c.B;
                    c79VarW.add(new cbf(new dbf(new vnh(R.string.oneme_settings_media_size, a.n1(new Object[]{Integer.valueOf(gpfVar.b)})), gpfVar.a), new dbf(new vnh(R.string.oneme_settings_media_size, a.n1(new Object[]{3})), 0.0f), new dbf(new vnh(R.string.oneme_settings_media_size_gb, a.n1(new Object[]{2})), 3.0f)));
                    c79VarW.add(new zaf(new tnh(R.string.oneme_settings_media_video_autoload_size_desc), 1, w7c.y, 4));
                }
                ipfVar.e.setValue(yab.j(c79VarW));
                return sbi.a;
            case 1:
                ch3.d0(obj);
                lqe lqeVar = (lqe) this.f;
                sgg sggVar = lqeVar.h;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                lqeVar.h = null;
                lqeVar.i.B(lqeVar, lqe.l[0], yab.h0((ite) lqeVar.d.getValue(), ((n0c) ((xhh) lqeVar.f.getValue())).b(), 2, new je0(lqeVar, null, 5)));
                return sbi.a;
            case 2:
                ch3.d0(obj);
                xpf xpfVar = (xpf) this.f;
                c79 c79VarW2 = yab.w();
                dqe dqeVar = xpfVar.c.b;
                c79VarW2.add(new jbf(1, new tnh(R.string.oneme_settings_ringtone_default_section), 0, y7c.c, dqeVar instanceof bqe ? new gsf(true) : null, null, null, 944));
                c79VarW2.add(new jbf(3, new tnh(R.string.oneme_settings_ringtone_system_section), 0, y7c.e, dqeVar instanceof cqe ? new gsf(true) : null, null, null, 944));
                c79VarW2.add(new ibf(new tnh(R.string.oneme_settings_ringtone_custom_section_header)));
                dqe dqeVar2 = xpfVar.c.b;
                Collection collectionValues = xpfVar.m.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (((File) obj3).exists()) {
                        arrayList.add(obj3);
                    }
                }
                List listM1 = ww3.M1(arrayList, new xa8(xpfVar));
                int i7 = 0;
                for (Object obj4 : listM1) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        xw3.V0();
                        throw null;
                    }
                    File file = (File) obj4;
                    xpfVar.m.put(file.getAbsolutePath(), file);
                    bz8 bz8Var = new bz8(R.drawable.icon_music, i3, 6);
                    c79 c79Var = c79VarW2;
                    long jHashCode = file.getAbsolutePath().hashCode();
                    String name = file.getName();
                    int iZ0 = r5h.Z0(".", name, 6);
                    if (iZ0 != i2) {
                        name = name.substring(i3, iZ0);
                    }
                    xnh xnhVar = new xnh(name);
                    int i9 = i7 == 0 ? 1 : (i7 == xw3.O0(listM1) && listM1.size() == 10) ? 3 : 2;
                    gsf gsfVar = new gsf(true);
                    String str = xpfVar.q;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "selected ringtone: " + dqeVar2 + ", ringtone: " + file.getAbsolutePath(), null);
                        }
                    }
                    c79Var.add(new jbf(i9, xnhVar, 1, jHashCode, ((dqeVar2 instanceof aqe) && cqk.d(((aqe) dqeVar2).a, file.getAbsolutePath())) ? gsfVar : null, bz8Var, file.getAbsolutePath(), 48));
                    c79VarW2 = c79Var;
                    i7 = i8;
                    i2 = -1;
                    i3 = 0;
                }
                c79 c79Var2 = c79VarW2;
                if (listM1.size() < 10) {
                    c79Var2.add(new jbf(listM1.isEmpty() ? 4 : 3, new tnh(R.string.oneme_settings_ringtone_custom_section_add), 1, y7c.b, null, new bz8(R.drawable.icon_plus, 0, 6), null, 864));
                }
                tnh tnhVar3 = xpfVar.m.size() != 10 ? new tnh(R.string.oneme_settings_ringtone_custom_section_bottom) : new tnh(R.string.oneme_settings_ringtone_custom_section_bottom_full);
                int i10 = y7c.f;
                c79Var2.add(new hbf(tnhVar3));
                c79 c79VarJ = yab.j(c79Var2);
                mjg mjgVar = ((xpf) this.f).j;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, c79VarJ));
                return sbi.a;
            case 3:
                ch3.d0(obj);
                xqf xqfVar = (xqf) this.f;
                c79 c79VarW3 = yab.w();
                zv8[] zv8VarArr2 = xqf.o;
                xqfVar.getClass();
                c79VarW3.add(new naf(4, new tnh(R.string.oneme_settings_battery_video_quality), 0, R.id.oneme_settings_battery_item_video_quality, new tnh(R.string.oneme_settings_battery_battery_hint), new isf(new xnh(xqfVar.C().l().a.a), null), 16));
                c79VarW3.add(new maf(new tnh(R.string.oneme_settings_battery_screen_autoplaying_section), R.id.oneme_settings_battery_screen_autoplaying_section_header));
                if (((Boolean) ((e5d) xqfVar.f.getValue()).C().i()).booleanValue()) {
                    isfVar = new ksf(xqfVar.C().d.getInt("app.video.auto.play", 1) != -1, true);
                } else {
                    int i11 = xqfVar.C().d.getInt("app.video.auto.play", 1);
                    if (i11 == -1) {
                        tnhVar = new tnh(R.string.oneme_settings_battery_action_disabled);
                    } else if (i11 != 0) {
                        tnhVar = i11 != 1 ? new xnh("") : new tnh(R.string.oneme_settings_battery_action_wifi);
                    } else {
                        tnhVar = new tnh(R.string.oneme_settings_battery_action_always);
                    }
                    isfVar = new isf(tnhVar, null);
                }
                c79VarW3.add(new naf(1, new tnh(R.string.oneme_settings_battery_video), 1, u7c.b, null, isfVar, 48));
                c79VarW3.add(new naf(2, new tnh(R.string.oneme_settings_battery_gif_play), 1, R.id.oneme_settings_battery_item_gif_available, null, new ksf(xqfVar.C().d.getBoolean("app.media.autoplay.gif", true), true), 48));
                c79VarW3.add(new naf(2, new tnh(R.string.oneme_settings_battery_animoji), 1, R.id.oneme_settings_battery_item_animoji_enabled, null, new ksf(((jn) xqfVar.e.getValue()).a(), true), 48));
                c79VarW3.add(new naf(3, new tnh(R.string.oneme_settings_battery_playlist), 1, u7c.a, null, new ksf(xqfVar.C().d.getBoolean("app.media.autoplay.playlist", true), true), 48));
                c79VarW3.add(new laf(new tnh(R.string.oneme_settings_battery_autoplay_hint), R.id.oneme_settings_battery_screen_autoplay_footer));
                c79 c79VarJ2 = yab.j(c79VarW3);
                mjg mjgVar2 = xqfVar.g;
                do {
                    value2 = mjgVar2.getValue();
                } while (!mjgVar2.h(value2, c79VarJ2));
                return sbi.a;
            case 4:
                ch3.d0(obj);
                kwf kwfVar = (kwf) this.f;
                dc9 dc9VarA = ((hq6) kwfVar.e.getValue()).a();
                ArrayList arrayList2 = new ArrayList();
                y1 y1Var = new y1(0, s71.k);
                long j = 0;
                while (y1Var.hasNext()) {
                    s71 s71Var = (s71) y1Var.next();
                    long jH = dc9VarA.H(hgl.b(s71Var));
                    if (jH != 0) {
                        arrayList2.add(new r71(s71Var, jH));
                        j += jH;
                    }
                }
                if (arrayList2.size() > 1) {
                    bx3.Y0(arrayList2, new xa8(28));
                }
                mjg mjgVar3 = kwfVar.h;
                do {
                    value3 = mjgVar3.getValue();
                } while (!mjgVar3.h(value3, new a81(j, arrayList2)));
                return sbi.a;
            case 5:
                ch3.d0(obj);
                xhg xhgVar = (xhg) this.f;
                mjg mjgVar4 = xhgVar.r;
                c79 c79VarW4 = yab.w();
                c79VarW4.add(new lv4(R.id.oneme_startconversations_create_chat, R.drawable.icon_users, new tnh(R.string.chat_create)));
                if (((Boolean) ((g5d) xhgVar.e).a.w0.a(e5d.S6[72]).i()).booleanValue()) {
                    c79VarW4.add(new lv4(R.id.oneme_startconversations_create_channel, R.drawable.icon_megaphone, new tnh(xhgVar.f ? R.string.oneme_startconversations_chat_titleicon_confirm_button_title_channel : R.string.create_channel_short)));
                }
                c79VarW4.add(new lv4(R.id.oneme_startconversations_create_group_call, R.drawable.icon_call, new tnh(R.string.oneme_create_group_call_button_text)));
                mjgVar4.setValue(yab.j(c79VarW4));
                return sbi.a;
            case 6:
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                amg amgVar = (amg) this.f;
                zv8[] zv8VarArr3 = amg.G;
                rt2 rt2Var = (rt2) ((xn3) amgVar.k.getValue()).k(((amg) this.f).c).a.getValue();
                if (rt2Var != null) {
                    mjg mjgVar5 = ((amg) this.f).x;
                    rt2Var.K0();
                    CharSequence charSequence = rt2Var.j;
                    mjgVar5.getClass();
                    mjgVar5.j(null, charSequence);
                }
                return sbiVar;
            case 7:
                ch3.d0(obj);
                ((cf7) this.f).invoke(Boolean.FALSE);
                return sbi.a;
            case 8:
                ch3.d0(obj);
                StoriesWriteBarWidget storiesWriteBarWidget = (StoriesWriteBarWidget) this.f;
                zv8[] zv8VarArr4 = StoriesWriteBarWidget.n;
                storiesWriteBarWidget.q1(storiesWriteBarWidget.r1());
                return sbi.a;
            case 9:
                ch3.d0(obj);
                oxg oxgVar = (oxg) this.f;
                zv8[] zv8VarArr5 = oxg.q;
                oxgVar.c();
                return sbi.a;
            case 10:
                ch3.d0(obj);
                ((knh) this.f).d.clear();
                return sbi.a;
            case 11:
                eoh eohVar = (eoh) this.f;
                mjg mjgVar6 = eohVar.g;
                ch3.d0(obj);
                u8b u8bVar = new u8b();
                ma6 ma6Var = znh.d;
                ma6Var.getClass();
                y1 y1Var2 = new y1(0, ma6Var);
                while (y1Var2.hasNext()) {
                    znh znhVar = (znh) y1Var2.next();
                    u8bVar.b(new jp7(znhVar.name(), znhVar.b, znhVar.a));
                }
                for (nbc nbcVar : eohVar.l) {
                    String str2 = nbcVar.c;
                    vyh vyhVar = nbcVar.a.C().a;
                    int i12 = hm0.b;
                    u8bVar.b(new pph(np4.k(str2, false).a, (int[]) vyhVar.f, str2));
                }
                mjg mjgVar7 = eohVar.e;
                mjgVar7.getClass();
                mjgVar7.j(null, u8bVar);
                if (mjgVar6.getValue() == null && u8bVar.j()) {
                    aoh aohVar = (aoh) (u8bVar.i() ? null : u8bVar.g(0));
                    mjgVar6.setValue(aohVar != null ? aohVar.getName() : null);
                }
                eoh.a(eohVar);
                return sbi.a;
            case 12:
                ch3.d0(obj);
                drh drhVar = (drh) this.f;
                mjg mjgVar8 = drhVar.d;
                ArrayList arrayListA = ((zk7) drhVar.f.getValue()).a();
                mjgVar8.getClass();
                mjgVar8.j(null, arrayListA);
                return sbi.a;
            case 13:
                ch3.d0(obj);
                TransparentWidget transparentWidget = (TransparentWidget) this.f;
                if (transparentWidget.isAttached()) {
                    transparentWidget.r1();
                } else {
                    transparentWidget.addLifecycleListener(new a4i(transparentWidget, 0));
                }
                return sbi.a;
            case 14:
                ch3.d0(obj);
                int iOrdinal = ((b7i) this.f).d.ordinal();
                if (iOrdinal == 0) {
                    b7i b7iVar = (b7i) this.f;
                    int i13 = b7iVar.D().a;
                    int i14 = i13 >= 1 ? i13 : 1;
                    int i15 = b7iVar.D().b;
                    if (i15 != Integer.MAX_VALUE && i15 > 0) {
                        i5 = b7iVar.D().b;
                    }
                    int i16 = i5;
                    pnh pnhVar = new pnh(R.plurals.oneme_settings_twofa_creation_password_symbols_count, i14);
                    tnh tnhVar4 = b7iVar.c == w6i.a ? new tnh(R.string.oneme_settings_twofa_creation_password_title) : new tnh(R.string.oneme_settings_twofa_creation_new_password_title);
                    mjg mjgVar9 = b7iVar.o;
                    u8i u8iVar = new u8i(tnhVar4, new v8i(new tnh(R.string.oneme_settings_twofa_creation_password_first_hint), pnhVar, i14, i16, 12), new v8i(new tnh(R.string.oneme_settings_twofa_creation_password_second_hint), null, 0, i16, 22));
                    mjgVar9.getClass();
                    mjgVar9.j(null, u8iVar);
                } else if (iOrdinal == 1) {
                    b7i b7iVar2 = (b7i) this.f;
                    int i17 = b7iVar2.D().c;
                    if (i17 != Integer.MAX_VALUE && i17 > 0) {
                        i4 = b7iVar2.D().c;
                    }
                    mjg mjgVar10 = b7iVar2.o;
                    t8i t8iVar = new t8i(new tnh(R.string.oneme_settings_twofa_creation_hint_title), new tnh(R.string.oneme_settings_twofa_creation_hint_subtitle), new v8i(new tnh(R.string.oneme_settings_twofa_creation_hint_input_hint), null, 0, i4, 94));
                    mjgVar10.getClass();
                    mjgVar10.j(null, t8iVar);
                } else if (iOrdinal == 2) {
                    b7i b7iVar3 = (b7i) this.f;
                    w6i w6iVar = b7iVar3.c;
                    if (w6iVar == w6i.c) {
                        String str3 = b7iVar3.h;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4c.f(a4cVar2, je9.g, str3, "Can't open email step for restore", null, null, 8);
                        }
                    } else {
                        pk8 pk8Var = b7iVar3.g;
                        String str4 = (pk8Var == null || (ok8Var = pk8Var.c) == null) ? null : ok8Var.b;
                        if (w6iVar != w6i.b || str4 == null) {
                            tnhVar2 = new tnh(R.string.oneme_settings_twofa_creation_email_title);
                            vnhVar = null;
                        } else {
                            tnhVar2 = new tnh(R.string.oneme_settings_twofa_creation_new_email_title);
                            vnhVar = new vnh(R.string.oneme_settings_twofa_creation_new_email_description, a.n1(Arrays.copyOf(new Object[]{str4}, 1)));
                        }
                        mjg mjgVar11 = b7iVar3.o;
                        r8i r8iVar = new r8i(tnhVar2, new tnh(R.string.oneme_settings_twofa_creation_email_empty_confirmation_description), new v8i(new tnh(R.string.oneme_settings_twofa_creation_email_hint), vnhVar, 0, 0, 124));
                        mjgVar11.getClass();
                        mjgVar11.j(null, r8iVar);
                    }
                } else {
                    if (iOrdinal != 3) {
                        ore.o();
                        return null;
                    }
                    b7i b7iVar4 = (b7i) this.f;
                    pk8 pk8Var2 = b7iVar4.g;
                    ok8 ok8Var2 = pk8Var2 != null ? pk8Var2.c : null;
                    if (ok8Var2 == null) {
                        ore.p("Required value was null.");
                        return null;
                    }
                    mjg mjgVar12 = b7iVar4.o;
                    tnh tnhVar5 = new tnh(R.string.oneme_settings_twofa_creation_email_verify_title);
                    String str5 = ok8Var2.a;
                    if (str5 == null) {
                        ore.p("Required value was null.");
                        return null;
                    }
                    w8i w8iVar = new w8i(tnhVar5, new vnh(R.string.oneme_settings_twofa_creation_email_verify_subtitle, a.n1(new Object[]{str5})), ok8Var2.c);
                    mjgVar12.getClass();
                    mjgVar12.j(null, w8iVar);
                    mjg mjgVar13 = b7iVar4.s;
                    Long lValueOf = Long.valueOf(ok8Var2.d);
                    mjgVar13.getClass();
                    mjgVar13.j(null, lValueOf);
                    sgg sggVar2 = b7iVar4.x;
                    if (sggVar2 != null) {
                        sggVar2.b(null);
                    }
                    b7iVar4.x = null;
                    b7iVar4.x = a8j.t(b7iVar4, null, new aug(b7iVar4, null, 1), 3);
                }
                return sbi.a;
            case 15:
                ch3.d0(obj);
                p8i p8iVar = (p8i) this.f;
                pk8 pk8Var3 = p8iVar.d;
                ok8 ok8Var3 = pk8Var3 != null ? pk8Var3.c : null;
                if (ok8Var3 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                mjg mjgVar14 = p8iVar.k;
                tnh tnhVar6 = new tnh(R.string.oneme_settings_twofa_creation_email_verify_title);
                String str6 = ok8Var3.a;
                w8i w8iVar2 = new w8i(tnhVar6, new vnh(R.string.oneme_settings_twofa_creation_email_verify_subtitle, a.n1(new Object[]{str6 != null ? str6 : ""})), ok8Var3.c);
                mjgVar14.getClass();
                mjgVar14.j(null, w8iVar2);
                mjg mjgVar15 = p8iVar.m;
                Long lValueOf2 = Long.valueOf(ok8Var3.d);
                mjgVar15.getClass();
                mjgVar15.j(null, lValueOf2);
                sgg sggVar3 = p8iVar.q;
                if (sggVar3 != null) {
                    sggVar3.b(null);
                }
                p8iVar.q = null;
                p8iVar.q = a8j.t(p8iVar, null, new aug(p8iVar, null, 2), 3);
                return sbi.a;
            case 16:
                return l(obj);
            case 17:
                ch3.d0(obj);
                dti dtiVar = (dti) this.f;
                String str7 = dtiVar.e;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar3.b(je9Var2)) {
                        rui ruiVar = dtiVar.h;
                        a4cVar3.c(je9Var2, str7, iic.m(ruiVar != null ? new Long(ruiVar.k()) : null, "VideoContent(", "): onRenderedFirstFrame"), null);
                    }
                }
                dti dtiVar2 = (dti) this.f;
                if (dtiVar2.h == null) {
                    String str8 = dtiVar2.e;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var3 = je9.f;
                        if (a4cVar4.b(je9Var3)) {
                            rui ruiVar2 = dtiVar2.h;
                            a4cVar4.c(je9Var3, str8, iic.m(ruiVar2 != null ? new Long(ruiVar2.k()) : null, "VideoContent(", "): VideoContent is null! Skip handling"), null);
                        }
                    }
                } else if (dtiVar2.j.add(cti.c)) {
                    String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - dtiVar2.i);
                    ul9 ul9Var = new ul9();
                    ul9Var.putAll(dtiVar2.k);
                    y0e y0eVar = (y0e) dtiVar2.m.invoke();
                    if (y0eVar != null) {
                        switch (y0eVar.ordinal()) {
                            case 0:
                                i = 8;
                                ul9Var.put("quality", new Integer(i));
                                break;
                            case 1:
                                i = 7;
                                ul9Var.put("quality", new Integer(i));
                                break;
                            case 2:
                                i = 6;
                                ul9Var.put("quality", new Integer(i));
                                break;
                            case 3:
                                ul9Var.put("quality", new Integer(i));
                                break;
                            case 4:
                                i = 4;
                                ul9Var.put("quality", new Integer(i));
                                break;
                            case 5:
                                i = 3;
                                ul9Var.put("quality", new Integer(i));
                                break;
                            case 6:
                                i = 2;
                                ul9Var.put("quality", new Integer(i));
                                break;
                            case 7:
                                i = 1;
                                ul9Var.put("quality", new Integer(i));
                                break;
                            default:
                                ore.o();
                                return null;
                        }
                    }
                    ul9Var.put("connection_type", new Integer(((wd4) dtiVar2.d.getValue()).a().a));
                    ul9Var.put("param", strValueOf);
                    dtiVar2.t("first_frame", ul9Var.b());
                }
                return sbi.a;
            case 18:
                sbi sbiVar2 = sbi.a;
                ch3.d0(obj);
                pti ptiVar = (pti) this.f;
                RecyclerView recyclerView = ptiVar.h;
                if (recyclerView != null) {
                    String str9 = ptiVar.g;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null) {
                        je9 je9Var4 = je9.d;
                        if (a4cVar5.b(je9Var4)) {
                            a4cVar5.c(je9Var4, str9, "Player autoplay. Handle fetch event for video message, try start autoplay.", null);
                        }
                    }
                    if (recyclerView.getScrollState() == 0) {
                        ((pti) this.f).h(recyclerView, false);
                    }
                }
                return sbiVar2;
            case 19:
                ch3.d0(obj);
                e3j e3jVar = hyi.a((hyi) this.f).h;
                if (e3jVar != null) {
                    e3jVar.stop();
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ch3.d0(obj);
                g1j g1jVar = (g1j) this.f;
                ki1 ki1Var = g1jVar.m;
                File fileN = ((ju6) ((rs6) g1jVar.b.getValue())).n();
                ki1Var.getClass();
                File file2 = new File(fileN, "placeholder_videomsg.jpeg");
                String strL = file2.exists() ? sb8.L(file2.getAbsolutePath()) : null;
                mjg mjgVar16 = g1jVar.s;
                do {
                    value4 = mjgVar16.getValue();
                } while (!mjgVar16.h(value4, w0j.a((w0j) value4, null, null, strL, 3)));
                return sbi.a;
            case 21:
                ch3.d0(obj);
                int width = ((Size) this.f).getWidth();
                Path pathR = qyj.r("M328 164c0 90.446-73.554 164-164 164S0 254.446 0 164S73.554 0 164 0s164 73.554 164 164Z");
                RectF rectF = new RectF();
                pathR.computeBounds(rectF, true);
                float fMax = (2 + width) / Math.max(rectF.width(), rectF.height());
                Matrix matrix = new Matrix();
                matrix.setTranslate(-rectF.left, -rectF.top);
                matrix.postScale(fMax, fMax);
                float f = width;
                matrix.postTranslate((f - (rectF.width() * fMax)) / 2.0f, (f - (rectF.height() * fMax)) / 2.0f);
                pathR.transform(matrix);
                Paint paint = new Paint();
                paint.setColor(-1);
                paint.setFlags(6);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
                if (bitmapCreateBitmap == null) {
                    return null;
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                pathR.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                canvas.drawPath(pathR, paint);
                return bitmapCreateBitmap;
            case 22:
                ch3.d0(obj);
                f2j f2jVar = (f2j) this.f;
                mjg mjgVar17 = f2jVar.l;
                Float f2 = new Float(0.0f);
                mjgVar17.getClass();
                mjgVar17.j(null, f2);
                mjg mjgVar18 = f2jVar.n;
                Float f3 = new Float(1.0f);
                mjgVar18.getClass();
                mjgVar18.j(null, f3);
                f2jVar.c.A(0.0f, 1.0f);
                return sbi.a;
            case 23:
                ch3.d0(obj);
                i6j i6jVar = (i6j) this.f;
                i6jVar.D((String) i6jVar.k.getValue(), true);
                return sbi.a;
            case 24:
                ch3.d0(obj);
                TextView textView = (TextView) this.f;
                CharSequence text = textView.getText();
                if (text != null) {
                    vd7.h(text, pq3.j.e(textView.getContext()).m());
                }
                return sbi.a;
            case 25:
                ch3.d0(obj);
                ((z2) ((v30) this.f).e).invoke();
                return sbi.a;
            case 26:
                ch3.d0(obj);
                es8 es8Var = ((rej) this.f).p;
                if (es8Var instanceof ix0) {
                    ((ix0) es8Var).b(new wej(ifj.REQUEST_ACCESS));
                } else if (es8Var instanceof mx0) {
                    ((mx0) es8Var).b(new wej(ifj.UPDATE_TOKEN));
                } else if (es8Var instanceof jx0) {
                    ((jx0) es8Var).b(new tej());
                }
                ((rej) this.f).p = null;
                return sbi.a;
            default:
                sbi sbiVar3 = sbi.a;
                ch3.d0(obj);
                es8 es8Var2 = ((skj) this.f).f;
                ngb ngbVar = es8Var2 instanceof ngb ? (ngb) es8Var2 : null;
                if (ngbVar == null) {
                    String str10 = ((skj) this.f).c;
                    a4c a4cVar6 = gm0.f;
                    if (a4cVar6 != null) {
                        je9 je9Var5 = je9.f;
                        if (a4cVar6.b(je9Var5)) {
                            a4cVar6.c(je9Var5, str10, "Pending action was changed, cannot complete StartSendingNfcTag", null);
                        }
                    }
                    es8 es8Var3 = ((skj) this.f).f;
                    if (es8Var3 != null) {
                        es8Var3.b(new za9());
                    }
                    ((skj) this.f).f = null;
                } else {
                    ngbVar.a(Boolean.TRUE);
                    ((skj) this.f).f = null;
                }
                return sbiVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hpf(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
    }
}
