package defpackage;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ke extends uud {
    public final /* synthetic */ int u;
    public final Object v;

    public ke(Context context, int i) {
        this.u = i;
        switch (i) {
            case 1:
                atf atfVar = new atf(context);
                super(atfVar);
                ctf ctfVar = new ctf(16777216L, 0, new tnh(R.string.oneme_profile_section_discussions_blocked_list), null, null, null, aql.a(R.drawable.icon_block), fsf.a, null, false, null, 1592);
                this.v = ctfVar;
                atfVar.setModelItem(ctfVar);
                break;
            case 2:
                atf atfVar2 = new atf(context);
                super(atfVar2);
                ctf ctfVar2 = new ctf(PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED, 0, new tnh(R.string.profile_section_item_action_invite_by_link), null, null, null, aql.a(R.drawable.icon_link), fsf.a, null, false, null, 1592);
                this.v = ctfVar2;
                atfVar2.setModelItem(ctfVar2);
                break;
            case 3:
                atf atfVar3 = new atf(context);
                super(atfVar3);
                ctf ctfVar3 = new ctf(128L, 0, new tnh(R.string.oneme_profile_section_subscribers), null, null, null, aql.a(R.drawable.icon_users), fsf.a, null, false, null, 1592);
                this.v = ctfVar3;
                atfVar3.setModelItem(ctfVar3);
                break;
            case 4:
                atf atfVar4 = new atf(context);
                super(atfVar4);
                ctf ctfVar4 = new ctf(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 0, new tnh(R.string.oneme_profile_section_pending_join_requests), null, null, null, aql.a(R.drawable.icon_users_add), fsf.a, null, false, null, 1592);
                this.v = ctfVar4;
                atfVar4.setModelItem(ctfVar4);
                break;
            case 5:
                super(new atf(context));
                this.v = new ctf(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 0, new tnh(R.string.oneme_profile_section_rkn), null, null, null, new bz8(R.drawable.icon_a_plus, 0, 2), null, null, false, null, 1592);
                break;
            case 6:
                atf atfVar5 = new atf(context);
                super(atfVar5);
                this.v = atfVar5;
                atfVar5.setMinimumHeight(gm0.K(56.0f * yl5.d().getDisplayMetrics().density));
                break;
            default:
                atf atfVar6 = new atf(context);
                super(atfVar6);
                ctf ctfVar5 = new ctf(64L, 0, new tnh(R.string.oneme_profile_section_admins), null, null, null, aql.a(R.drawable.icon_user_admin), fsf.a, null, false, null, 1592);
                this.v = ctfVar5;
                atfVar6.setId(R.id.profile_admins_view);
                atfVar6.setModelItem(ctfVar5);
                break;
        }
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        int i = this.u;
        int i2 = 0;
        View view = this.a;
        Object obj = this.v;
        switch (i) {
            case 0:
                ((atf) view).setModelItem(ctf.i((ctf) obj, null, new isf(new xnh(String.valueOf(((iqd) k79Var).a)), null), null, 1919));
                break;
            case 1:
                atf atfVar = (atf) view;
                ctf ctfVar = (ctf) obj;
                int i3 = ((nqd) k79Var).a;
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(Math.abs(i3));
                int length = strValueOf.length();
                while (i2 < length) {
                    if (i2 > 0 && (strValueOf.length() - i2) % 3 == 0) {
                        sb.append(' ');
                    }
                    sb.append(strValueOf.charAt(i2));
                    i2++;
                }
                atfVar.setModelItem(ctf.i(ctfVar, null, new isf(new xnh(sb.toString()), null), null, 1919));
                break;
            case 2:
                ((atf) view).setModelItem((ctf) obj);
                break;
            case 3:
                atf atfVar2 = (atf) view;
                ctf ctfVar2 = (ctf) obj;
                int i4 = ((yqd) k79Var).a;
                StringBuilder sb2 = new StringBuilder();
                String strValueOf2 = String.valueOf(Math.abs(i4));
                int length2 = strValueOf2.length();
                while (i2 < length2) {
                    if (i2 > 0 && (strValueOf2.length() - i2) % 3 == 0) {
                        sb2.append(' ');
                    }
                    sb2.append(strValueOf2.charAt(i2));
                    i2++;
                }
                atfVar2.setModelItem(ctf.i(ctfVar2, null, new isf(new xnh(sb2.toString()), null), null, 1919));
                break;
            case 4:
                ((atf) view).setModelItem(ctf.i((ctf) obj, null, null, new dsf(((zqd) k79Var).a, 2), 1791));
                break;
            case 5:
                ((atf) view).setModelItem((ctf) obj);
                break;
            default:
                atf atfVar3 = (atf) obj;
                atfVar3.setId(R.id.profile_invite_join_request_toggle);
                atfVar3.setModelItem(((hqd) k79Var).a);
                break;
        }
    }

    @Override // defpackage.uud
    public final void J(View.OnClickListener onClickListener) {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 0:
                qe7.H(view, 300L, onClickListener);
                break;
            case 1:
                qe7.H(view, 300L, onClickListener);
                break;
            case 2:
                qe7.H(view, 300L, onClickListener);
                break;
            case 3:
                qe7.H(view, 300L, onClickListener);
                break;
            case 4:
                qe7.H(view, 300L, onClickListener);
                break;
            case 5:
                qe7.H(view, 300L, onClickListener);
                break;
            default:
                qe7.H((atf) this.v, 300L, onClickListener);
                break;
        }
    }

    @Override // defpackage.uud
    public void K(View.OnLongClickListener onLongClickListener) {
        switch (this.u) {
            case 6:
                ((atf) this.v).setOnLongClickListener(onLongClickListener);
                break;
        }
    }
}
