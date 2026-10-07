package defpackage;

import java.util.Collections;
import org.apache.http.HttpStatus;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gqf extends a8j {
    public final qf0 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final mjg g;
    public final r8e h;
    public final ic6 i;

    public gqf(qf0 qf0Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = qf0Var;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        mjg mjgVarA = p90.a(B());
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        this.i = new ic6(null);
    }

    public final c79 B() {
        c79 c79VarW = yab.w();
        ylc ylcVarC = C();
        boolean z = ((nni) this.f.getValue()).k() != -1;
        c79VarW.add(new abf(0, w7c.b, new tnh(R.string.oneme_settings_media_autosave_detail_section)));
        c79VarW.add(new bbf(1, new tnh(R.string.photo_initcap), 0, w7c.i, (osf) null, (tnh) null, new ksf(((mq9) ylcVarC.a) != null, true), aql.a(R.drawable.icon_image), HttpStatus.SC_NOT_MODIFIED));
        long j = w7c.k;
        c79VarW.add(new bbf(3, new tnh(R.string.media_settings_video_setting), 0, j, z ? osf.b : osf.e, (tnh) null, new ksf(z && ((mq9) ylcVarC.b) != null, z), aql.a(R.drawable.icon_video_call), 288));
        c79VarW.add(new zaf(new tnh(R.string.oneme_settings_media_autosave_detail_hint), 0, w7c.a, 4));
        return yab.j(c79VarW);
    }

    public final ylc C() {
        nq9 nq9Var;
        qq9 qq9VarU = ((xb9) ((et3) this.d.getValue())).U();
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            nq9Var = nq9.DIALOG;
        } else if (iOrdinal == 1) {
            nq9Var = nq9.CHAT;
        } else if (iOrdinal == 2) {
            nq9Var = nq9.CHANNEL;
        } else {
            if (iOrdinal != 3) {
                ore.o();
                return null;
            }
            nq9Var = nq9.DIALOG_WITH_BOT;
        }
        return new ylc((mq9) ww3.t1(qq9VarU.a(nq9Var, pq9.PHOTO)), (mq9) ww3.t1(qq9VarU.a(nq9Var, pq9.VIDEO)));
    }

    public final void D(long j) {
        if (j == w7c.i) {
            E((mq9) C().a, pq9.PHOTO);
            return;
        }
        if (j == w7c.k) {
            if (((nni) this.f.getValue()).k() != -1) {
                E((mq9) C().b, pq9.VIDEO);
                return;
            }
            wtf.b.getClass();
            a8j.x(this.i, new i65(":settings/media/autoload/video"));
        }
    }

    public final void E(mq9 mq9Var, pq9 pq9Var) {
        nq9 nq9Var;
        boolean z = mq9Var == null;
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            nq9Var = nq9.DIALOG;
        } else if (iOrdinal == 1) {
            nq9Var = nq9.CHAT;
        } else if (iOrdinal == 2) {
            nq9Var = nq9.CHANNEL;
        } else {
            if (iOrdinal != 3) {
                ore.o();
                return;
            }
            nq9Var = nq9.DIALOG_WITH_BOT;
        }
        ny8 ny8Var = this.d;
        et3 et3Var = (et3) ny8Var.getValue();
        qq9 qq9VarU = ((xb9) ((et3) ny8Var.getValue())).U();
        c79 c79VarW = yab.w();
        for (mq9 mq9Var2 : qq9VarU.a) {
            if (mq9Var2.a != nq9Var || mq9Var2.b != pq9Var) {
                c79VarW.add(mq9Var2);
            }
        }
        if (z) {
            c79VarW.add(new mq9(nq9Var, pq9Var, System.currentTimeMillis()));
        }
        xb9 xb9Var = (xb9) et3Var;
        xb9Var.N0.B(xb9Var, xb9.g1[31], new qq9(yab.j(c79VarW)));
        this.g.setValue(B());
        ae9.k((ae9) ((eg0) this.e.getValue()).a.getValue(), "SETTINGS", "CHANGE_AUTOSAVE_MEDIA_SETTING", Collections.singletonMap("paramAdditionally", ouk.a(new ylc("status", Boolean.valueOf(z)), new ylc("contentType", Integer.valueOf(pq9Var.a)), new ylc("chatType", Integer.valueOf(nq9Var.a)))), 8);
    }
}
