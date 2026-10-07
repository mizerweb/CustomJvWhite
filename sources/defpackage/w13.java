package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w13 {
    public final ifh a = new ifh(new k82(13));
    public final ifh b = new ifh(new k82(14));

    public static rp4 a(int i) {
        return new rp4(R.id.profile_media_action_forward, new tnh(i), Integer.valueOf(R.drawable.icon_forward), (Integer) null, 20);
    }

    public final c79 b(boolean z) {
        c79 c79VarW = yab.w();
        c79VarW.add((rp4) this.b.getValue());
        if (z) {
            c79VarW.add(a(R.string.profile_media_action_forward_audio));
        }
        c79VarW.add((rp4) this.a.getValue());
        return yab.j(c79VarW);
    }
}
