package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.media.Image;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import one.me.messages.list.loader.MessageModel;
import org.json.JSONException;
import org.msgpack.core.buffer.OutputStreamBufferOutput;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException;

/* JADX INFO: loaded from: classes2.dex */
public class i1m implements k78, lcg, sf7, n8e, pyc, zj2, aqg, rg4, s72, uhf, oha, swi, f7e, uve, qlg, g5, wba {
    public static i1m b;
    public Object a;

    public i1m(int i) throws IOException {
        switch (i) {
            case 18:
                this.a = ByteBuffer.allocateDirect(0);
                return;
            case 23:
                this.a = new int[2];
                return;
            default:
                SocketChannel socketChannelOpen = SocketChannel.open();
                try {
                    socketChannelOpen.configureBlocking(false);
                    this.a = socketChannelOpen;
                    return;
                } catch (Throwable th) {
                    socketChannelOpen.close();
                    throw th;
                }
        }
    }

    public static qp5 W(long j, pve pveVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            via viaVar = xia.b;
            viaVar.getClass();
            yia yiaVar = new yia(new OutputStreamBufferOutput(byteArrayOutputStream, 8192), viaVar);
            try {
                X(yiaVar, j, pveVar);
                yiaVar.close();
                return new qp5(2, byteArrayOutputStream.toByteArray());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(yiaVar, th);
                    throw th2;
                }
            }
        } catch (JSONException e) {
            throw new IllegalArgumentException("Unable to serialize command: " + pveVar.getClass(), e);
        }
    }

    public static void X(yia yiaVar, long j, pve pveVar) throws IOException {
        if (pveVar instanceof wke) {
            wke wkeVar = (wke) pveVar;
            yiaVar.A(1);
            yiaVar.A(0);
            yiaVar.E(j);
            yiaVar.E(wkeVar.b);
            yiaVar.E(wkeVar.a);
            return;
        }
        if (!(pveVar instanceof xei)) {
            if (pveVar instanceof gle) {
                yiaVar.A(3);
                yiaVar.A(0);
                yiaVar.E(j);
                yiaVar.y(((gle) pveVar).a);
                return;
            }
            if (!(pveVar instanceof uke)) {
                throw new IllegalArgumentException("No serializer for command: " + j + " " + pveVar.getClass());
            }
            uke ukeVar = (uke) pveVar;
            yiaVar.A(4);
            yiaVar.A(0);
            yiaVar.E(j);
            yiaVar.E(ukeVar.a);
            yiaVar.E(ukeVar.b);
            return;
        }
        xei xeiVar = (xei) pveVar;
        ArrayList<ajf> arrayList = xeiVar.a;
        yiaVar.A(0);
        yiaVar.A(0);
        yiaVar.E(j);
        yiaVar.y(xeiVar.b);
        int size = arrayList.size();
        if (size == 0) {
            yiaVar.Y((byte) -64);
        } else {
            yiaVar.l(size * 2);
            for (ajf ajfVar : arrayList) {
                yiaVar.P(kql.K(ajfVar));
                zif zifVar = ajfVar.b;
                if (zifVar.a) {
                    yiaVar.A(1);
                } else {
                    yiaVar.A(0);
                    yiaVar.Y((byte) -64);
                    yiaVar.A(zifVar.b);
                    yiaVar.A(zifVar.c);
                    yiaVar.A(qt4.D(zifVar.d));
                }
            }
        }
        yiaVar.Y((byte) -64);
    }

    public static synchronized i1m b0(Context context) {
        i1m i1mVar;
        String strD;
        Context applicationContext = context.getApplicationContext();
        synchronized (i1m.class) {
            i1mVar = b;
            if (i1mVar == null) {
                i1mVar = new i1m();
                fqg fqgVarA = fqg.a(applicationContext);
                i1mVar.a = fqgVarA;
                fqgVarA.b();
                String strD2 = fqgVarA.d("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strD2) && (strD = fqgVarA.d(fqg.f("googleSignInOptions", strD2))) != null) {
                    try {
                        GoogleSignInOptions.b(strD);
                    } catch (JSONException unused) {
                    }
                }
                b = i1mVar;
            }
        }
        return i1mVar;
        return i1mVar;
    }

    @Override // defpackage.uve
    public gj2 A(int i, byte[] bArr) throws RtcCommandSerializeException {
        if (i == 0) {
            throw null;
        }
        try {
            return U(i, bArr);
        } catch (Throwable th) {
            throw new RtcCommandSerializeException(null, false, th);
        }
    }

    @Override // defpackage.k78
    public int D() {
        return ((Image.Plane) this.a).getRowStride();
    }

    @Override // defpackage.f7e
    public void E(long j, s5e s5eVar) {
        kja kjaVar;
        z5e z5eVar;
        x6e x6eVar = (x6e) this.a;
        MessageModel messageModelR = x6eVar.d.R(j);
        s5e s5eVar2 = null;
        x6eVar.c.D(messageModelR, new x7e(s5eVar, gnl.b(messageModelR), messageModelR != null ? messageModelR.b : 0L, messageModelR != null ? messageModelR.w : null));
        if (messageModelR != null && (kjaVar = messageModelR.w) != null && (z5eVar = kjaVar.c) != null) {
            s5eVar2 = z5eVar.b;
        }
        if (cqk.d(s5eVar2, s5eVar)) {
            return;
        }
        ia8 ia8Var = (ia8) x6eVar.h.getValue();
        if (ia8Var != null) {
            ia8Var.f(Collections.singleton(new ha8(fa8.ADD_2_REACTIONS, 1)), y3f.CHAT);
        }
        a8j.x(x6eVar.b.i, ypa.a);
    }

    @Override // defpackage.wba
    public boolean F(yba ybaVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.aqg
    public Object G(int i) {
        if (i >= 0) {
            return (CharSequence) ((cf7) this.a).invoke(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.lcg
    public Object H(lq4 lq4Var) {
        mu0 mu0Var;
        if (lq4Var instanceof mu0) {
            mu0Var = (mu0) lq4Var;
            int i = mu0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mu0Var.f = i - Integer.MIN_VALUE;
            } else {
                mu0Var = new mu0(this, lq4Var);
            }
        } else {
            mu0Var = new mu0(this, lq4Var);
        }
        Object objH = mu0Var.d;
        int i2 = mu0Var.f;
        if (i2 == 0) {
            ch3.d0(objH);
            qv0 qv0Var = (qv0) this.a;
            mu0Var.f = 1;
            objH = qv0Var.h(mu0Var);
            hu4 hu4Var = hu4.a;
            if (objH == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objH);
        }
        Iterable<ov0> iterable = (Iterable) objH;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        for (ov0 ov0Var : iterable) {
            arrayList.add(new pv0(ov0Var.a, ov0Var.b, ov0Var.c, ov0Var.d, ov0Var.e, ov0Var.f, ov0Var.g, ov0Var.h, ov0Var.i, ov0Var.j, ov0Var.k, ov0Var.l, ov0Var.m, ov0Var.n, ov0Var.o, sid.INSTANCE.a(ov0Var.p), ov0Var.q, ov0Var.r, null));
        }
        return arrayList;
    }

    @Override // defpackage.zj2
    public void J(Typeface typeface) {
        ((nw3) this.a).i(typeface);
    }

    @Override // defpackage.qlg
    public void M(tlg tlgVar) {
        ((zw8) ((nj1) this.a).h).c(tlgVar);
    }

    @Override // defpackage.swi
    public void O() {
        ((n7b) this.a).p();
    }

    @Override // defpackage.k78
    public int P() {
        return ((Image.Plane) this.a).getPixelStride();
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        lg7 lg7Var = (lg7) this.a;
        qyj.l("The result can only set once!", lg7Var.b == null);
        lg7Var.b = r72Var;
        return "FutureChain[" + lg7Var + "]";
    }

    @Override // defpackage.aqg
    public void R(vpg vpgVar, int i) {
        ((ro4) vpgVar).d.setText((CharSequence) G(i));
    }

    @Override // defpackage.f7e
    public List S(long j) {
        x6e x6eVar = (x6e) this.a;
        return c8e.C(x6eVar.c, x6eVar.d.R(j), 4);
    }

    @Override // defpackage.qlg
    public void T(tlg tlgVar) {
        ((zw8) ((nj1) this.a).h).b(tlgVar);
    }

    public gj2 U(int i, byte[] bArr) {
        gj2 gj2VarV = null;
        if (i == 0) {
            ore.p("Illegal 'format' value: null");
            return null;
        }
        if (i != 2) {
            c.i("Only binary format is supported");
            return null;
        }
        try {
            fka fkaVarA = xia.a(bArr);
            try {
                int iD0 = fkaVarA.D0();
                int iD1 = fkaVarA.D0();
                int iD2 = fkaVarA.D0();
                if (iD1 != 0) {
                    throw new UnsupportedOperationException("Unsupported version: " + iD1 + " for command " + iD0);
                }
                if (iD2 != 0) {
                    throw new IllegalArgumentException("Error code " + iD2 + " for command " + iD0);
                }
                if (iD0 == 0) {
                    gj2VarV = V(fkaVarA);
                } else if (iD0 == 1) {
                    gj2VarV = new gj2(fkaVarA.I0(), new xke(Integer.valueOf(fkaVarA.D0())), 8);
                }
                fkaVarA.close();
                return gj2VarV;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(fkaVarA, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw new IllegalArgumentException("Unable to decode command body: ".concat(zu7.a(bArr)), th3);
        }
    }

    public gj2 V(fka fkaVar) throws IOException {
        x52 x52VarM;
        long jI0 = fkaVar.I0();
        HashMap map = new HashMap();
        int iP0 = fkaVar.P0();
        for (int i = 0; i < iP0; i++) {
            if (fkaVar.y().a() == 5) {
                String strS0 = fkaVar.S0();
                x52VarM = kql.M(strS0);
                if (x52VarM == null) {
                    ore.p("Not found video track participant key for ".concat(strS0));
                    return null;
                }
            } else {
                int iD0 = fkaVar.D0();
                x52VarM = (x52) ((ConcurrentHashMap) ((vn7) this.a).b).get(Integer.valueOf(iD0));
                if (x52VarM == null) {
                    ore.p(zo5.h(iD0, "Not found video track participant key for "));
                    return null;
                }
            }
            map.put(x52VarM, fkaVar.D0() == -1 ? yei.b : yei.a);
        }
        return new gj2(jI0, new zei(map), 8);
    }

    public synchronized void Y() {
        fqg fqgVar = (fqg) this.a;
        ReentrantLock reentrantLock = fqgVar.a;
        reentrantLock.lock();
        try {
            fqgVar.b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public long Z() {
        xr6 xr6Var = (xr6) this.a;
        try {
            if (xr6Var instanceof xr6) {
                return new StatFs(xr6Var.b.c.getParentFile().getPath()).getAvailableBytes();
            }
            throw new AssertionError("Unknown OutputOptions: " + xr6Var);
        } catch (RuntimeException e) {
            tvj.i("OutputStorageImpl", "Fail to access the available bytes.", e);
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
    }

    @Override // defpackage.swi
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        n7b n7bVar = (n7b) this.a;
        n7bVar.f.execute(new i7b(n7bVar, 0, videoFrameProcessingException));
    }

    public void a0() {
        jx7 jx7Var = (jx7) this.a;
        int i = jx7Var.r - 1;
        jx7Var.r = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (fy7 fy7Var : jx7Var.t) {
            fy7Var.f();
            i2 += fy7Var.I.a;
        }
        hyh[] hyhVarArr = new hyh[i2];
        int i3 = 0;
        for (fy7 fy7Var2 : jx7Var.t) {
            fy7Var2.f();
            int i4 = fy7Var2.I.a;
            int i5 = 0;
            while (i5 < i4) {
                fy7Var2.f();
                hyhVarArr[i3] = fy7Var2.I.a(i5);
                i5++;
                i3++;
            }
        }
        jx7Var.s = new iyh(hyhVarArr);
        jx7Var.q.C(jx7Var);
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        String str;
        ConversationParams conversationParams = ((ffd) obj).a;
        if (conversationParams == null || (str = conversationParams.id) == null) {
            return;
        }
        lml.c(((jl6) this.a).k, str);
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        js6 js6Var = (js6) obj;
        zi1 zi1Var = (zi1) this.a;
        v7g v7gVarRequestUploadUrl = zi1Var.a.requestUploadUrl(zi1Var.c.b, nji.a, zi1Var.d);
        rj5 rj5Var = new rj5(6, js6Var);
        v7gVarRequestUploadUrl.getClass();
        pp9 pp9Var = new pp9(v7gVarRequestUploadUrl, 2, rj5Var);
        z2f z2fVarA = i3f.a();
        Objects.requireNonNull(TimeUnit.SECONDS, "unit is null");
        Objects.requireNonNull(z2fVarA, "scheduler is null");
        return new e8g(new pp9(pp9Var, 4, z2fVarA), new c7k(5, js6Var), 0);
    }

    @Override // defpackage.swi
    public void e(long j, boolean z) {
        if (j == 0) {
            ((n7b) this.a).u = true;
        }
        n7b n7bVar = (n7b) this.a;
        n7bVar.t = j;
        n7bVar.f.execute(new k7b(this, j, z, 0));
    }

    @Override // defpackage.k78
    public ByteBuffer getBuffer() {
        return ((Image.Plane) this.a).getBuffer();
    }

    @Override // defpackage.n8e
    public t94 getConfig() {
        return (t94) this.a;
    }

    @Override // defpackage.swi
    public void h(int i, int i2) {
        ((n7b) this.a).f.execute(new q31(this, i, i2, 3));
    }

    @Override // defpackage.swi
    public void l(float f) {
        ((n7b) this.a).f.execute(new j7b(this, f, 0));
    }

    @Override // defpackage.pyc
    public xx6 m(long j) {
        return e9i.k0(new jz(((xn3) ((ny8) this.a).getValue()).k(j), 13), new e03(j, null, 2));
    }

    @Override // defpackage.lcg
    public Object o(pv0 pv0Var, lq4 lq4Var) {
        Object objF = ((qv0) this.a).f(lq4Var, new ov0(pv0Var.getSliceTime(), pv0Var.getUtime(), pv0Var.getStime(), pv0Var.x(), pv0Var.w(), pv0Var.u(), pv0Var.getTemperature(), pv0Var.z(), pv0Var.getHealthStatsMobileTxBytes(), pv0Var.y(), pv0Var.getHealthStatsWifiRxBytes(), pv0Var.getHealthStatsWifiTxBytes(), pv0Var.getHealthStatsWifiIdleMs(), pv0Var.getTrafficStatsMobileRxBytes(), pv0Var.getTrafficStatsMobileTxBytes(), pv0Var.getProcesses(), pv0Var.getIsBatteryOptimizationsEnabled(), pv0Var.getIsBackgroundActivityDisabled()));
        return objF == hu4.a ? objF : sbi.a;
    }

    @Override // defpackage.f7e
    public void onDismiss() {
    }

    @Override // defpackage.aqg
    public vpg p(ViewGroup viewGroup) {
        return new ro4(new AppCompatTextView(viewGroup.getContext()));
    }

    @Override // defpackage.uhf
    public void q(vhf vhfVar) {
        jx7 jx7Var = (jx7) this.a;
        jx7Var.q.q(jx7Var);
    }

    @Override // defpackage.uve
    public qp5 t(long j, pve pveVar) throws RtcCommandSerializeException {
        try {
            return W(j, pveVar);
        } catch (Throwable th) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, th);
        }
    }

    @Override // defpackage.swi
    public void v() {
        ((n7b) this.a).f.execute(new h7b(1, this));
    }

    @Override // defpackage.wba
    public void w(yba ybaVar) {
        Toolbar toolbar = (Toolbar) this.a;
        m8 m8Var = toolbar.a.t;
        if (m8Var == null || !m8Var.k()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.G.b).iterator();
            while (it.hasNext()) {
                ((ab7) it.next()).a.t(ybaVar);
            }
        }
    }

    @Override // defpackage.g5
    public boolean z(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.a;
        if (!swipeDismissBehavior.s()) {
            return false;
        }
        WeakHashMap weakHashMap = i7j.a;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    public /* synthetic */ i1m(Object obj) {
        this.a = obj;
    }
}
