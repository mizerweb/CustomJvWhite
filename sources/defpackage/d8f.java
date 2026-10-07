package defpackage;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.chats.search.ChatsListSearchScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class d8f extends y69 {
    public final j7c e;
    public final p4c f;
    public final ChatsListSearchScreen g;

    public d8f(j7c j7cVar, p4c p4cVar, ChatsListSearchScreen chatsListSearchScreen, ExecutorService executorService) {
        super(new ki3(null, executorService, new k45(7)));
        this.e = j7cVar;
        this.f = p4cVar;
        this.g = chatsListSearchScreen;
    }

    @Override // defpackage.nee
    public final int n(int i) {
        return ((y8f) F(i)).getF();
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        CharSequence charSequenceG;
        rt2 rt2Var;
        vg4 vg4VarW;
        String string;
        String string2;
        CharSequence charSequenceG2;
        y8f y8fVar = (y8f) F(i);
        boolean z = true;
        boolean z2 = false;
        if (y8fVar instanceof be3) {
            ce3 ce3Var = (ce3) lfeVar;
            be3 be3Var = (be3) y8fVar;
            a8f a8fVar = new a8f(this, 1);
            b8f b8fVar = new b8f(this, 0);
            fz7 fz7Var = new fz7(1, this.g, c8f.class, "onTrailingButtonClick", "onTrailingButtonClick(Lone/me/chats/search/models/SearchModel;)V", 0, 22);
            xcd xcdVar = be3Var.m;
            Long l = be3Var.w;
            ce3Var.v = l != null ? l.longValue() : 0L;
            xu2 xu2Var = (xu2) ce3Var.a;
            qe7.H(xu2Var, 300L, new ee(a8fVar, 17, be3Var));
            xu2Var.setOnLongClickListener(new o03(b8fVar, be3Var, xu2Var, 2));
            xu2Var.setTrailingButtonClickListener(new ee(fz7Var, 18, be3Var));
            int id = xu2Var.getId();
            xu2Var.setId(Long.hashCode(be3Var.c));
            String string3 = xcdVar.a.toString();
            TextView textView = xu2Var.b;
            if (string3 == null || string3.length() == 0 || textView.getPaint().measureText(string3) <= textView.getMeasuredWidth()) {
                charSequenceG2 = xcdVar.a;
            } else {
                j7c j7cVar = ce3Var.u;
                CharSequence charSequence = xcdVar.a;
                List list = be3Var.b;
                String[] strArr = xcdVar.b;
                j7cVar.getClass();
                charSequenceG2 = j7c.g(charSequence, list, strArr);
            }
            xu2Var.setTitle(charSequenceG2);
            xu2Var.g(be3Var.n, true);
            xu2Var.e(be3Var.k, be3Var.t, Long.valueOf(be3Var.l));
            xu2Var.setPinned(be3Var.d);
            xu2Var.setMuted(be3Var.e);
            xu2Var.setMention(be3Var.f);
            xu2Var.setReaction(be3Var.g);
            xu2Var.setTime(be3Var.h);
            xu2Var.m(be3Var.i, id == xu2Var.getId());
            xu2Var.setStatus(be3Var.j);
            xu2Var.setVerified(be3Var.u);
            xu2Var.setLiveStreamBadge(be3Var.v);
            xu2Var.setTrailingButton(be3Var.x);
            return;
        }
        if (y8fVar instanceof nn7) {
            on7 on7Var = (on7) lfeVar;
            nn7 nn7Var = (nn7) y8fVar;
            bad badVar = new bad(this, 5, nn7Var);
            wf0 wf0Var = new wf0(23);
            j7c j7cVar2 = on7Var.u;
            xcd xcdVar2 = nn7Var.g;
            List list2 = nn7Var.b;
            xu2 xu2Var2 = (xu2) on7Var.a;
            qe7.H(xu2Var2, 300L, new z36(badVar, 7, nn7Var));
            xu2Var2.setOnLongClickListener(new nq1(wf0Var, nn7Var, xu2Var2));
            long j = nn7Var.c;
            xu2Var2.setId(Long.hashCode(j));
            xcd xcdVar3 = nn7Var.f;
            String string4 = xcdVar3.a.toString();
            TextView textView2 = xu2Var2.b;
            if (string4 != null && string4.length() != 0 && textView2.getPaint().measureText(string4) > textView2.getMeasuredWidth()) {
                z2 = true;
            }
            CharSequence charSequenceG3 = xcdVar3.a;
            if (z2) {
                String[] strArr2 = xcdVar3.b;
                j7cVar2.getClass();
                charSequenceG3 = j7c.g(charSequenceG3, list2, strArr2);
            }
            xu2Var2.setTitle(charSequenceG3);
            CharSequence charSequenceG4 = xcdVar2.a;
            if (xu2Var2.c(charSequenceG4.toString())) {
                String[] strArr3 = xcdVar2.b;
                j7cVar2.getClass();
                charSequenceG4 = j7c.g(charSequenceG4, list2, strArr3);
            }
            xu2Var2.g(charSequenceG4, true);
            xu2Var2.e(nn7Var.e, nn7Var.j, Long.valueOf(j));
            xu2Var2.setTime(nn7Var.d);
            xu2Var2.setVerified(nn7Var.k);
            return;
        }
        if (y8fVar instanceof fm4) {
            im4 im4Var = (im4) lfeVar;
            fm4 fm4Var = (fm4) y8fVar;
            a8f a8fVar2 = new a8f(this, 2);
            b8f b8fVar2 = new b8f(this, 1);
            long j2 = fm4Var.c;
            im4Var.u = j2;
            izb izbVar = (izb) im4Var.a;
            qe7.H(izbVar, 300L, new ee(a8fVar2, 23, fm4Var));
            izbVar.setOnLongClickListener(new o03(b8fVar2, fm4Var, izbVar, 3));
            CharSequence charSequence2 = fm4Var.j;
            Uri uri = fm4Var.i;
            if (uri == null || (string2 = uri.toString()) == null) {
                string2 = Uri.EMPTY.toString();
            }
            izbVar.j(j2, charSequence2, string2);
            izbVar.setTitle(fm4Var.d);
            izbVar.setSubtitle(fm4Var.e);
            izbVar.setVerified(fm4Var.g);
            return;
        }
        if (y8fVar instanceof sn7) {
            tn7 tn7Var = (tn7) lfeVar;
            sn7 sn7Var = (sn7) y8fVar;
            a8f a8fVar3 = new a8f(this, 3);
            j7c j7cVar3 = tn7Var.u;
            List list3 = sn7Var.b;
            xcd xcdVar4 = sn7Var.f;
            izb izbVar2 = (izb) tn7Var.a;
            qe7.H(izbVar2, 300L, new z36(a8fVar3, 9, sn7Var));
            xcd xcdVar5 = sn7Var.e;
            String string5 = xcdVar5.a.toString();
            TextView textView3 = izbVar2.e;
            z = (string5 == null || string5.length() == 0 || textView3.getPaint().measureText(string5) <= ((float) textView3.getMeasuredWidth())) ? false : true;
            CharSequence charSequenceG5 = xcdVar5.a;
            if (z) {
                String[] strArr4 = xcdVar5.b;
                j7cVar3.getClass();
                charSequenceG5 = j7c.g(charSequenceG5, list3, strArr4);
            }
            izbVar2.setTitle(charSequenceG5);
            boolean zH = izbVar2.h(xcdVar4.a.toString());
            CharSequence charSequenceG6 = xcdVar4.a;
            if (zH) {
                String[] strArr5 = xcdVar4.b;
                j7cVar3.getClass();
                charSequenceG6 = j7c.g(charSequenceG6, list3, strArr5);
            }
            izbVar2.setSubtitle(charSequenceG6);
            long j3 = sn7Var.c;
            String str = sn7Var.d;
            Uri uri2 = sn7Var.h;
            if (uri2 == null || (string = uri2.toString()) == null) {
                string = Uri.EMPTY.toString();
            }
            izbVar2.j(j3, str, string);
            izbVar2.setVerified(sn7Var.g);
            return;
        }
        if (!(y8fVar instanceof sja)) {
            if (y8fVar instanceof b3g) {
                ((c3g) lfeVar).H();
                return;
            }
            return;
        }
        uja ujaVar = (uja) lfeVar;
        sja sjaVar = (sja) y8fVar;
        a8f a8fVar4 = new a8f(this, 4);
        xu2 xu2Var3 = (xu2) ujaVar.a;
        qe7.H(xu2Var3, 300L, new z36(a8fVar4, 24, sjaVar));
        if (sjaVar.f != null) {
            xu2Var3.setTitle(sjaVar.i);
            Uri uri3 = sjaVar.c;
            rt2 rt2Var2 = sjaVar.f;
            rt2Var2.L0();
            xu2Var3.e(uri3, rt2Var2.m, Long.valueOf(sjaVar.f.q()));
        }
        if (xu2Var3.c(sjaVar.h.a.toString())) {
            j7c j7cVar4 = ujaVar.u;
            xcd xcdVar6 = sjaVar.h;
            CharSequence charSequence3 = xcdVar6.a;
            List list4 = sjaVar.b;
            String[] strArr6 = xcdVar6.b;
            j7cVar4.getClass();
            charSequenceG = j7c.g(charSequence3, list4, strArr6);
        } else {
            charSequenceG = sjaVar.h.a;
        }
        xu2Var3.g(charSequenceG, true);
        p4c p4cVar = ujaVar.v;
        xu2Var3.setTime(oc9.E(p4cVar.a, p4cVar.f, sjaVar.e.b, p4cVar.c.f(), false, false, true));
        rt2 rt2Var3 = sjaVar.f;
        if ((rt2Var3 == null || !rt2Var3.u0()) && ((rt2Var = sjaVar.f) == null || (vg4VarW = rt2Var.w()) == null || !vg4VarW.G())) {
            z = false;
        }
        xu2Var3.setVerified(z);
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        u(lfeVar, i);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        j7c j7cVar = this.e;
        if (i == R.id.chats_search_chat_view_type) {
            return new ce3(j7cVar, viewGroup.getContext());
        }
        if (i == R.id.chats_search_global_chat_view_type) {
            return new on7(j7cVar, viewGroup.getContext());
        }
        if (i == R.id.chats_search_contact_view_type) {
            im4 im4Var = new im4(new izb(viewGroup.getContext(), false));
            im4Var.u = 0L;
            return im4Var;
        }
        if (i == R.id.chats_search_global_contact_view_type) {
            return new tn7(j7cVar, viewGroup.getContext());
        }
        if (i == R.id.chats_search_message_view_type) {
            return new uja(viewGroup.getContext(), j7cVar, this.f);
        }
        if (i == R.id.chats_search_show_more_view_type) {
            return new c3g(viewGroup.getContext(), new a8f(this, 0));
        }
        ore.p(zo5.h(i, "Unsupported view type: "));
        return null;
    }
}
