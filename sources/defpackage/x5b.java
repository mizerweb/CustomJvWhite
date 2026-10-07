package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import one.me.messages.list.loader.MessageModel;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class x5b {
    public static final /* synthetic */ zv8[] j;
    public final cea a;
    public final gu4 b;
    public final xhh c;
    public final gjg d;
    public final rea e;
    public final mjg f;
    public final r8e g;
    public final p3c h;
    public final l9b i;

    static {
        z8b z8bVar = new z8b(x5b.class, "newSelectionJob", "getNewSelectionJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    public x5b(cea ceaVar, dq4 dq4Var, xhh xhhVar, r8e r8eVar, rea reaVar) {
        this.a = ceaVar;
        this.b = dq4Var;
        this.c = xhhVar;
        this.d = r8eVar;
        this.e = reaVar;
        mjg mjgVarA = p90.a(new r5b());
        this.f = mjgVarA;
        this.g = new r8e(mjgVarA);
        this.h = qyj.S();
        this.i = new l9b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(x5b x5bVar, cf7 cf7Var, nq4 nq4Var) {
        v5b v5bVar;
        Set setW1;
        Set set;
        f9b f9bVar;
        List list;
        f9b f9bVar2;
        mjg mjgVar = x5bVar.f;
        if (nq4Var instanceof v5b) {
            v5bVar = (v5b) nq4Var;
            int i = v5bVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                v5bVar.j = i - Integer.MIN_VALUE;
            } else {
                v5bVar = new v5b(x5bVar, nq4Var);
            }
        } else {
            v5bVar = new v5b(x5bVar, nq4Var);
        }
        Object objE = v5bVar.h;
        int i2 = v5bVar.j;
        sbi sbiVar = sbi.a;
        Object obj = hu4.a;
        if (i2 != 0) {
            if (i2 == 1) {
                set = v5bVar.f;
                f9b f9bVar3 = v5bVar.e;
                setW1 = v5bVar.d;
                ch3.d0(objE);
                f9bVar = f9bVar3;
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = v5bVar.g;
                set = v5bVar.f;
                f9b f9bVar4 = v5bVar.e;
                ch3.d0(objE);
                f9bVar2 = f9bVar4;
            }
            f9bVar2.setValue(new r5b(list, (Map) objE, set));
            return sbiVar;
        }
        ch3.d0(objE);
        Set set2 = ((r5b) mjgVar.getValue()).a;
        setW1 = ww3.W1(set2);
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (((Boolean) cf7Var.invoke(new Long(jLongValue))).booleanValue()) {
                setW1.remove(new Long(jLongValue));
            }
        }
        if (set2.equals(setW1)) {
            return sbiVar;
        }
        if (setW1.isEmpty()) {
            mjgVar.j(null, new r5b());
            return sbiVar;
        }
        v5bVar.d = setW1;
        v5bVar.e = mjgVar;
        v5bVar.f = setW1;
        v5bVar.j = 1;
        objE = x5bVar.e(setW1, v5bVar);
        if (objE != obj) {
            set = setW1;
            f9bVar = mjgVar;
        }
        return obj;
        List list2 = (List) objE;
        v5bVar.d = null;
        v5bVar.e = f9bVar;
        v5bVar.f = set;
        v5bVar.g = list2;
        v5bVar.j = 2;
        Object objD = x5bVar.d(setW1, v5bVar);
        if (objD != obj) {
            objE = objD;
            list = list2;
            f9bVar2 = f9bVar;
            f9bVar2.setValue(new r5b(list, (Map) objE, set));
            return sbiVar;
        }
        return obj;
    }

    public static mcc c(hda hdaVar) {
        int iOrdinal = hdaVar.ordinal();
        if (iOrdinal == 0) {
            return new mcc(R.id.messages_list_context_action_forward, R.string.chat_screen_action_forward, R.drawable.icon_forward, false, null, 40);
        }
        if (iOrdinal == 1) {
            return new mcc(R.id.messages_list_context_action_copy, R.string.chat_screen_action_copy, R.drawable.icon_copy, false, null, 40);
        }
        if (iOrdinal == 4) {
            return new mcc(R.id.messages_list_context_action_reply, R.string.chat_screen_action_reply, R.drawable.icon_reply, false, null, 40);
        }
        if (iOrdinal == 5) {
            return new mcc(R.id.messages_list_context_action_delete, R.string.chat_screen_action_delete, R.drawable.icon_delete, false, Integer.valueOf(R.attr.icon_negative), 8);
        }
        if (iOrdinal == 7) {
            return new mcc(R.id.messages_list_context_action_pin, R.string.chat_screen_action_pin, R.drawable.icon_pin, false, null, 40);
        }
        if (iOrdinal == 8) {
            return new mcc(R.id.messages_list_context_action_unpin, R.string.chat_screen_action_unpin, R.drawable.icon_pin_crossed, false, null, 40);
        }
        if (iOrdinal == 10) {
            return new mcc(R.id.messages_list_context_action_edit, R.string.chat_screen_action_edit, R.drawable.icon_edit, false, null, 40);
        }
        if (iOrdinal == 11) {
            return new mcc(R.id.messages_list_context_action_save_to_gallery, R.string.chat_screen_action_save_to_gallery, R.drawable.icon_download, false, null, 40);
        }
        if (iOrdinal != 13) {
            return null;
        }
        return new mcc(R.id.messages_list_context_action_share_externally, R.string.chat_screen_action_share_externally, R.drawable.icon_share_android, false, null, 40);
    }

    public final void b() {
        r5b r5bVar = new r5b();
        mjg mjgVar = this.f;
        mjgVar.getClass();
        mjgVar.j(null, r5bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Set set, nq4 nq4Var) {
        s5b s5bVar;
        if (nq4Var instanceof s5b) {
            s5bVar = (s5b) nq4Var;
            int i = s5bVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                s5bVar.f = i - Integer.MIN_VALUE;
            } else {
                s5bVar = new s5b(this, nq4Var);
            }
        } else {
            s5bVar = new s5b(this, nq4Var);
        }
        Object objN = s5bVar.d;
        int i2 = s5bVar.f;
        if (i2 == 0) {
            ch3.d0(objN);
            s5bVar.f = 1;
            objN = this.a.n(set, s5bVar);
            Object obj = hu4.a;
            if (objN == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objN);
        }
        ArrayList arrayList = new ArrayList();
        for (hda hdaVar : (List) objN) {
            mcc mccVarC = c(hdaVar);
            ylc ylcVar = mccVarC != null ? new ylc(hdaVar, mccVarC) : null;
            if (ylcVar != null) {
                arrayList.add(ylcVar);
            }
        }
        return wm9.W0(arrayList);
    }

    public final Serializable e(Set set, nq4 nq4Var) {
        if (set.isEmpty()) {
            return r66.a;
        }
        return set.size() == 1 ? g(((opa) this.d.getValue()).h(((Number) ww3.q1(set)).longValue()), nq4Var) : f(set, nq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(Set set, nq4 nq4Var) {
        t5b t5bVar;
        c79 c79Var;
        c79 c79Var2;
        if (nq4Var instanceof t5b) {
            t5bVar = (t5b) nq4Var;
            int i = t5bVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                t5bVar.h = i - Integer.MIN_VALUE;
            } else {
                t5bVar = new t5b(this, nq4Var);
            }
        } else {
            t5bVar = new t5b(this, nq4Var);
        }
        Object obj = t5bVar.f;
        int i2 = t5bVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            c79 c79VarW = yab.w();
            t5bVar.d = c79VarW;
            t5bVar.e = c79VarW;
            t5bVar.h = 1;
            Serializable serializableM = this.a.m(set, t5bVar);
            hu4 hu4Var = hu4.a;
            if (serializableM == hu4Var) {
                return hu4Var;
            }
            c79Var = c79VarW;
            obj = serializableM;
            c79Var2 = c79Var;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c79Var2 = t5bVar.e;
            c79Var = t5bVar.d;
            ch3.d0(obj);
        }
        c79Var2.addAll((Collection) obj);
        c79 c79VarJ = yab.j(c79Var);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c79VarJ.listIterator(0);
        while (true) {
            b79 b79Var = (b79) listIterator;
            if (!b79Var.hasNext()) {
                return arrayList;
            }
            mcc mccVarC = c((hda) b79Var.next());
            if (mccVarC != null) {
                arrayList.add(mccVarC);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable g(MessageModel messageModel, nq4 nq4Var) {
        u5b u5bVar;
        c79 c79Var;
        c79 c79Var2;
        if (nq4Var instanceof u5b) {
            u5bVar = (u5b) nq4Var;
            int i = u5bVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                u5bVar.h = i - Integer.MIN_VALUE;
            } else {
                u5bVar = new u5b(this, nq4Var);
            }
        } else {
            u5bVar = new u5b(this, nq4Var);
        }
        Object obj = u5bVar.f;
        int i2 = u5bVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            if (messageModel == null) {
                return r66.a;
            }
            c79 c79VarW = yab.w();
            long j2 = messageModel.a;
            u5bVar.d = c79VarW;
            u5bVar.e = c79VarW;
            u5bVar.h = 1;
            Serializable serializableL = this.a.l(j2, u5bVar);
            hu4 hu4Var = hu4.a;
            if (serializableL == hu4Var) {
                return hu4Var;
            }
            c79Var = c79VarW;
            obj = serializableL;
            c79Var2 = c79Var;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c79Var2 = u5bVar.e;
            c79Var = u5bVar.d;
            ch3.d0(obj);
        }
        c79Var2.addAll((Collection) obj);
        c79 c79VarJ = yab.j(c79Var);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c79VarJ.listIterator(0);
        while (true) {
            b79 b79Var = (b79) listIterator;
            if (!b79Var.hasNext()) {
                return arrayList;
            }
            mcc mccVarC = c((hda) b79Var.next());
            if (mccVarC != null) {
                arrayList.add(mccVarC);
            }
        }
    }

    public final boolean h() {
        return !((r5b) this.g.a.getValue()).a.isEmpty();
    }

    public final void i(long j2) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) this.c).a(), 2, new ue0(j2, this, (lq4) null));
        this.h.B(this, j[0], sggVarH0);
    }
}
