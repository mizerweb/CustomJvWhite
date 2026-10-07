package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import androidx.media3.transformer.ExportException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.webapp.settings.WebAppSettingsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vuf implements qbf, rg4, mf7, u8g, qg4, ptb, rf7, ine, xbi, tg4, hfh, zje, s72, otb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vuf(bui buiVar, hmf hmfVar) {
        this.a = 26;
        this.b = hmfVar;
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        hmf hmfVar = (hmf) this.b;
        ((g9b) hmfVar.b.f).a.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(r72Var.hashCode()));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        xti xtiVar = new xti(atomicBoolean, r72Var, hmfVar);
        r72Var.a(new alg(atomicBoolean, hmfVar, xtiVar, 7), zjl.a());
        hmfVar.b.n(xtiVar);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(r72Var.hashCode()));
    }

    @Override // defpackage.hfh
    public Object a() {
        uxe uxeVar = (uxe) ((z18) this.b).i;
        SQLiteDatabase sQLiteDatabaseL = uxeVar.l();
        sQLiteDatabaseL.beginTransaction();
        try {
            sQLiteDatabaseL.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseL.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + uxeVar.b.i()).execute();
            sQLiteDatabaseL.setTransactionSuccessful();
            return null;
        } finally {
            sQLiteDatabaseL.endTransaction();
        }
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        q4g q4gVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 3:
                ((zzf) obj2).b.reportException("SharedPeerConnectionFac", "Can't restart audio on start error", new IllegalStateException("Audio restart failed", (Throwable) obj));
                break;
            case 9:
                z7h z7hVar = (z7h) obj2;
                bz4 bz4Var = (bz4) obj;
                y7h y7hVar = new y7h(bz4Var.b, ldf.j(bz4Var.a, bz4Var.c));
                z7hVar.c.add(y7hVar);
                long j = z7hVar.j;
                if (j == -9223372036854775807L || bz4Var.d >= j) {
                    z7hVar.a(y7hVar);
                }
                break;
            case 10:
                ((z88) obj2).c((bz4) obj);
                break;
            case 14:
                ll5 ll5Var = (ll5) obj2;
                i5g i5gVar = (i5g) obj;
                i5g i5gVar2 = (i5g) ll5Var.h;
                if (i5gVar2 != null) {
                    if (!i5gVar2.equals(i5gVar) || ll5Var.b) {
                        if (((o91) ((fpi) ll5Var.d).b).E0) {
                            ll5Var.b = true;
                            break;
                        } else {
                            o91 o91Var = (o91) ((fpi) ll5Var.d).b;
                            if (o91Var.G) {
                                if ((o91Var.v || o91Var.x()) && (q4gVar = ((o91) ((rai) ll5Var.c).a).k) != null) {
                                    xt1 xt1Var = (xt1) ll5Var.f;
                                    q4gVar.d(new w4g(i5gVar, xt1Var != null && xt1Var.s, xt1Var != null && xt1Var.t), false, null, (mb) ll5Var.g);
                                    ll5Var.h = i5gVar;
                                    ll5Var.b = false;
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 18:
                ((j2i) obj2).b((ExportException) obj);
                break;
            default:
                vfi vfiVar = (vfi) obj2;
                c60 c60Var = (c60) obj;
                c60Var.i = u60.e;
                ahi ahiVar = vfiVar.a;
                c60Var.m = ahiVar.a;
                c60Var.u = ahiVar.b;
                c60Var.k = vfiVar.e;
                c60Var.o = vfiVar.f;
                break;
        }
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 5:
                Bitmap bitmapCreateScaledBitmap = (Bitmap) obj;
                int width = bitmapCreateScaledBitmap.getWidth();
                int i2 = ((mf) obj2).b;
                if (width > i2 || bitmapCreateScaledBitmap.getHeight() > i2) {
                    float f = i2;
                    float width2 = bitmapCreateScaledBitmap.getWidth();
                    float height = bitmapCreateScaledBitmap.getHeight();
                    float fMin = Math.min(f / width2, f / height);
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) (width2 * fMin), (int) (height * fMin), true);
                }
                return xel.b(bitmapCreateScaledBitmap);
            default:
                bi4 bi4Var = (bi4) obj2;
                Long l = (Long) obj;
                if (l.longValue() != 0) {
                    return bi4Var.f(l.longValue(), false);
                }
                return null;
        }
    }

    @Override // defpackage.u8g
    public void c(b8g b8gVar) {
        ((yig) this.b).c.invoke(new vig(b8gVar));
    }

    @Override // defpackage.ine
    public void d(Object obj) {
        ((au3) this.b).close();
    }

    @Override // defpackage.qbf
    public int e(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                waf wafVar = (waf) ((k79) ((SettingsPrivacyScreen) obj).h.F(i));
                int iA = wafVar.a();
                if (wafVar.g()) {
                    return iA;
                }
                return 0;
            case 1:
                return ((nbf) ((k79) ((SettingsStorageScreen) obj).d.F(i))).a();
            case 7:
                vaf vafVar = (vaf) ((k79) ((StickersSettingsScreen) obj).f.F(i));
                if (vafVar.a() != 0) {
                    return vafVar.a();
                }
                return 0;
            case 19:
                d8i d8iVar = (d8i) ((k79) ((TwoFASettingsScreen) obj).e.F(i));
                int iA2 = d8iVar.a();
                if (d8iVar.g()) {
                    return iA2;
                }
                return 0;
            default:
                return ((usj) ((k79) ((WebAppSettingsScreen) obj).i.F(i))).a();
        }
    }

    @Override // defpackage.otb
    public void j(Task task) {
        tpk.c((Intent) this.b);
    }

    @Override // defpackage.zje
    public void o(long j, nmc nmcVar) {
        lkl.b(j, nmcVar, (kyh[]) ((dc9) this.b).c);
    }

    @Override // defpackage.ptb
    public void onComplete(Throwable th) {
        ((CountDownLatch) this.b).countDown();
    }

    public /* synthetic */ vuf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
