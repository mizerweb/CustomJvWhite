package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hqd extends erd {
    public final ctf a;

    public hqd(ctf ctfVar) {
        this.a = ctfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqd) && this.a.equals(((hqd) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
    }

    public final int hashCode() {
        return Integer.hashCode(np0.q) + ((this.a.hashCode() + (Integer.hashCode(R.id.profile_invite_join_request_toggle) * 31)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return np0.q;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        if ((k79Var instanceof hqd) && !(this.a.h instanceof ksf)) {
            return equals(k79Var);
        }
        return false;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        if (!(k79Var instanceof hqd)) {
            return null;
        }
        msf msfVar = ((hqd) k79Var).a.h;
        if (msfVar instanceof ksf) {
            return new usd(((ksf) msfVar).a);
        }
        return null;
    }

    public final String toString() {
        String strB = jll.b(np0.q);
        StringBuilder sb = new StringBuilder("ActionButton(actionId=");
        sb.append(R.id.profile_invite_join_request_toggle);
        sb.append(", model=");
        sb.append(this.a);
        sb.append(", itemViewType=");
        return zo5.w(sb, strB, ")");
    }
}
