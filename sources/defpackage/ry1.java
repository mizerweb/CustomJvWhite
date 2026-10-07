package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ry1 extends rbb {
    public static final py1 A;
    public static final py1 B;
    public static final py1 C;
    public static final py1 D;
    public static final py1 E;
    public static final py1 b;
    public static final py1 c;
    public static final py1 d;
    public static final py1 e;
    public static final py1 f;
    public static final py1 g;
    public static final py1 h;
    public static final py1 i;
    public static final py1 j;
    public static final py1 k;
    public static final py1 l;
    public static final py1 m;
    public static final py1 n;
    public static final py1 o;
    public static final py1 p;
    public static final py1 q;
    public static final py1 r;
    public static final py1 s;
    public static final py1 t;
    public static final py1 u;
    public static final py1 v;
    public static final py1 w;
    public static final py1 x;
    public static final py1 y;
    public static final py1 z;

    static {
        tnh tnhVar = new tnh(R.string.call_screen_mic_unavailable_in_call);
        Integer numValueOf = Integer.valueOf(R.drawable.icon_microphone_crossed_fill);
        int i2 = 4;
        b = new py1(i2, tnhVar, numValueOf);
        tnh tnhVar2 = new tnh(R.string.call_screen_camera_unavailable_in_call);
        Integer numValueOf2 = Integer.valueOf(R.drawable.icon_video_call_crossed_fill);
        c = new py1(i2, tnhVar2, numValueOf2);
        tnh tnhVar3 = new tnh(R.string.call_screen_camera_and_mic_unavailable_in_call);
        Integer numValueOf3 = Integer.valueOf(R.drawable.icon_block);
        d = new py1(i2, tnhVar3, numValueOf3);
        tnh tnhVar4 = new tnh(R.string.call_screen_sharing_unavailable_in_call);
        Integer numValueOf4 = Integer.valueOf(R.drawable.icon_share_screen_off_fill);
        e = new py1(i2, tnhVar4, numValueOf4);
        f = new py1(i2, new tnh(R.string.call_screen_sharing_unavailable_in_call), numValueOf4);
        g = new py1(i2, new tnh(R.string.call_screen_mic_disabled_by_admin), numValueOf);
        h = new py1(i2, new tnh(R.string.call_screen_camera_disabled_by_admin), numValueOf2);
        i = new py1(i2, new tnh(R.string.call_admins_settings_screen_disable_mic_once), numValueOf);
        j = new py1(i2, new tnh(R.string.call_admins_settings_screen_disable_camera_once), numValueOf2);
        k = new py1(i2, new tnh(R.string.call_admins_settings_screen_disable_camera_for_user), numValueOf2);
        l = new py1(i2, new tnh(R.string.call_admins_settings_screen_disable_mic_for_user), numValueOf);
        m = new py1(i2, new tnh(R.string.call_admins_settings_screen_disable_sharing_for_user), numValueOf4);
        tnh tnhVar5 = new tnh(R.string.call_admins_settings_screen_disable_race_once);
        Integer numValueOf5 = Integer.valueOf(R.drawable.icon_hand_crossed_fill);
        n = new py1(i2, tnhVar5, numValueOf5);
        o = new py1(i2, new tnh(R.string.call_admins_settings_screen_disable_race_for_user), numValueOf5);
        p = new py1(i2, new tnh(R.string.call_screen_raise_hand_disabled_by_admin), numValueOf5);
        int i3 = 12;
        Integer num = null;
        q = new py1(i3, new tnh(R.string.call_start_screen_sharing_error), num);
        r = new py1(i3, new tnh(R.string.call_screen_record_start_failed), num);
        s = new py1(i2, new tnh(R.string.call_admins_settings_screen_sharing_disabled_in_call), numValueOf4);
        t = new py1(i2, new tnh(R.string.call_admins_settings_screen_failed_enabled_in_call), numValueOf4);
        u = new py1(i2, new tnh(R.string.call_admins_settings_min_disabled_in_call), numValueOf);
        v = new py1(i2, new tnh(R.string.call_admins_settings_mic_failed_in_call), numValueOf);
        w = new py1(i2, new tnh(R.string.call_admins_settings_camera_disabled_in_call), numValueOf2);
        x = new py1(i2, new tnh(R.string.call_admins_settings_camera_failed_in_call), numValueOf2);
        y = new py1(i2, new tnh(R.string.call_admins_settings_screen_record_disabled_in_call), numValueOf3);
        z = new py1(i3, new tnh(R.string.call_screen_record_start_name_error), num);
        tnh tnhVar6 = new tnh(R.string.call_admins_settings_screen_disable_record);
        Integer numValueOf6 = Integer.valueOf(R.drawable.icon_recording_stop_fill);
        A = new py1(i2, tnhVar6, numValueOf6);
        B = new py1(i2, new tnh(R.string.call_record_me_stop_record_and_remove), numValueOf6);
        C = new py1(i2, new tnh(R.string.call_record_me_stop_record), Integer.valueOf(R.drawable.ic_save_favorite_28));
        tnh tnhVar7 = new tnh(R.string.record_start_failed_title);
        tnh tnhVar8 = new tnh(R.string.record_failed_caption);
        Integer numValueOf7 = Integer.valueOf(R.drawable.icon_warning_fill);
        xx1 xx1Var = xx1.b;
        D = new py1(xx1Var, tnhVar7, tnhVar8, numValueOf7);
        E = new py1(xx1Var, new tnh(R.string.record_stop_failed_title), new tnh(R.string.record_failed_caption), numValueOf7);
    }

    public ry1() {
        super(sbi.a);
    }
}
