package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class nni extends o3 {
    public static int[] i;
    public final ifh e;
    public final ifh f;
    public final ifh g;
    public final WeakHashMap h;

    public nni(Context context, cs6 cs6Var, zte zteVar, ha9 ha9Var) {
        super(context, ha9Var.a("app", "prefs"), cs6Var);
        final int i2 = 0;
        this.e = new ifh(new af7(this) { // from class: u6f
            public final /* synthetic */ nni b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                nni nniVar = this.b;
                switch (i3) {
                    case 0:
                        return p90.a(Integer.valueOf(nniVar.i()));
                    default:
                        return p90.a(Integer.valueOf(nniVar.h()));
                }
            }
        });
        final int i3 = 1;
        this.f = new ifh(new af7(this) { // from class: u6f
            public final /* synthetic */ nni b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                nni nniVar = this.b;
                switch (i4) {
                    case 0:
                        return p90.a(Integer.valueOf(nniVar.i()));
                    default:
                        return p90.a(Integer.valueOf(nniVar.h()));
                }
            }
        });
        this.g = new ifh(new a5d(12));
        this.h = new WeakHashMap(1);
        if (this.d.contains("app.extra.text.size.mode")) {
            gm0.n("nni", "Running migration for PREF_TEXT_SIZE_MODE");
            ((aue) zteVar).f().setValue(Integer.valueOf(this.d.getInt("app.extra.text.size.mode", 1)));
            zr6 zr6Var = (zr6) this.d.edit();
            zr6Var.remove("app.extra.text.size.mode");
            zr6Var.apply();
        }
    }

    public final int f() {
        if (i == null) {
            Context context = this.a;
            i = new int[]{context.getResources().getColor(R.color.led_1), context.getResources().getColor(R.color.led_2), context.getResources().getColor(R.color.led_3), context.getResources().getColor(R.color.led_4), context.getResources().getColor(R.color.led_5), context.getResources().getColor(R.color.led_6), context.getResources().getColor(R.color.led_7)};
        }
        return i[3];
    }

    public final dqe g() {
        return zpe.t(this.d.getString("app.calls.incoming.ringtone", null));
    }

    public final int h() {
        return this.d.getInt("app.notification.chats.show", 0);
    }

    public final int i() {
        return this.d.getInt("app.notification.dialogs.show", 0);
    }

    public final String j(String str) {
        String string = this.d.getString(str, "DEFAULT");
        return (string.equals("DEFAULT") || string.equals("_NONE_") || !string.equals(Settings.System.DEFAULT_NOTIFICATION_URI.toString())) ? string : "DEFAULT";
    }

    public final int k() {
        return this.d.getInt("app.video.auto.load", 1);
    }

    public final mui l() {
        String string = this.d.getString("app.media.video.compress", null);
        return string == null ? mui.OPTIMAL : mui.valueOf(string);
    }

    public final boolean m() {
        return this.d.getBoolean("app.privacy.content.level.access", false);
    }

    public final boolean n() {
        return this.d.getBoolean("app.privacy.safe_mode", false);
    }

    public final void o(int i2) {
        d(i2, "app.notification.chats.show");
        if (i2 != 1) {
            d(i2, "app.notification.chats.show.last");
        }
        ((f9b) this.f.getValue()).setValue(Integer.valueOf(i2));
    }

    public final void p(int i2) {
        d(i2, "app.notification.dialogs.show");
        ((f9b) this.e.getValue()).setValue(Integer.valueOf(i2));
    }

    public final void q(lni lniVar) {
        int i2;
        gm0.m("nni", "updateUserSettings, settings = %s", lniVar);
        Long l = lniVar.b;
        if (l != null) {
            long jLongValue = l.longValue();
            zr6 zr6Var = (zr6) this.d.edit();
            zr6Var.putLong("app.notification.dontDisturbUntil", jLongValue);
            zr6Var.apply();
        }
        Boolean bool = lniVar.a;
        if (bool != null) {
            c("app.notification.show.new.users", bool.booleanValue());
        }
        String str = lniVar.c;
        int i3 = 2;
        if (str != null) {
            if (str.equals("OFF")) {
                i2 = 1;
            } else {
                i2 = !str.equals("REPLY") ? 0 : 2;
            }
            p(i2);
        }
        String str2 = lniVar.d;
        if (str2 != null) {
            if (str2.equals("OFF")) {
                i3 = 1;
            } else if (!str2.equals("REPLY")) {
                i3 = 0;
            }
            o(i3);
        }
        String str3 = lniVar.e;
        if (str3 != null) {
            e("app.notification.ringtone", str3);
        }
        String str4 = lniVar.f;
        if (str4 != null) {
            e("app.notification.dialogs.ringtone", str4);
        }
        String str5 = lniVar.g;
        if (str5 != null) {
            e("app.notification.chats.ringtone", str5);
        }
        Integer num = lniVar.i;
        if (num != null) {
            d(anl.b(num.intValue()), "app.notification.led.color");
        }
        Boolean bool2 = lniVar.h;
        if (bool2 != null) {
            c("app.privacy.online.show", !bool2.booleanValue());
        }
        Integer num2 = lniVar.j;
        if (num2 != null) {
            d(anl.b(num2.intValue()), "app.notification.dialogs.led.color");
        }
        Integer num3 = lniVar.k;
        if (num3 != null) {
            d(anl.b(num3.intValue()), "app.notification.chats.led.color");
        }
        Boolean bool3 = lniVar.l;
        if (bool3 != null) {
            c("app.notification.vibrate", bool3.booleanValue());
        }
        Boolean bool4 = lniVar.m;
        if (bool4 != null) {
            c("app.notification.dialogs.vibrate", bool4.booleanValue());
        }
        Boolean bool5 = lniVar.n;
        if (bool5 != null) {
            c("app.notification.chats.vibrate", bool5.booleanValue());
        }
        int i4 = lniVar.p;
        if (i4 != 0) {
            e("app.privacy.incoming.call", nbh.k(i4));
        }
        int i5 = lniVar.o;
        if (i5 != 0) {
            e("app.privacy.chats.invite", nbh.k(i5));
        }
        kni kniVar = lniVar.r;
        if (kniVar != null) {
            e("app.privacy.inactive.ttl", kniVar.a);
        }
        int i6 = lniVar.s;
        if (i6 != 0) {
            e("app.group.chat.call.notification.status", nbh.j(i6));
        }
        int i7 = lniVar.t;
        if (i7 != 0) {
            e("app.comments.push.notification.status", nbh.i(i7));
        }
        int i8 = lniVar.u;
        if (i8 != 0) {
            e("app.suggest.stickers.status", nbh.l(i8));
        }
        Boolean bool6 = lniVar.v;
        if (bool6 != null) {
            c("audio.transcription.enabled", bool6.booleanValue());
        }
        Boolean bool7 = lniVar.w;
        if (bool7 != null) {
            c("app.privacy.safe_mode", bool7.booleanValue());
        }
        Boolean bool8 = lniVar.x;
        if (bool8 != null) {
            c("app.privacy.safe_mode_no_pin", bool8.booleanValue());
        }
        int i9 = lniVar.y;
        if (i9 != 0) {
            e("app.privacy.search_by_phone", nbh.k(i9));
        }
        Boolean bool9 = lniVar.z;
        if (bool9 != null) {
            c("app.privacy.unsafe.files.default", bool9.booleanValue());
        }
        Boolean bool10 = lniVar.A;
        if (bool10 != null) {
            c("app.privacy.content.level.access", bool10.booleanValue());
        }
        jni jniVar = lniVar.D;
        if (jniVar != null) {
            e("app.family.protection.status", jniVar.a);
        }
        Boolean bool11 = lniVar.B;
        if (bool11 != null) {
            c("app.messages.enable.double.tap.reactions", !bool11.booleanValue());
        }
        String str6 = lniVar.C;
        if (str6 != null) {
            e("app.messages.double.tap.reaction", str6);
        }
        int i10 = lniVar.q;
        if (i10 != 0) {
            e("app.privacy.phone.number.privacy", nbh.k(i10));
        }
    }
}
