package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.animation.Animation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;
import one.video.transcoder.exception.MissingRequiredVideoTrackException;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.AddIceObserver;
import org.webrtc.IceCandidate;
import org.webrtc.RTCErrorType;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class uvc implements xo, t65, iw7, p7c, yk2, kg7, n9c, m72, AddIceObserver, s8g {
    public static final uvc d;
    public static final Object e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        d = new uvc(new amc(fValueOf2, fValueOf2), 1, new amc(fValueOf, fValueOf));
        e = new Object();
    }

    public uvc(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = new HashSet();
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                break;
            case 27:
                this.b = new rp4(R.id.link_context_menu_action_open_profile, new tnh(R.string.profile_link_context_menu_action_go_to_mention), Integer.valueOf(R.drawable.icon_arrow_right), (Integer) null, 20);
                this.c = new rp4(R.id.link_context_menu_action_copy_profile, new tnh(R.string.profile_link_context_menu_action_copy_mention), Integer.valueOf(R.drawable.icon_copy), (Integer) null, 20);
                break;
            default:
                uf2 uf2Var = new uf2();
                uf2Var.a = gvk.c(r66.a);
                this.b = uf2Var;
                this.c = new xp9(9);
                break;
        }
    }

    @Override // defpackage.m72
    public void A(y8e y8eVar, pne pneVar) {
        ((ek2) this.b).resumeWith(pneVar);
    }

    @Override // defpackage.p7c
    public void E0(CharSequence charSequence) {
        mjg mjgVar = ((DevMenuFeatureTogglesPageScreen) this.b).j;
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        mjgVar.getClass();
        mjgVar.j(null, string);
    }

    @Override // defpackage.p7c
    public void X() {
        mjg mjgVar = ((DevMenuFeatureTogglesPageScreen) this.b).j;
        mjgVar.getClass();
        mjgVar.j(null, "");
    }

    @Override // defpackage.kg7
    public void a(Object obj) {
        m86 m86Var;
        switch (this.a) {
            case 16:
                ((k86) this.c).l.n.remove((o76) this.b);
                break;
            case 28:
                m86 m86Var2 = (m86) obj;
                dee deeVar = (dee) this.c;
                tvj.a("Recorder", "VideoEncoder can be released: " + m86Var2);
                if (m86Var2 != null) {
                    ScheduledFuture scheduledFuture = deeVar.b0;
                    if (scheduledFuture != null && scheduledFuture.cancel(false) && (m86Var = deeVar.H) != null && m86Var == m86Var2) {
                        dee.v(m86Var);
                    }
                    deeVar.f0 = (i5b) this.b;
                    deeVar.G(null);
                    deeVar.z(deeVar.s());
                    break;
                }
                break;
            default:
                ((s8g) this.c).a(obj);
                break;
        }
    }

    public void b() {
        synchronized (e) {
            while (true) {
                h21 h21VarH = ((cmf) this.c).h();
                if (!h21VarH.equals(nbj.b)) {
                    if (h21VarH instanceof obj) {
                        ((rj5) this.b).B(((obj) h21VarH).b);
                    }
                }
            }
        }
    }

    @Override // defpackage.s8g
    public void c(ko5 ko5Var) {
        oo5.d((o72) this.b, ko5Var);
    }

    public Integer d(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2 != null && bigInteger != null) {
            BigInteger bigInteger3 = (BigInteger) this.b;
            BigInteger bigInteger4 = (BigInteger) this.c;
            this.b = bigInteger;
            this.c = bigInteger2;
            if (bigInteger3 != null && bigInteger4 != null) {
                if (bigInteger3.compareTo(bigInteger) > 0 || bigInteger4.compareTo(bigInteger2) > 0) {
                    this.b = null;
                    this.c = null;
                } else {
                    BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger3);
                    bigIntegerSubtract.getClass();
                    BigInteger bigIntegerSubtract2 = bigInteger2.subtract(bigInteger4);
                    bigIntegerSubtract2.getClass();
                    if (bigIntegerSubtract.compareTo(BigInteger.ZERO) > 0) {
                        return Integer.valueOf(oc9.w((int) ((bigIntegerSubtract2.floatValue() * 100.0f) / bigIntegerSubtract.floatValue()), new hj8(0, 100, 1)));
                    }
                }
            }
        }
        return null;
    }

    public void e(JSONObject jSONObject) {
        bc8 bc8Var;
        tx txVar = (tx) this.c;
        txVar.getClass();
        try {
            yt1 yt1VarW = kql.w(jSONObject);
            String string = jSONObject.getString("message");
            string.getClass();
            bc8Var = new bc8(yt1VarW, string, jSONObject.getBoolean("direct"));
        } catch (JSONException e2) {
            txVar.a.logException("ChatParser", "Can't parse chat message", e2);
            bc8Var = null;
        }
        if (bc8Var == null) {
            return;
        }
        ((f13) this.b).onNewMessage(bc8Var);
    }

    @Override // defpackage.iw7
    public hw7 g() {
        return (t04) ((ifh) this.c).getValue();
    }

    @Override // defpackage.xo
    public uo h() {
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.c).readLock();
        lock.lock();
        try {
            return (uo) ((b1k) this.b).b;
        } finally {
            lock.unlock();
        }
    }

    public Float i(yu4 yu4Var, yu4 yu4Var2) {
        yu4Var2.getClass();
        ifh ifhVar = (ifh) this.c;
        float fFloatValue = ((Number) ifhVar.getValue()).floatValue();
        jjd jjdVar = yu4Var2.b;
        float f = (jjdVar.a + (jjdVar.b + (jjdVar.c + jjdVar.d))) / fFloatValue;
        float fFloatValue2 = ((Number) ifhVar.getValue()).floatValue();
        jjd jjdVar2 = yu4Var.b;
        float f2 = f - ((jjdVar2.a + (jjdVar2.b + (jjdVar2.c + jjdVar2.d))) / fFloatValue2);
        float fFloatValue3 = (yu4Var2.a - (jjdVar.e / ((Number) ifhVar.getValue()).floatValue())) - (yu4Var.a - (jjdVar2.e / ((Number) ifhVar.getValue()).floatValue()));
        if (Math.abs(fFloatValue3) > Float.MAX_VALUE || fFloatValue3 == 0.0f) {
            return null;
        }
        float fLongValue = (f2 / fFloatValue3) / ((Number) ((ifh) ((ljf) this.b).b).getValue()).longValue();
        if (0.0f > fLongValue || fLongValue > 1.0f) {
            return null;
        }
        return Float.valueOf(fLongValue);
    }

    public void j() throws IOException {
        String str = (String) this.b;
        if (((FileChannel) this.c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.c = null;
            ore.l(c0a.o("Unable to lock file: '", str, "'."), th);
        }
    }

    public void k(Exception exc, boolean z) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        c98 c98VarN = c98.n(hashSet);
        hashSet.clear();
        a98 a98VarListIterator = c98VarN.listIterator(0);
        while (a98VarListIterator.hasNext()) {
            ca5 ca5Var = (ca5) a98VarListIterator.next();
            ca5Var.getClass();
            ca5Var.k(z ? 1 : 3, exc);
        }
    }

    public void l(g77 g77Var) {
        gx0 gx0Var = (gx0) this.c;
        g9i g9iVar = (g9i) this.b;
        int i = g77Var.b;
        if (i == 0) {
            gx0Var.execute(new og7(g9iVar, 3, g77Var.a));
        } else {
            gx0Var.execute(new v72(g9iVar, i, 0));
        }
    }

    public void m(ca5 ca5Var) {
        ((HashSet) this.b).add(ca5Var);
        if (((ca5) this.c) != null) {
            return;
        }
        this.c = ca5Var;
        ff6 ff6VarG = ca5Var.b.g();
        ca5Var.z = ff6VarG;
        aa5 aa5Var = ca5Var.s;
        String str = vqi.a;
        ff6VarG.getClass();
        aa5Var.getClass();
        aa5Var.obtainMessage(1, new ba5(t99.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), ff6VarG)).sendToTarget();
    }

    @Override // defpackage.p7c
    public void o() {
        nl9.c((t7c) this.c);
    }

    @Override // org.webrtc.AddIceObserver
    public void onAddFailure(RTCErrorType rTCErrorType, String str) {
        qpc qpcVar = (qpc) this.c;
        y3e y3eVar = qpcVar.w;
        StringBuilder sb = new StringBuilder();
        sb.append(qpcVar.toString());
        sb.append(": ❄️ FAILED to add remote ice candidate ");
        IceCandidate iceCandidate = (IceCandidate) this.b;
        sb.append(iceCandidate);
        sb.append("\nreason: ");
        sb.append(str);
        y3eVar.reportException("PeerConnectionClient", sb.toString(), new Exception("add.ice.candidate.fail"));
        qpcVar.r.post(new sc2(this, str, rTCErrorType, iceCandidate, 11));
    }

    @Override // org.webrtc.AddIceObserver
    public void onAddSuccess() {
    }

    @Override // defpackage.s8g
    public void onError(Throwable th) {
        ((s8g) this.c).onError(th);
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 16:
                m86 m86Var = ((k86) this.c).l;
                m86Var.n.remove((o76) this.b);
                if (!(th instanceof MediaCodec.CodecException)) {
                    m86Var.b(0, th.getMessage(), th);
                } else {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                    m86Var.b(1, codecException.getMessage(), codecException);
                }
                break;
            default:
                tvj.a("Recorder", "Error in ReadyToReleaseFuture: " + th);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fk, java.lang.Object] */
    public void p() {
        if (((fk) this.b) == null) {
            ?? r0 = new ValueAnimator.DurationScaleChangeListener() { // from class: fk
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f) {
                    ((hk) this.a.c).g = f;
                }
            };
            this.b = r0;
            ValueAnimator.registerDurationScaleChangeListener(r0);
        }
    }

    @Override // defpackage.m72
    public void r(y8e y8eVar, IOException iOException) {
        IOException iOException2 = (IOException) this.c;
        ek2 ek2Var = (ek2) this.b;
        if (ek2Var.t() instanceof ok2) {
            return;
        }
        if (iOException2 != null) {
            iOException2.initCause(iOException);
        }
        if (iOException2 != null) {
            iOException = iOException2;
        }
        ek2Var.resumeWith(new poe(iOException));
    }

    @Override // defpackage.xo
    public void s(uo uoVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ((b1k) this.b).b = uoVar;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // defpackage.t65
    public Object t() {
        Bundle bundle = (Bundle) this.b;
        return new CallRateBottomSheet(sb8.j0(bundle, "call_id"), sb8.f0(bundle, "is_group"), sb8.f0(bundle, "is_video"), bundle.containsKey("sdk_reasons") ? r5h.m1(sb8.j0(bundle, "sdk_reasons"), new String[]{","}, 4) : null, (ha9) this.c);
    }

    public a0a u(ry9 ry9Var) {
        Context context = (Context) this.c;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        lvb.Z("Context must be provided if MediaSource.Factory is not set.", applicationContext != null);
        ra5 ra5Var = new ra5();
        synchronized (ra5Var) {
            ra5Var.c = 1;
        }
        synchronized (ra5Var) {
            ra5Var.d = 1;
        }
        synchronized (ra5Var) {
            ra5Var.f = 260;
        }
        zwa zwaVar = new zwa(new gxa(ry9Var, new jc5(applicationContext, ra5Var)));
        try {
            Object obj = zwaVar.l().get();
            Long l = (Long) obj;
            if (l != null && l.longValue() == -9223372036854775807L) {
                obj = null;
            }
            Long l2 = (Long) obj;
            ((ze9) this.b).j("Transcoder", new ww8(16, l2));
            ylc ylcVarW = w(zwaVar);
            b87 b87Var = (b87) ylcVarW.a;
            b87 b87Var2 = (b87) ylcVarW.b;
            if (b87Var == null) {
                throw new MissingRequiredVideoTrackException("No video track available");
            }
            a0a a0aVar = new a0a(l2, b87Var, b87Var2);
            p90.f(zwaVar, null);
            return a0aVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(zwaVar, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.xo
    public uo v(wo woVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            uo uoVarV = ((b1k) this.b).v(woVar);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            return uoVarV;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public ylc w(zwa zwaVar) {
        Future mofVar;
        gxa gxaVar = zwaVar.a;
        synchronized (gxaVar.c) {
            try {
                if (gxaVar.g) {
                    mofVar = new e88(new IllegalStateException("Retriever is released."));
                } else {
                    gxaVar.y();
                    mofVar = new mof();
                    gxaVar.d.add(mofVar);
                    mof mofVar2 = gxaVar.e;
                    mofVar2.getClass();
                    mofVar2.b(new ng7(mofVar2, 0, new vn7(22, mofVar)), im5.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        iyh iyhVar = (iyh) mofVar.get();
        ((ze9) this.b).j("Transcoder", new ww8(17, iyhVar));
        int i = iyhVar.a;
        b87 b87Var = null;
        b87 b87Var2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            hyh hyhVarA = iyhVar.a(i2);
            b87 b87Var3 = hyhVarA.d[0];
            int i3 = hyhVarA.c;
            if (i3 == 2 && b87Var == null) {
                b87Var = b87Var3;
            } else if (i3 == 1 && b87Var2 == null) {
                b87Var2 = b87Var3;
            }
            if (b87Var != null && b87Var2 != null) {
                return new ylc(b87Var, b87Var2);
            }
        }
        return new ylc(b87Var, b87Var2);
    }

    public kyh x(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                lvb.k0("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new nm5();
            }
            if (i == iArr[i2]) {
                return ((wye[]) this.c)[i2];
            }
            i2++;
        }
    }

    public void y() {
        ValueAnimator.unregisterDurationScaleChangeListener((fk) this.b);
        this.b = null;
    }

    public /* synthetic */ uvc(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public uvc(f13 f13Var, tx txVar) {
        this.a = 10;
        f13Var.getClass();
        txVar.getClass();
        this.b = f13Var;
        this.c = txVar;
    }

    public uvc(List list, Set set, List list2) {
        this.a = 25;
        this.b = list;
        this.c = list2;
    }

    public uvc(ljf ljfVar) {
        this.a = 12;
        this.b = ljfVar;
        this.c = new ifh(new pe3(22, this));
    }

    public uvc(b1k b1kVar) {
        this.a = 4;
        this.b = b1kVar;
        this.c = new ReentrantReadWriteLock();
    }

    public uvc(q24 q24Var, ny8 ny8Var) {
        this.a = 11;
        this.b = q24Var;
        this.c = new ifh(new za2(this, 23, ny8Var));
    }

    public uvc(String str) {
        this.a = 17;
        this.b = str.concat(".lck");
    }

    public /* synthetic */ uvc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public uvc(Animation animation) {
        this.a = 18;
        this.b = animation;
        this.c = null;
    }

    public uvc(Animator animator) {
        this.a = 18;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public uvc(hk hkVar) {
        this.a = 3;
        this.c = hkVar;
    }

    public uvc(ghe gheVar, int[] iArr) {
        this.a = 23;
        this.b = c98.n(gheVar);
        this.c = iArr;
    }
}
