package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpStatus;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class euf extends a8j {
    public static final /* synthetic */ zv8[] z = {new z8b(euf.class, "mediaCachingTimeJob", "getMediaCachingTimeJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, euf.class, "loadPhotoJob", "getLoadPhotoJob()Lkotlinx/coroutines/Job;"), new z8b(euf.class, "loadGifJob", "getLoadGifJob()Lkotlinx/coroutines/Job;"), new z8b(euf.class, "loadVideoMessageJob", "getLoadVideoMessageJob()Lkotlinx/coroutines/Job;"), new z8b(euf.class, "loadAudioJob", "getLoadAudioJob()Lkotlinx/coroutines/Job;"), new z8b(euf.class, "loadRoamingJob", "getLoadRoamingJob()Lkotlinx/coroutines/Job;"), new z8b(euf.class, "refreshJob", "getRefreshJob()Lkotlinx/coroutines/Job;")};
    public final Context c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final mjg l;
    public final mjg m;
    public final mjg n;
    public final mjg o;
    public final mjg p;
    public final r8e q;
    public final p3c r;
    public final p3c s;
    public final p3c t;
    public final p3c u;
    public final p3c v;
    public final p3c w;
    public final p3c x;
    public final ic6 y;

    public euf(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.c = context;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var6;
        this.j = ny8Var7;
        this.k = ny8Var8;
        lq4 lq4Var = null;
        mjg mjgVarA = p90.a(null);
        this.l = mjgVarA;
        mjg mjgVarA2 = p90.a(ynh.b);
        this.m = mjgVarA2;
        mjg mjgVarA3 = p90.a(E());
        this.n = mjgVarA3;
        mjg mjgVarA4 = p90.a(D());
        this.o = mjgVarA4;
        mjg mjgVarA5 = p90.a(uf0.a);
        this.p = mjgVarA5;
        int i = 0;
        this.q = e9i.G0(e9i.B(new r07(mjgVarA5, mjgVarA4, new vzc(this, lq4Var, 11), i), mjgVarA, mjgVarA2, mjgVarA3, new o82(this, lq4Var, 1)), this.b, j0g.a, r66.a);
        this.r = qyj.S();
        this.s = qyj.S();
        this.t = qyj.S();
        this.u = qyj.S();
        this.v = qyj.S();
        this.w = qyj.S();
        this.x = qyj.S();
        this.y = new ic6(null);
        yab.i0(this.b, null, 0, new cuf(this, lq4Var, i), 3);
    }

    public static final void B(euf eufVar) {
        mjg mjgVar = eufVar.l;
        ArrayList arrayList = et9.d;
        int i = ((nni) eufVar.e.getValue()).d.getInt("app.media.caching.time", 0);
        for (Object obj : et9.f) {
            if (i == ((et9) obj).a) {
                mjgVar.setValue((et9) obj);
            }
        }
        obj = null;
        mjgVar.setValue((et9) obj);
    }

    public static ynh I(int i) {
        if (i == -1) {
            return new tnh(R.string.oneme_settings_media_action_dont_load);
        }
        if (i != 0) {
            return i != 1 ? ynh.b : new tnh(R.string.oneme_settings_media_action_wifi);
        }
        return new tnh(R.string.oneme_settings_media_action_always);
    }

    public final bbf C(qf0 qf0Var, ylc ylcVar, int i) {
        int i2;
        long j = qf0Var.c;
        tnh tnhVar = new tnh(qf0Var.a);
        bz8 bz8Var = new bz8(qf0Var.b, 0, 6);
        Object obj = ylcVar.a;
        Object obj2 = ylcVar.b;
        mq9 mq9Var = (mq9) obj;
        ny8 ny8Var = this.e;
        if (mq9Var != null && ((nni) ny8Var.getValue()).k() != -1 && ((mq9) obj2) != null) {
            i2 = R.string.media_photo_video;
        } else if (((mq9) obj) != null) {
            i2 = R.string.oneme_settings_media_autosave_status_photo_only;
        } else {
            i2 = (((nni) ny8Var.getValue()).k() == -1 || ((mq9) obj2) == null) ? R.string.oneme_settings_media_autosave_status_none : R.string.oneme_settings_media_autosave_status_video_only;
        }
        return new bbf(i, tnhVar, 2, j, (osf) null, (tnh) null, new isf(new tnh(i2), null), bz8Var, HttpStatus.SC_NOT_MODIFIED);
    }

    public final List D() {
        if (!((Boolean) ((e5d) this.g.getValue()).k().i()).booleanValue()) {
            return r66.a;
        }
        qq9 qq9VarU = ((xb9) ((et3) this.i.getValue())).U();
        c79 c79VarW = yab.w();
        c79VarW.add(new abf(2, w7c.x, new tnh(R.string.oneme_settings_media_autosave_section)));
        qf0 qf0Var = qf0.PERSONAL;
        c79VarW.add(C(qf0Var, cdl.a(qf0Var, qq9VarU), 1));
        qf0 qf0Var2 = qf0.GROUP;
        c79VarW.add(C(qf0Var2, cdl.a(qf0Var2, qq9VarU), 2));
        qf0 qf0Var3 = qf0.CHANNEL;
        c79VarW.add(C(qf0Var3, cdl.a(qf0Var3, qq9VarU), 2));
        qf0 qf0Var4 = qf0.BOT;
        c79VarW.add(C(qf0Var4, cdl.a(qf0Var4, qq9VarU), 3));
        c79VarW.add(new zaf(new tnh(R.string.oneme_settings_media_autosave_hint), 2, w7c.w, 4));
        return yab.j(c79VarW);
    }

    public final c79 E() {
        c79 c79VarW = yab.w();
        c79VarW.add(new abf(1, w7c.v, new tnh(R.string.oneme_settings_media_screen_autoloading_section)));
        c79VarW.add(new bbf(1, new tnh(R.string.oneme_settings_media_photo), 1, w7c.n, (osf) null, (tnh) null, new isf(I(F().d.getInt("app.media.load.photo", 0)), null), (bz8) null, 432));
        ny8 ny8Var = this.g;
        if (((Boolean) ((e5d) ny8Var.getValue()).C().i()).booleanValue()) {
            c79VarW.add(new bbf(2, new tnh(R.string.media_settings_video_setting), 1, w7c.o, (osf) null, (tnh) null, new isf(I(((nni) this.e.getValue()).k()), null), (bz8) null, 432));
        }
        c79VarW.add(new bbf(2, new tnh(R.string.oneme_settings_media_gif), 1, w7c.l, (osf) null, (tnh) null, new isf(I(F().d.getInt("app.media.load.gif", 0)), null), (bz8) null, 432));
        c79VarW.add(new bbf(2, new tnh(R.string.oneme_settings_media_video_messages), 1, w7c.t, (osf) null, (tnh) null, new isf(I(F().d.getInt("app.media.load.video_messages", 0)), null), (bz8) null, 432));
        b5d b5dVar = ((e5d) ny8Var.getValue()).S3;
        zv8[] zv8VarArr = e5d.S6;
        if (((Boolean) b5dVar.a(zv8VarArr[254]).i()).booleanValue() || ((Boolean) ((e5d) ny8Var.getValue()).T3.a(zv8VarArr[255]).i()).booleanValue()) {
            c79VarW.add(new bbf(2, new tnh(R.string.oneme_settings_media_audio_messages), 1, w7c.c, (osf) null, (tnh) null, new isf(I(F().d.getInt("app.media.load.audio_messages", 0)), null), (bz8) null, 432));
        }
        c79VarW.add(new bbf(3, new tnh(R.string.oneme_settings_media_load_media_in_roaming), 1, w7c.m, (osf) null, (tnh) null, new ksf(F().d.getBoolean("app.media.load.roaming", false), true), (bz8) null, 432));
        c79VarW.add(new zaf(1, w7c.u, new tnh(R.string.oneme_settings_media_autoload_hint)));
        return yab.j(c79VarW);
    }

    public final nni F() {
        return (nni) this.f.getValue();
    }

    public final void G(int i) {
        Object next;
        ic6 ic6Var = this.y;
        if (i == R.id.oneme_settings_media_screen_preserve_media_section) {
            ytf ytfVar = ytf.d;
            tnh tnhVar = new tnh(R.string.oneme_settings_media_preserve_cache_title_dialog);
            ma6<et9> ma6Var = et9.f;
            ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
            for (et9 et9Var : ma6Var) {
                arrayList.add(new xtf(et9Var.b, new tnh(et9Var.c)));
            }
            a8j.x(ic6Var, new ytf(tnhVar, arrayList));
            return;
        }
        boolean zContains = et9.d.contains(Integer.valueOf(i));
        zv8[] zv8VarArr = z;
        lq4 lq4Var = null;
        if (zContains) {
            Iterator it = et9.f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (i != ((et9) next).b);
            et9 et9Var2 = (et9) next;
            if (et9Var2 == null) {
                return;
            }
            this.r.B(this, zv8VarArr[0], a8j.t(this, null, new cuf(this, et9Var2.a, lq4Var, 6), 1));
            return;
        }
        if (i == R.id.oneme_settings_media_screen_memory_usage_section) {
            wtf.b.getClass();
            a8j.x(ic6Var, new i65(":settings/caching"));
            return;
        }
        if (i == R.id.oneme_settings_media_item_photo) {
            a8j.x(ic6Var, ytf.d);
            return;
        }
        if (i == R.id.oneme_settings_media_photo_always) {
            L(0);
            return;
        }
        if (i == R.id.oneme_settings_media_photo_wifi) {
            L(1);
            return;
        }
        if (i == R.id.oneme_settings_media_photo_dont_load) {
            L(-1);
            return;
        }
        if (i == R.id.oneme_settings_media_item_video) {
            wtf.b.getClass();
            a8j.x(ic6Var, new i65(":settings/media/autoload/video"));
            return;
        }
        if (i == R.id.oneme_settings_media_item_gif) {
            a8j.x(ic6Var, ytf.e);
            return;
        }
        if (i == R.id.oneme_settings_media_gif_always) {
            K(0);
            return;
        }
        if (i == R.id.oneme_settings_media_gif_wifi) {
            K(1);
            return;
        }
        if (i == R.id.oneme_settings_media_gif_dont_load) {
            K(-1);
            return;
        }
        if (i == R.id.oneme_settings_media_item_video_messages) {
            a8j.x(ic6Var, ytf.f);
            return;
        }
        if (i == R.id.oneme_settings_media_video_messages_always) {
            M(0);
            return;
        }
        if (i == R.id.oneme_settings_media_video_messages_wifi) {
            M(1);
            return;
        }
        if (i == R.id.oneme_settings_media_video_messages_dont_load) {
            M(-1);
            return;
        }
        if (i == R.id.oneme_settings_media_item_audio_messages) {
            a8j.x(ic6Var, ytf.g);
            return;
        }
        if (i == R.id.oneme_settings_media_audio_messages_always) {
            J(0);
            return;
        }
        if (i == R.id.oneme_settings_media_audio_messages_wifi) {
            J(1);
            return;
        }
        if (i == R.id.oneme_settings_media_audio_messages_dont_load) {
            J(-1);
            return;
        }
        if (i == R.id.oneme_settings_media_item_load_in_roaming) {
            this.w.B(this, zv8VarArr[5], a8j.t(this, null, new in(this, !F().d.getBoolean("app.media.load.roaming", false), null, 5), 1));
            return;
        }
        qf0.d.getClass();
        if (!qf0.e.contains(Integer.valueOf(i))) {
            if (i == R.id.oneme_settings_media_item_autosave_gallery_banner) {
                a8j.x(ic6Var, ztf.b);
                return;
            } else {
                if (i == R.id.oneme_settings_media_item_autosave_storage_banner) {
                    a8j.x(ic6Var, auf.b);
                    return;
                }
                return;
            }
        }
        for (qf0 qf0Var : qf0.k) {
            if (((int) qf0Var.c) == i) {
                vf0 vf0Var = (vf0) this.p.getValue();
                if (cqk.d(vf0Var, sf0.a) || cqk.d(vf0Var, tf0.a)) {
                    a8j.x(ic6Var, ztf.b);
                    return;
                }
                if (!cqk.d(vf0Var, rf0.a) && !cqk.d(vf0Var, uf0.a)) {
                    ore.o();
                    return;
                }
                wtf.b.getClass();
                n65 n65Var = new n65();
                n65Var.a = ":settings/media/autosave";
                n65Var.d(qf0Var.name(), "type");
                bc1.q(n65Var.b(), ic6Var);
                return;
            }
        }
        ore.f("Collection contains no element matching the predicate.");
    }

    public final void H() {
        sgg sggVarI0 = yab.i0(this.b, null, 2, new cuf(this, null, 1), 1);
        this.x.B(this, z[6], sggVarI0);
    }

    public final void J(int i) {
        sgg sggVarT = a8j.t(this, null, new cuf(this, i, null, 2), 1);
        this.v.B(this, z[4], sggVarT);
    }

    public final void K(int i) {
        sgg sggVarT = a8j.t(this, null, new cuf(this, i, null, 3), 1);
        this.t.B(this, z[2], sggVarT);
    }

    public final void L(int i) {
        sgg sggVarT = a8j.t(this, null, new cuf(this, i, null, 4), 1);
        this.s.B(this, z[1], sggVarT);
    }

    public final void M(int i) {
        sgg sggVarT = a8j.t(this, null, new cuf(this, i, null, 5), 1);
        this.u.B(this, z[3], sggVarT);
    }
}
