package defpackage;

import org.apache.http.HttpStatus;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hb1 extends a8j implements f22 {
    public final w82 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final mjg g;
    public final r8e h;
    public final ic6 i;

    public hb1(w82 w82Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = w82Var;
        this.d = ny8Var2;
        this.e = ny8Var;
        this.f = ny8Var3;
        mjg mjgVarA = p90.a(r66.a);
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        this.i = new ic6(null);
        da1 da1Var = (da1) ny8Var2.getValue();
        da1Var.getClass();
        C((gc) ((ya1) da1Var).v.getValue());
        int i = 3;
        e9i.j0(new fz6(((ya1) ((da1) ny8Var2.getValue())).t, new gb1(this, null, 0), i), this.b);
        e9i.j0(new fz6(((ya1) ((da1) ny8Var2.getValue())).v, new gb1(this, null, 1), i), this.b);
        ((b95) ny8Var.getValue()).c(this);
    }

    public final da1 B() {
        return (da1) this.d.getValue();
    }

    public final void C(gc gcVar) {
        mjg mjgVar;
        Object value;
        c79 c79VarW;
        do {
            mjgVar = this.g;
            value = mjgVar.getValue();
            c79VarW = yab.w();
            tnh tnhVar = new tnh(R.string.call_admins_settings_screen_media_header);
            int i = vyb.u;
            c79VarW.add(new db1(0, tnhVar));
            c79VarW.add(new cb1(1, new tnh(R.string.call_admins_settings_camera_in_call), 0, R.id.call_admin_settings_camera_in_call, null, new ksf(gcVar.b, true), Integer.valueOf(R.drawable.icon_video_call), HttpStatus.SC_NOT_MODIFIED));
            c79VarW.add(new cb1(2, new tnh(R.string.call_admins_settings_mic_in_call), 0, R.id.call_admin_settings_mic_in_call, null, new ksf(gcVar.c, true), Integer.valueOf(R.drawable.icon_microphone), HttpStatus.SC_NOT_MODIFIED));
            c79VarW.add(new cb1(2, new tnh(R.string.call_admins_settings_screen_sharing_in_call), 0, R.id.call_admin_settings_screen_sharing_in_call, null, new ksf(gcVar.d, true), Integer.valueOf(R.drawable.icon_share_screen), HttpStatus.SC_NOT_MODIFIED));
            c79VarW.add(new cb1(3, new tnh(R.string.call_admins_settings_screen_record_in_call), 0, R.id.call_admin_settings_screen_record_in_call, null, new ksf(gcVar.e, true), Integer.valueOf(R.drawable.icon_recording_fill), HttpStatus.SC_NOT_MODIFIED));
            c79VarW.add(new eb1(new tnh(R.string.call_admins_settings_screen_media_header_bottom)));
            c79VarW.add(new db1(1, new tnh(R.string.call_admins_settings_screen_connection_header)));
            c79VarW.add(new cb1(4, new tnh(R.string.call_admins_settings_waiting_room), 1, R.id.call_admins_settings_waiting_room, new tnh(R.string.call_admins_settings_waiting_room_desc), new ksf(gcVar.g, true), Integer.valueOf(R.drawable.ic_waitin_room_24), 272));
        } while (!mjgVar.h(value, yab.j(c79VarW)));
    }

    @Override // defpackage.f22
    public final void m(String str) {
        a8j.x(this.i, ux1.F);
    }
}
