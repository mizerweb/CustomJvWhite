package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xqf extends a8j {
    public static final /* synthetic */ zv8[] o = {new z8b(xqf.class, "loadVideoJob", "getLoadVideoJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, xqf.class, "loadQualityVideoJob", "getLoadQualityVideoJob()Lkotlinx/coroutines/Job;"), new z8b(xqf.class, "loadGifEnablingJob", "getLoadGifEnablingJob()Lkotlinx/coroutines/Job;"), new z8b(xqf.class, "loadAnimojiEnablingJob", "getLoadAnimojiEnablingJob()Lkotlinx/coroutines/Job;"), new z8b(xqf.class, "updatePlaylistEnablingJob", "getUpdatePlaylistEnablingJob()Lkotlinx/coroutines/Job;")};
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final mjg g;
    public final r8e h;
    public final p3c i;
    public final p3c j;
    public final p3c k;
    public final p3c l;
    public final p3c m;
    public final ic6 n;

    public xqf(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        mjg mjgVarA = p90.a(r66.a);
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        this.i = qyj.S();
        this.j = qyj.S();
        this.k = qyj.S();
        this.l = qyj.S();
        this.m = qyj.S();
        this.n = new ic6(null);
        a8j.t(this, null, new fpf(this, null, 1), 3);
    }

    public static final Object B(xqf xqfVar, mdh mdhVar) {
        Object objK0 = yab.K0(((n0c) ((xhh) xqfVar.c.getValue())).b(), new hpf(xqfVar, null, 3), mdhVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public final nni C() {
        return (nni) this.d.getValue();
    }

    public final void D(int i) {
        zv8[] zv8VarArr = o;
        if (i == R.id.oneme_settings_battery_item_gif_available) {
            this.k.B(this, zv8VarArr[2], a8j.t(this, null, new wqf(this, !C().d.getBoolean("app.media.autoplay.gif", true), null, 1), 1));
            return;
        }
        if (i == R.id.oneme_settings_battery_item_animoji_enabled) {
            this.l.B(this, zv8VarArr[3], a8j.t(this, null, new wqf(this, !((jn) this.e.getValue()).a(), null, 0), 1));
            return;
        }
        if (i == R.id.oneme_settings_battery_item_playlist_enabled) {
            this.m.B(this, zv8VarArr[4], yab.i0(this.b, null, 2, new gce(this, (lq4) null, this), 1));
            return;
        }
        ic6 ic6Var = this.n;
        if (i == R.id.oneme_settings_battery_item_video) {
            if (((Boolean) ((e5d) this.f.getValue()).C().i()).booleanValue()) {
                E(C().d.getInt("app.video.auto.play", 1) != -1 ? -1 : 0);
                return;
            } else {
                a8j.x(ic6Var, vqf.d);
                return;
            }
        }
        if (i == R.id.oneme_settings_battery_auto_play_video_always) {
            E(0);
            return;
        }
        if (i == R.id.oneme_settings_battery_auto_play_video_wifi) {
            E(1);
            return;
        }
        if (i == R.id.oneme_settings_battery_auto_play_video_disable) {
            E(-1);
            return;
        }
        if (i == R.id.oneme_settings_battery_item_video_quality) {
            a8j.x(ic6Var, vqf.e);
            return;
        }
        if (i == R.id.oneme_settings_battery_quality_1080) {
            F(mui.WITHOUT_COMPRESS);
        } else if (i == R.id.oneme_settings_battery_quality_720) {
            F(mui.OPTIMAL);
        } else if (i == R.id.oneme_settings_battery_quality_480) {
            F(mui.MAXIMUM);
        }
    }

    public final void E(int i) {
        sgg sggVarT = a8j.t(this, null, new w93(this, i, (lq4) null, 12), 1);
        this.i.B(this, o[0], sggVarT);
    }

    public final void F(mui muiVar) {
        sgg sggVarT = a8j.t(this, null, new gce(this, muiVar, null, 27), 1);
        this.j.B(this, o[1], sggVarT);
    }
}
