package defpackage;

import android.text.SpannableStringBuilder;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mh1 implements k79 {
    public final long a;
    public final SpannableStringBuilder b;
    public final long c;

    public mh1(long j, SpannableStringBuilder spannableStringBuilder) {
        this.a = j;
        this.b = spannableStringBuilder;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh1)) {
            return false;
        }
        mh1 mh1Var = (mh1) obj;
        return this.a == mh1Var.a && this.b.equals(mh1Var.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return R.id.call_event_view_item;
    }

    public final String toString() {
        return "CallEventItemView(id=" + this.a + ", text=" + ((Object) this.b) + ")";
    }
}
