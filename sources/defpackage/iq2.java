package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class iq2 {
    public final String a;

    public iq2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iq2) && cqk.d(this.a, ((iq2) obj).a);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(R.string.profile_edit_shortlink_private_channel_created_title) * 31;
        String str = this.a;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "HeaderState(titleIdRes=" + R.string.profile_edit_shortlink_private_channel_created_title + ", animojiLottieUrl=" + this.a + ")";
    }
}
