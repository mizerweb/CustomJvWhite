package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.push.core.filedatastore.FileDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.a;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.chatpreview.ChatPreviewBottomWidget;
import one.me.contactadddialog.ContactAddBottomSheet;
import one.me.mediaeditor.editandreply.EditAndReplyScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.exception.IssueKeyException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fze extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fze(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    private final Object l(Object obj) {
        Object poeVar;
        e70 e70VarK;
        h60 h60Var;
        ch3.d0(obj);
        t34 t34Var = (t34) this.h;
        lc8 lc8Var = (lc8) this.g;
        long j = lc8Var.b;
        try {
            poeVar = ((gb9) t34Var.c.getValue()).a(lc8Var.c, false);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        r34 p34Var = null;
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        fda fdaVar = (fda) poeVar;
        sbi sbiVar = sbi.a;
        if (fdaVar != null && (e70VarK = fdaVar.a.k(y60.b)) != null && (h60Var = e70VarK.c) != null) {
            int i = h60Var.a;
            int i2 = i == 0 ? -1 : s34.$EnumSwitchMapping$0[qt4.D(i)];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                p34Var = new p34(j);
            } else if (i2 == 4 || i2 == 5) {
                p34Var = new q34(j);
            }
            if (p34Var != null) {
                t34Var.a(p34Var);
            }
        }
        return sbiVar;
    }

    private final Object n(Object obj) {
        Object poeVar;
        tbg tbgVar = (tbg) this.f;
        ch3.d0(obj);
        if (tbgVar instanceof rbg) {
            try {
                String str = ((qb4) this.g).f;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                int length2 = string.length() - 3;
                if (length2 < 3) {
                    length2 = 3;
                }
                poeVar = "+" + r5h.h1(string, 3, length2, z5h.H0(length2 - 3, "*")).toString();
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            qb4 qb4Var = (qb4) this.g;
            String str2 = qb4Var.f;
            if (poeVar instanceof poe) {
                poeVar = str2;
            }
            String str3 = (String) poeVar;
            rbg rbgVar = (rbg) tbgVar;
            ag9 ag9Var = rbgVar.a;
            if (ag9Var instanceof uf9) {
                if (!((uf9) ag9Var).d) {
                    ((iv4) ((ny8) this.h).getValue()).a(null, new dg9(nbh.w("Code: '", ((qb4) this.g).v, "', Phone: '", str3, "'"), rbgVar.a.b));
                }
            } else if (ag9Var instanceof xf9) {
                ((iv4) ((ny8) this.h).getValue()).a(null, new dg9(str3));
            } else if (ag9Var instanceof wf9) {
                ((iv4) ((ny8) this.h).getValue()).a(null, new dg9(c0a.o("ProfileSuspended (", str3, ")"), false));
            } else if (ag9Var instanceof vf9) {
                ((iv4) ((ny8) this.h).getValue()).a(null, new dg9(c0a.o("ProfileBlocked (", str3, ")"), false));
            } else if (ag9Var instanceof zf9) {
                a8j.x(qb4Var.p, new ab4(str2));
            } else if (!(ag9Var instanceof sf9)) {
                if (!(ag9Var instanceof tf9)) {
                    ore.o();
                    return null;
                }
                a8j.x(qb4Var.p, za4.b);
            }
            mjg mjgVar = ((qb4) this.g).u;
            ag9 ag9Var2 = rbgVar.a;
            qt4.C((ag9Var2 instanceof wf9) || (ag9Var2 instanceof vf9), mjgVar, null);
        }
        ((qb4) this.g).v = null;
        return sbi.a;
    }

    private final Object o(Object obj) {
        int iIntValue;
        reh rehVar;
        ContactAddBottomSheet contactAddBottomSheet = (ContactAddBottomSheet) this.g;
        Object obj2 = this.f;
        ch3.d0(obj);
        if (((rbb) obj2) instanceof rt3) {
            ah4 ah4Var = (ah4) contactAddBottomSheet.n.getValue();
            long jD1 = contactAddBottomSheet.D1();
            ae9 ae9Var = (ae9) ah4Var.a.getValue();
            ul9 ul9Var = new ul9();
            ul9Var.put("user2Id", Long.valueOf(jD1));
            ae9.k(ae9Var, "CONTACT_RENAME_BANNER", "save", ul9Var.b(), 8);
            h8c h8cVar = new h8c(contactAddBottomSheet);
            h8cVar.h(new w8c(R.drawable.done_fill_round_animated));
            h8cVar.m(new tnh(R.string.oneme_unknown_contact_snackbar_add_contact));
            h8cVar.l(g9c.a);
            vv vvVar = contactAddBottomSheet.p;
            zv8 zv8Var = ContactAddBottomSheet.x[1];
            Integer num = (Integer) vvVar.a(contactAddBottomSheet);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                Integer numH = n7j.h((View) this.h);
                iIntValue = numH != null ? numH.intValue() : 0;
            }
            h8cVar.c(new o8c(0, 0, iIntValue, 11));
            g8c g8cVarP = h8cVar.p();
            if (g8cVarP != null && (rehVar = (reh) g8cVarP.a.e) != null) {
                p0m.a(rehVar, lt7.CONFIRM);
            }
            contactAddBottomSheet.v1(true);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object p(Object obj) {
        boolean z;
        mq2 mq2Var = (mq2) this.f;
        ch3.d0(obj);
        xh4 xh4Var = (xh4) this.g;
        mjg mjgVar = xh4Var.c;
        jq2 jq2Var = (jq2) mjgVar.getValue();
        jq2 jq2VarA = null;
        if (jq2Var != null) {
            mq2 mq2Var2 = (mq2) xh4Var.h.getValue();
            boolean z2 = false;
            if (mq2Var2 == null) {
                z = false;
            } else {
                if (mq2Var != null ? !cqk.d(mq2Var2.a, mq2Var.a) : false) {
                    z = true;
                } else {
                    z = false;
                }
            }
            String str = mq2Var != null ? mq2Var.a : null;
            if (str != null && str.length() != 0 && mq2Var != null && !mq2Var.d) {
                z2 = true;
            }
            jq2VarA = jq2.a(jq2Var, z, z2, false, null, 25);
        }
        mjgVar.setValue(jq2VarA);
        xh4Var.d.setValue(((dq2) ((ny8) this.h).getValue()).a(xh4Var));
        return sbi.a;
    }

    private final Object q(Object obj) {
        ch3.d0(obj);
        x8b x8bVar = (x8b) this.f;
        vdd vddVar = (vdd) this.h;
        Object obj2 = this.g;
        if (obj2 != null) {
            x8bVar.a(vddVar, obj2);
        } else {
            if (x8bVar.b.get()) {
                ore.k("Do mutate preferences once returned to DataStore.");
                return null;
            }
            x8bVar.a.remove(vddVar);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x0137  */
    private final Object r(Object obj) {
        Object obj2;
        String string;
        y02 y02VarO;
        int size;
        int i;
        b95 b95Var;
        x02 x02Var;
        a4c a4cVar;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        ch3.d0(obj);
        if (b95.b((b95) this.f).g()) {
            gm0.n("CallsManager", "outgoing call skipped: waiting for SDK to finish after early decline");
            return sbiVar;
        }
        b95 b95Var2 = (b95) this.f;
        hhg hhgVar = (hhg) this.g;
        b95Var2.getClass();
        ghg ghgVar = hhgVar.a;
        if (ghgVar instanceof ehg) {
            obj2 = ((ehg) ghgVar).a;
        } else {
            obj2 = ghgVar instanceof fhg ? ((fhg) ghgVar).a : null;
        }
        m32 m32Var = obj2 instanceof m32 ? (m32) obj2 : null;
        if (m32Var != null) {
            String str = m32Var.b;
            ns4 ns4Var = new ns4(str);
            if (ns4.b(str)) {
                ns4Var = null;
            }
            string = ns4Var != null ? ns4Var.a : null;
            if (string == null) {
                ifh ifhVar = ns4.b;
                string = UUID.randomUUID().toString();
            }
        } else {
            ifh ifhVar2 = ns4.b;
            string = UUID.randomUUID().toString();
        }
        Iterable iterable = (Iterable) ((b95) this.f).h.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (cqk.d(((x02) it.next()).s(), string)) {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, "CallsManager", c0a.o("outgoing call skipped: session ", ns4.c(string), " already exists"), null);
                        return sbiVar;
                    }
                }
            }
            if (!((b95) this.f).d(((hhg) this.g).a)) {
                gm0.n("CallsManager", "outgoing call can't start because call already started.");
                return sbiVar;
            }
            y02VarO = ((b95) this.f).o((ha9) this.h);
            size = ((List) ((b95) this.f).h.getValue()).size();
            ((b95) this.f).getClass();
            if (((Boolean) ((e5d) ((ifh) y02VarO.k()).getValue()).y().i()).booleanValue()) {
                i = 2;
            } else {
                i = 1;
            }
            if (size >= i) {
                x02 x02VarB = b95.b((b95) this.f);
                b95Var = (b95) this.f;
                x02Var = x02VarB != b95Var.g ? x02VarB : null;
                if (x02Var != null) {
                    b95Var.l(x02Var);
                }
                x02 x02VarA = b95.a((b95) this.f, y02VarO, string);
                y02VarO.a().b(x02VarA.D());
                x02VarA.a((hhg) this.g);
                return sbiVar;
            }
            a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallsManager", "outgoing call skipped: session limit reached", null);
            }
        } else {
            if (!((b95) this.f).d(((hhg) this.g).a)) {
                gm0.n("CallsManager", "outgoing call can't start because call already started.");
                return sbiVar;
            }
            y02VarO = ((b95) this.f).o((ha9) this.h);
            size = ((List) ((b95) this.f).h.getValue()).size();
            ((b95) this.f).getClass();
            if (((Boolean) ((e5d) ((ifh) y02VarO.k()).getValue()).y().i()).booleanValue()) {
                i = 2;
            } else {
                i = 1;
            }
            if (size >= i) {
                x02 x02VarB2 = b95.b((b95) this.f);
                b95Var = (b95) this.f;
                if (x02VarB2 != b95Var.g) {
                }
                if (x02Var != null) {
                    b95Var.l(x02Var);
                }
                x02 x02VarA2 = b95.a((b95) this.f, y02VarO, string);
                y02VarO.a().b(x02VarA2.D());
                x02VarA2.a((hhg) this.g);
                return sbiVar;
            }
            a4cVar = gm0.f;
            if (a4cVar != null) {
                a4cVar.c(je9Var, "CallsManager", "outgoing call skipped: session limit reached", null);
            }
        }
        return sbiVar;
    }

    private final Object s(Object obj) {
        Object poeVar;
        EditAndReplyScreen editAndReplyScreen = (EditAndReplyScreen) this.h;
        ec6 ec6Var = (ec6) this.f;
        ch3.d0(obj);
        Object objA = ec6Var.a();
        Throwable thA = roe.a(objA);
        sbi sbiVar = sbi.a;
        if (thA == null) {
            try {
                zv8[] zv8VarArr = EditAndReplyScreen.w;
                if (((hve) editAndReplyScreen.r.m(editAndReplyScreen, EditAndReplyScreen.w[10])).o()) {
                    editAndReplyScreen.t1().J(yka.a);
                }
                poeVar = sbiVar;
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            ch3.d0(poeVar);
        }
        return sbiVar;
    }

    private final Object t(Object obj) {
        Object poeVar;
        ch3.d0(obj);
        FileDataSource fileDataSource = (FileDataSource) this.g;
        try {
            lu6.s0(FileDataSource.access$getFileSource(fileDataSource), (String) this.h);
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        return new roe(poeVar);
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                fze fzeVar = new fze((Bitmap) obj3, (gze) obj2, lq4Var, 0);
                fzeVar.f = obj;
                return fzeVar;
            case 1:
                fze fzeVar2 = new fze((cyb) obj3, (AddChatMembersScreen) obj2, lq4Var, 1);
                fzeVar2.f = obj;
                return fzeVar2;
            case 2:
                fze fzeVar3 = new fze((ny8) obj3, (dd) obj2, lq4Var, 2);
                fzeVar3.f = obj;
                return fzeVar3;
            case 3:
                return new fze((t90) this.f, (String) obj3, (String) obj2, lq4Var, 3);
            case 4:
                return new fze((cm0) this.f, (Context) obj3, (sri) obj2, lq4Var, 4);
            case 5:
                fze fzeVar4 = new fze((z01) obj3, (ny8) obj2, lq4Var, 5);
                fzeVar4.f = obj;
                return fzeVar4;
            case 6:
                fze fzeVar5 = new fze((CallBottomPanelWidget) obj3, (qc1) obj2, lq4Var, 6);
                fzeVar5.f = obj;
                return fzeVar5;
            case 7:
                fze fzeVar6 = new fze(lq4Var, (View) obj3, (CallEventsWidget) obj2, 7);
                fzeVar6.f = obj;
                return fzeVar6;
            case 8:
                fze fzeVar7 = new fze(lq4Var, (View) obj3, (CallRateBottomSheet) obj2, 8);
                fzeVar7.f = obj;
                return fzeVar7;
            case 9:
                fze fzeVar8 = new fze((w82) obj3, (ny8) obj2, lq4Var, 9);
                fzeVar8.f = obj;
                return fzeVar8;
            case 10:
                fze fzeVar9 = new fze((lv2) obj3, (ny8) obj2, lq4Var, 10);
                fzeVar9.f = obj;
                return fzeVar9;
            case 11:
                return new fze((lv2) this.f, (lq2) obj3, (rt2) obj2, lq4Var, 11);
            case 12:
                return new fze((fda) this.f, (x43) obj3, (ny8) obj2, lq4Var, 12);
            case 13:
                fze fzeVar10 = new fze(lq4Var, (LinearLayout) obj3, (ChatPreviewBottomWidget) obj2, 13);
                fzeVar10.f = obj;
                return fzeVar10;
            case 14:
                fze fzeVar11 = new fze((ga3) obj3, (ny8) obj2, lq4Var, 14);
                fzeVar11.f = obj;
                return fzeVar11;
            case 15:
                fze fzeVar12 = new fze((ChatScreen) obj3, (wfe) obj2, lq4Var, 15);
                fzeVar12.f = obj;
                return fzeVar12;
            case 16:
                fze fzeVar13 = new fze((String) obj3, lq4Var, (ChatScreen) obj2, 16);
                fzeVar13.f = obj;
                return fzeVar13;
            case 17:
                fze fzeVar14 = new fze(lq4Var, (ChatScreen) obj3, (View) obj2, 17);
                fzeVar14.f = obj;
                return fzeVar14;
            case 18:
                return new fze((wf3) this.f, (RectF) obj3, (Rect) obj2, lq4Var, 18);
            case 19:
                fze fzeVar15 = new fze((yfj) obj3, (ViewGroup) obj2, lq4Var, 19);
                fzeVar15.f = obj;
                return fzeVar15;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                fze fzeVar16 = new fze((lc8) obj3, (t34) obj2, lq4Var, 20);
                fzeVar16.f = obj;
                return fzeVar16;
            case 21:
                fze fzeVar17 = new fze((qb4) obj3, (ny8) obj2, lq4Var, 21);
                fzeVar17.f = obj;
                return fzeVar17;
            case 22:
                fze fzeVar18 = new fze(lq4Var, (ContactAddBottomSheet) obj3, (View) obj2, 22);
                fzeVar18.f = obj;
                return fzeVar18;
            case 23:
                fze fzeVar19 = new fze((xh4) obj3, (ny8) obj2, lq4Var, 23);
                fzeVar19.f = obj;
                return fzeVar19;
            case 24:
                fze fzeVar20 = new fze((cyb) obj3, (ContactsPickerScreen) obj2, lq4Var, 24);
                fzeVar20.f = obj;
                return fzeVar20;
            case 25:
                fze fzeVar21 = new fze(obj3, (vdd) obj2, lq4Var, 25);
                fzeVar21.f = obj;
                return fzeVar21;
            case 26:
                return new fze((b95) this.f, (hhg) obj3, (ha9) obj2, lq4Var, 26);
            case 27:
                fze fzeVar22 = new fze((xx6) obj3, lq4Var, (EditAndReplyScreen) obj2, 27);
                fzeVar22.f = obj;
                return fzeVar22;
            case 28:
                fze fzeVar23 = new fze((FileDataSource) obj3, (String) obj2, lq4Var, 28);
                fzeVar23.f = obj;
                return fzeVar23;
            default:
                return new fze((f37) this.f, (ynh) obj3, (ynh) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                ((fze) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((fze) create((cd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                return ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((fze) create((vg4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((fze) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((fze) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((fze) create((fu1) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((fze) create((lq2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((fze) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                return ((fze) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                ((fze) create((e21) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ((fze) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((fze) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ((fze) create((h50) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ((fze) create((tbg) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                ((fze) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                ((fze) create((mq2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                ((fze) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                ((fze) create((x8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 27:
                ((fze) create((ec6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 28:
                return ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((fze) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:362:0x0c34  */
    /* JADX WARN: Code duplicated, block: B:364:0x0c3c  */
    /* JADX WARN: Code duplicated, block: B:370:0x0c63  */
    /* JADX WARN: Code duplicated, block: B:373:0x0c78  */
    /* JADX WARN: Code duplicated, block: B:375:0x0c8a  */
    /* JADX WARN: Code duplicated, block: B:377:0x0c8f  */
    /* JADX WARN: Code duplicated, block: B:378:0x0c92  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        rnh rnhVar;
        AddChatMembersScreen addChatMembersScreen;
        g8c g8cVar;
        View view;
        int iIntValue;
        zv8[] zv8VarArr;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numG;
        Object value;
        ynh tnhVar;
        ArrayList arrayListA;
        String str;
        nee adapter;
        boolean z;
        iq2 iq2Var;
        long jG;
        Long lK;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        Object value2;
        View view2;
        a4c a4cVar;
        String strA;
        ArrayList arrayList = null;
        iq2Var = null;
        iq2Var = null;
        iq2 iq2Var2 = null;
        jq2 jq2VarA = null;
        switch (this.e) {
            case 0:
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                Bitmap bitmap = (Bitmap) this.g;
                gze gzeVar = (gze) this.h;
                try {
                    poeVar = gzeVar.a.b(new my0(bitmap), "story_" + System.currentTimeMillis() + ".jpg");
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    gm0.V(gu4Var.getClass().getName(), null, new eze("failed to save image to downloads", thA));
                }
                if (poeVar instanceof poe) {
                    return null;
                }
                return poeVar;
            case 1:
                m8b m8bVar = (m8b) this.f;
                ch3.d0(obj);
                int i2 = m8bVar.d;
                cyb cybVar = (cyb) this.g;
                if (i2 == 0) {
                    cybVar.setVisibility(8);
                } else {
                    cybVar.setVisibility(0);
                    cybVar.setCount(new Integer(i2));
                }
                AddChatMembersScreen addChatMembersScreen2 = (AddChatMembersScreen) this.h;
                zv8[] zv8VarArr2 = AddChatMembersScreen.r;
                za zaVar = (za) addChatMembersScreen2.x1().d;
                int i3 = m8bVar.d;
                rt2 rt2Var = (rt2) ((xn3) zaVar.b.getValue()).k(zaVar.a).a.getValue();
                if (rt2Var != null) {
                    if (rt2Var.e0()) {
                        int iMin = Math.min(((g5d) zaVar.f()).d(), ((g5d) zaVar.f()).i() - rt2Var.b.b());
                        if (i3 > iMin) {
                            rnhVar = iMin == ((g5d) zaVar.f()).d() ? new rnh(R.plurals.picker_chats_chat_limit_add_participant_error, ((g5d) zaVar.f()).d(), a.n1(new Object[]{Integer.valueOf(((g5d) zaVar.f()).d())})) : new rnh(R.plurals.picker_chats_chat_participant_count_limit_error, ((g5d) zaVar.f()).i(), a.n1(new Object[]{Integer.valueOf(((g5d) zaVar.f()).i())}));
                        }
                    } else if (rt2Var.d0() && i3 > ((g5d) zaVar.f()).d()) {
                        rnhVar = new rnh(R.plurals.picker_chats_channel_limit_add_subscribers_error, ((g5d) zaVar.f()).d(), a.n1(new Object[]{Integer.valueOf(((g5d) zaVar.f()).d())}));
                    }
                    if (rnhVar != null) {
                        addChatMembersScreen = (AddChatMembersScreen) this.h;
                        g8cVar = addChatMembersScreen.q;
                        if (g8cVar != null) {
                            g8cVar.a();
                        }
                        h8c h8cVar = new h8c(addChatMembersScreen);
                        h8cVar.m(rnhVar);
                        h8cVar.h(new w8c(R.drawable.icon_warning_fill));
                        view = addChatMembersScreen.getView();
                        if (view != null || (numG = n7j.g(view)) == null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = numG.intValue();
                        }
                        j8e j8eVar = addChatMembersScreen.p;
                        zv8VarArr = AddChatMembersScreen.r;
                        int measuredHeight = ((cyb) j8eVar.m(addChatMembersScreen, zv8VarArr[3])).getMeasuredHeight();
                        if (iIntValue == 0) {
                            ViewGroup.LayoutParams layoutParams = ((cyb) addChatMembersScreen.p.m(addChatMembersScreen, zv8VarArr[3])).getLayoutParams();
                            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            if (marginLayoutParams != null) {
                                i = marginLayoutParams.bottomMargin;
                            } else {
                                i = 0;
                            }
                        } else {
                            i = 0;
                        }
                        h8cVar.c(new o8c(0, 0, measuredHeight + i, 11));
                        addChatMembersScreen.q = h8cVar.p();
                    }
                    return sbi.a;
                }
                String name = za.class.getName();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, name, "checkSelectionCount: chat is null", null);
                    }
                }
                rnhVar = null;
                if (rnhVar != null) {
                    addChatMembersScreen = (AddChatMembersScreen) this.h;
                    g8cVar = addChatMembersScreen.q;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    h8c h8cVar2 = new h8c(addChatMembersScreen);
                    h8cVar2.m(rnhVar);
                    h8cVar2.h(new w8c(R.drawable.icon_warning_fill));
                    view = addChatMembersScreen.getView();
                    if (view != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    j8e j8eVar2 = addChatMembersScreen.p;
                    zv8VarArr = AddChatMembersScreen.r;
                    int measuredHeight2 = ((cyb) j8eVar2.m(addChatMembersScreen, zv8VarArr[3])).getMeasuredHeight();
                    if (iIntValue == 0) {
                        ViewGroup.LayoutParams layoutParams2 = ((cyb) addChatMembersScreen.p.m(addChatMembersScreen, zv8VarArr[3])).getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        }
                        if (marginLayoutParams != null) {
                            i = marginLayoutParams.bottomMargin;
                        } else {
                            i = 0;
                        }
                    } else {
                        i = 0;
                    }
                    h8cVar2.c(new o8c(0, 0, measuredHeight2 + i, 11));
                    addChatMembersScreen.q = h8cVar2.p();
                }
                return sbi.a;
            case 2:
                cd cdVar = (cd) this.f;
                ch3.d0(obj);
                w82 w82Var = (w82) ((ny8) this.g).getValue();
                long j = cdVar.c;
                Map map = cdVar.a;
                w82Var.f(j);
                dd ddVar = (dd) this.h;
                mjg mjgVar = ddVar.e;
                do {
                    value = mjgVar.getValue();
                    bd bdVar = (bd) value;
                    tnhVar = map.isEmpty() ? new tnh(R.string.call_users_in_wait_room_count_no_users) : new pnh(R.plurals.call_users_in_wait_room_count, map.size());
                    ddVar.c.getClass();
                    arrayListA = xc.a(map);
                    bdVar.getClass();
                } while (!mjgVar.h(value, new bd(tnhVar, arrayListA)));
                return sbi.a;
            case 3:
                ch3.d0(obj);
                int iA = ((lp3) ((t90) this.f).e.getValue()).a();
                StringBuilder sbQ = qv1.q("MediaItem(", (String) this.g, "): ", (String) this.h, ". SpaceState: ");
                if (iA == 1) {
                    str = "NORMAL";
                } else if (iA != 2) {
                    str = iA != 3 ? "null" : "CRITICAL";
                } else {
                    str = "DANGEROUS";
                }
                sbQ.append(str);
                String string = sbQ.toString();
                IssueKeyException issueKeyException = new IssueKeyException(4, "68928", string, null);
                String str2 = ((t90) this.f).f;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, str2, string, issueKeyException);
                    }
                }
                return sbi.a;
            case 4:
                ch3.d0(obj);
                cm0 cm0Var = (cm0) this.f;
                if (((pk5) cm0Var.b.getValue()).a()) {
                    return null;
                }
                Context context = (Context) this.g;
                sri sriVar = (sri) this.h;
                try {
                    InputStream inputStreamOpen = context.getAssets().open(sriVar.a);
                    byte[] bArr = new byte[inputStreamOpen.available()];
                    inputStreamOpen.read(bArr);
                    inputStreamOpen.close();
                    return cm0.a(cm0Var, bArr, sriVar);
                } catch (IOException e) {
                    gm0.n("BackgroundDataLoader", "load assets failed: " + e);
                    return null;
                }
            case 5:
                vg4 vg4Var = (vg4) this.f;
                ch3.d0(obj);
                z01 z01Var = (z01) this.g;
                zv8[] zv8VarArr3 = z01.x;
                Long L = z01Var.L(vg4Var);
                return L != null ? new x01(((mic) ((ny8) this.h).getValue()).b(L.longValue()), vg4Var, 0) : new tz(7, new ylc(vg4Var, null));
            case 6:
                gu4 gu4Var2 = (gu4) this.f;
                ch3.d0(obj);
                CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) this.g;
                zv8[] zv8VarArr4 = CallBottomPanelWidget.l;
                e9i.j0(new fz6(callBottomPanelWidget.p1().n, new w8(2, (qc1) this.h, qc1.class, "setVolumeMicrophone", "setVolumeMicrophone(F)V", 4, 2), 3), gu4Var2);
                return sbi.a;
            case 7:
                Object obj2 = this.f;
                ch3.d0(obj);
                List list = (List) obj2;
                int visibility = ((View) ((View) this.g).getParent()).getVisibility();
                CallEventsWidget callEventsWidget = (CallEventsWidget) this.h;
                ny8 ny8Var = callEventsWidget.h;
                j8e j8eVar3 = callEventsWidget.i;
                if (visibility == 0) {
                    zv8[] zv8VarArr5 = CallEventsWidget.j;
                    zv8[] zv8VarArr6 = CallEventsWidget.j;
                    if (!cqk.d(((RecyclerView) j8eVar3.m(callEventsWidget, zv8VarArr6[0])).getItemAnimator(), (ei1) ny8Var.getValue())) {
                        ((RecyclerView) j8eVar3.m(callEventsWidget, zv8VarArr6[0])).setItemAnimator((ei1) ny8Var.getValue());
                    }
                    xva xvaVar = callEventsWidget.g;
                    int size = list.size();
                    RecyclerView recyclerView = (RecyclerView) xvaVar.b;
                    if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && adapter.l() > size) {
                        int height = recyclerView.getHeight();
                        RecyclerView recyclerView2 = (RecyclerView) xvaVar.b;
                        if (recyclerView2 != null) {
                            ViewGroup.LayoutParams layoutParams3 = recyclerView2.getLayoutParams();
                            if (layoutParams3 == null) {
                                p51.d();
                                return null;
                            }
                            layoutParams3.height = height;
                            recyclerView2.setLayoutParams(layoutParams3);
                        }
                    }
                } else {
                    zv8[] zv8VarArr7 = CallEventsWidget.j;
                    ((RecyclerView) j8eVar3.m(callEventsWidget, CallEventsWidget.j[0])).setItemAnimator(null);
                }
                callEventsWidget.d.H(list);
                return sbi.a;
            case 8:
                Object obj3 = this.f;
                ch3.d0(obj);
                List<aw1> list2 = (List) obj3;
                ViewGroup viewGroup = (ViewGroup) ((View) this.g);
                CallRateBottomSheet callRateBottomSheet = (CallRateBottomSheet) this.h;
                TransitionManager.beginDelayedTransition(viewGroup, callRateBottomSheet.y);
                CallRateBottomSheet.F1(callRateBottomSheet).removeAllViews();
                CallRateBottomSheet.F1(callRateBottomSheet).setVisibility(!list2.isEmpty() ? 0 : 8);
                for (aw1 aw1Var : list2) {
                    x4e x4eVarF1 = CallRateBottomSheet.F1(callRateBottomSheet);
                    int i4 = aw1Var.a;
                    String strValueOf = String.valueOf(aw1Var.b.b(callRateBottomSheet.getContext()));
                    x4eVarF1.getClass();
                    r4e r4eVar = new r4e(x4eVarF1.getContext());
                    r4eVar.setId(Integer.hashCode(i4));
                    r4eVar.setText(strValueOf);
                    r4eVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    r4eVar.setTextAlignment(4);
                    p90.Q(r4eVar, r4eVar.getPaint(), q9i.g);
                    r4eVar.setChecked(false);
                    x4e.a(r4eVar, pq3.j.h(r4eVar));
                    x4eVarF1.b(r4eVar, r4eVar.b, i4);
                    r4eVar.setOnClickListener(new sk6(r4eVar, x4eVarF1, i4, 2));
                    x4eVarF1.addView(r4eVar);
                }
                return sbi.a;
            case 9:
                fu1 fu1Var = (fu1) this.f;
                ch3.d0(obj);
                w82 w82Var2 = (w82) this.g;
                if (!((dz4) ((x02) w82Var2.m.getValue()).z().getValue()).i) {
                    w82Var2.h(w82Var2.b().a.getId());
                } else if (((Boolean) ((e5d) ((ny8) this.h).getValue()).I0.a(e5d.S6[85]).i()).booleanValue()) {
                    if (fu1Var != null) {
                        w82Var2.g(fu1Var, true);
                    } else if (((k52) w82Var2.i().getValue()).b == 3) {
                        w82Var2.g(null, true);
                    }
                } else if (fu1Var != null) {
                    w82Var2.g(fu1Var, true);
                }
                return sbi.a;
            case 10:
                lq2 lq2Var = (lq2) this.f;
                ch3.d0(obj);
                lv2 lv2Var = (lv2) this.g;
                mjg mjgVar2 = lv2Var.c;
                jq2 jq2Var = (jq2) mjgVar2.getValue();
                if (jq2Var != null) {
                    lq2 lq2Var2 = (lq2) lv2Var.h.getValue();
                    boolean z2 = lq2Var2 != null && lq2Var2.b(lq2Var);
                    kq2 kq2Var = lq2Var != null ? lq2Var.b : null;
                    int i5 = kq2Var == null ? -1 : yu2.$EnumSwitchMapping$0[kq2Var.ordinal()];
                    if (i5 == -1) {
                        z = false;
                    } else {
                        if (i5 != 1 && i5 != 2) {
                            ore.o();
                            return null;
                        }
                        z = true;
                    }
                    boolean z3 = lv2Var.G.get();
                    jq2 jq2Var2 = (jq2) mjgVar2.getValue();
                    String str3 = (jq2Var2 == null || (iq2Var = jq2Var2.e) == null) ? null : iq2Var.a;
                    if (((Boolean) ((e5d) lv2Var.v.getValue()).n6.a(e5d.S6[379]).i()).booleanValue() && lv2Var.j == mnd.CREATE && lv2Var.A()) {
                        iq2Var2 = new iq2(str3);
                    }
                    jq2VarA = jq2.a(jq2Var, z2, z, z3, iq2Var2, 1);
                }
                mjgVar2.setValue(jq2VarA);
                lv2Var.d.setValue(((dq2) ((ny8) this.h).getValue()).a(lv2Var));
                return sbi.a;
            case 11:
                rt2 rt2Var2 = (rt2) this.h;
                ch3.d0(obj);
                lv2 lv2Var2 = (lv2) this.f;
                ny8 ny8Var2 = lv2Var2.p;
                AtomicLong atomicLong = lv2Var2.C;
                lq2 lq2Var3 = (lq2) this.g;
                int iOrdinal = lq2Var3.b.ordinal();
                if (iOrdinal == 0) {
                    jG = ((pvb) ny8Var2.getValue()).g(rt2Var2.a, rt2Var2.A(), 1, lq2Var3.c, false, null);
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    jG = ((pvb) ny8Var2.getValue()).g(rt2Var2.a, rt2Var2.A(), 2, null, false, null);
                }
                atomicLong.set(jG);
                lv2Var2.G.set(true);
                return sbi.a;
            case 12:
                ch3.d0(obj);
                long c = ((fda) this.f).getC();
                x43 x43Var = (x43) this.g;
                wz9 wz9Var = (wz9) x43Var.g.p(x43Var.c).a.getValue();
                x43 x43Var2 = (x43) this.g;
                x43Var2.A.updateAndGet(new l43(x43Var2, wz9Var, (fda) this.f, 0));
                String str4 = ((x43) this.g).k;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar4.b(je9Var3)) {
                        a4cVar4.c(je9Var3, str4, "ChatMedia. Create loader with initialTime:" + c + ", saved markers:" + wz9Var, null);
                    }
                }
                x43 x43Var3 = (x43) this.g;
                o13 o13Var = (o13) ((ny8) this.h).getValue();
                x43 x43Var4 = (x43) this.g;
                long j2 = x43Var4.c;
                mg5 mg5Var = x43Var4.d;
                long j3 = ((fda) this.f).a.a;
                Set set = (Set) x43Var4.Z.getValue();
                x43 x43Var5 = (x43) this.g;
                p20 p20VarA = o13.a(o13Var, j2, mg5Var, j3, c, set, (x43) this.g, x43Var5.b, "MediaLoader#" + x43Var5.e, x43.r1, np0.m);
                x43 x43Var6 = (x43) this.g;
                e9i.j0(e9i.T(new fz6(p20VarA.L, new k23(x43Var6, null, 3), 3), ((n0c) x43Var6.H()).a()), x43Var6.b);
                e9i.j0(e9i.T(new fz6(new ie(new jz(x43Var6.g.p(x43Var6.c), 13), x43Var6, 16), new w43(x43Var6, null), 3), ((n0c) x43Var6.H()).a()), x43Var6.b);
                p20VarA.m(c);
                x43Var3.X = p20VarA;
                return sbi.a;
            case 13:
                Object obj4 = this.f;
                ch3.d0(obj);
                List<rp4> list3 = (List) obj4;
                LinearLayout linearLayout = (LinearLayout) this.g;
                linearLayout.removeAllViews();
                for (rp4 rp4Var : list3) {
                    ChatPreviewBottomWidget chatPreviewBottomWidget = (ChatPreviewBottomWidget) this.h;
                    zv8[] zv8VarArr8 = ChatPreviewBottomWidget.b;
                    kbc kbcVarM = pq3.j.e(chatPreviewBottomWidget.getContext()).m();
                    ImageView imageView = new ImageView(chatPreviewBottomWidget.getContext());
                    imageView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                    x05.j(6.0f, yl5.d().getDisplayMetrics().density, imageView);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setClickable(true);
                    imageView.setFocusable(true);
                    imageView.setBackground(col.c(((bs0) kbcVarM.u().c.g).c, null, null, 6));
                    Integer num = rp4Var.d;
                    if (num != null) {
                        imageView.setImageResource(num.intValue());
                    }
                    Integer num2 = rp4Var.e;
                    if (num2 != null) {
                        imageView.setImageTintList(ColorStateList.valueOf(oc9.Z(num2.intValue(), kbcVarM)));
                    }
                    qe7.H(imageView, 300L, new ee(chatPreviewBottomWidget, 16, rp4Var));
                    n1g.N(new d3(rp4Var, null, 8), imageView);
                    linearLayout.addView(imageView);
                }
                linearLayout.setVisibility(!list3.isEmpty() ? 0 : 8);
                return sbi.a;
            case 14:
                ga3 ga3Var = (ga3) this.g;
                rt2 rt2Var3 = (rt2) this.f;
                ch3.d0(obj);
                if (!rt2Var3.d0()) {
                    return new tz(7, new ylc(rt2Var3, null));
                }
                zv8[] zv8VarArr9 = ga3.A;
                if (rt2Var3.d0() && (lK = ga3Var.K(rt2Var3)) != null) {
                    ga3Var.z.B(ga3Var, ga3.A[0], mll.a(ga3Var.i, lK.longValue(), (xhh) ga3Var.l.getValue(), (cic) ga3Var.s.getValue(), rt2Var3.getClass().getName()));
                }
                Long lK2 = ga3Var.K(rt2Var3);
                return lK2 != null ? new ie(((mic) ((ny8) this.h).getValue()).b(lK2.longValue()), rt2Var3, 21) : new tz(7, new ylc(rt2Var3, null));
            case 15:
                e21 e21Var = (e21) this.f;
                ch3.d0(obj);
                ChatScreen chatScreen = (ChatScreen) this.g;
                ny8 ny8Var3 = chatScreen.I1;
                wfe wfeVar = (wfe) this.h;
                e21 e21Var2 = (e21) wfeVar.a;
                ou7 ou7Var = ChatScreen.L1;
                e21 e21Var3 = e21.g;
                if (e21Var2 != e21Var3 || e21Var == e21Var3) {
                    tgd tgdVar = (tgd) ny8Var3.getValue();
                    if (tgdVar != null && (valueAnimator = tgdVar.a) != null && valueAnimator.isRunning() && (valueAnimator2 = tgdVar.a) != null) {
                        valueAnimator2.cancel();
                    }
                    chatScreen.r2(e21Var);
                } else {
                    tgd tgdVar2 = (tgd) ny8Var3.getValue();
                    if (tgdVar2 != null) {
                        tp2 tp2VarJ1 = chatScreen.J1();
                        za2 za2Var = new za2(chatScreen, 15, e21Var);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(300L);
                        valueAnimatorOfFloat.setInterpolator(tgd.c);
                        sfe sfeVar = new sfe();
                        valueAnimatorOfFloat.addUpdateListener(new d72(1, sfeVar, tp2VarJ1, za2Var));
                        valueAnimatorOfFloat.addListener(new mk1(sfeVar, za2Var, tp2VarJ1, tgdVar2, 1));
                        valueAnimatorOfFloat.start();
                        tgdVar2.a = valueAnimatorOfFloat;
                    }
                }
                oqa oqaVarW1 = chatScreen.W1();
                boolean zD = cqk.d(e21Var.name(), "SEARCH");
                mjg mjgVar3 = oqaVarW1.c;
                do {
                    value2 = mjgVar3.getValue();
                    ((Boolean) value2).getClass();
                } while (!mjgVar3.h(value2, Boolean.valueOf(zD)));
                wfeVar.a = e21Var;
                return sbi.a;
            case 16:
                je9 je9Var4 = je9.d;
                Object obj5 = this.f;
                ch3.d0(obj);
                String str5 = (String) this.g;
                if (str5 != null && (a4cVar = gm0.f) != null) {
                    je9 je9Var5 = je9.c;
                    if (a4cVar.b(je9Var5)) {
                        a4cVar.c(je9Var5, str5, c0a.n(obj5, "Collected event -> "), null);
                    }
                }
                nqa nqaVar = (nqa) obj5;
                if (nqaVar instanceof mqa) {
                    ChatScreen chatScreen2 = (ChatScreen) this.h;
                    ou7 ou7Var2 = ChatScreen.L1;
                    xd3 xd3VarK2 = chatScreen2.k2();
                    boolean zB = ((gbj) xd3VarK2.Y.getValue()).b(xd3VarK2.G1);
                    ChatScreen chatScreen3 = (ChatScreen) this.h;
                    if (zB) {
                        gm0.n(ChatScreen.class.getName(), "UpEvent.SetRepliedMessage: vpn connected, skip reply and show notification");
                        xd3 xd3VarK3 = ((ChatScreen) this.h).k2();
                        if (((gbj) xd3VarK3.Y.getValue()).b(xd3VarK3.G1)) {
                            a8j.x(xd3VarK3.L1, new nc3(true, true));
                        }
                    } else {
                        Long lJ = chatScreen3.U1().J();
                        mqa mqaVar = (mqa) nqaVar;
                        long j4 = mqaVar.a;
                        if (lJ != null && lJ.longValue() == j4) {
                            String name2 = ChatScreen.class.getName();
                            a4c a4cVar5 = gm0.f;
                            if (a4cVar5 != null && a4cVar5.b(je9Var4)) {
                                a4cVar5.c(je9Var4, name2, iic.m(lJ, "UpEvent.SetRepliedMessage: same repliedMessageId=", ", request focus only"), null);
                            }
                            MessageWriteWidget messageWriteWidgetV1 = ((ChatScreen) this.h).V1();
                            if (messageWriteWidgetV1 != null && (view2 = messageWriteWidgetV1.getView()) != null) {
                                view2.requestFocus();
                            }
                        }
                        String name3 = ChatScreen.class.getName();
                        a4c a4cVar6 = gm0.f;
                        if (a4cVar6 != null && a4cVar6.b(je9Var4)) {
                            a4cVar6.c(je9Var4, name3, "UpEvent.SetRepliedMessage, repliedMessageId: " + lJ + ", event.messageId: " + mqaVar.a, null);
                        }
                        ((ChatScreen) this.h).U1().Q(new Long(mqaVar.a));
                    }
                } else if (nqaVar instanceof lqa) {
                    ChatScreen chatScreen4 = (ChatScreen) this.h;
                    ou7 ou7Var3 = ChatScreen.L1;
                    nma nmaVarU1 = chatScreen4.U1();
                    Long l = new Long(((lqa) nqaVar).a);
                    MessageWriteWidget messageWriteWidgetV2 = ((ChatScreen) this.h).V1();
                    CharSequence text = messageWriteWidgetV2 != null ? messageWriteWidgetV2.t1().getText() : null;
                    MessageWriteWidget messageWriteWidgetV3 = ((ChatScreen) this.h).V1();
                    nma.P(nmaVarU1, l, text, messageWriteWidgetV3 != null ? new Integer(messageWriteWidgetV3.t1().getCursorPosition()) : null, false, 8);
                } else if (nqaVar instanceof jqa) {
                    ChatScreen chatScreen5 = (ChatScreen) this.h;
                    ou7 ou7Var4 = ChatScreen.L1;
                    if (chatScreen5.c2().getState() == q7c.c || chatScreen5.c2().getState() == q7c.d) {
                        chatScreen5.c2().b();
                    }
                } else {
                    if (!(nqaVar instanceof kqa)) {
                        ore.o();
                        return null;
                    }
                    ChatScreen chatScreen6 = (ChatScreen) this.h;
                    ou7 ou7Var5 = ChatScreen.L1;
                    xd3 xd3VarK4 = chatScreen6.k2();
                    kqa kqaVar = (kqa) nqaVar;
                    String str6 = kqaVar.a;
                    g4b g4bVar = kqaVar.b;
                    Long lJ2 = ((ChatScreen) this.h).U1().J();
                    hla hlaVarG = ((ChatScreen) this.h).U1().G();
                    rt2 rt2Var4 = (rt2) xd3VarK4.G1.a.getValue();
                    if (rt2Var4 == null) {
                        xd3VarK4.I().B(f4b.EMPTY_CHAT, g4bVar);
                    } else {
                        xd3VarK4.y1.B(xd3VarK4, xd3.X1[6], yab.h0(xd3VarK4.b, ((n0c) xd3VarK4.H()).b(), 2, new gv7(str6, rt2Var4, xd3VarK4, hlaVarG, g4bVar, lJ2, null, 2)));
                    }
                }
                return sbi.a;
            case 17:
                Object obj6 = this.f;
                ch3.d0(obj);
                ((Boolean) obj6).getClass();
                ChatScreen chatScreen7 = (ChatScreen) this.g;
                ou7 ou7Var6 = ChatScreen.L1;
                vt3 vt3Var = chatScreen7.y;
                if (vt3Var != null) {
                    chatScreen7.getRouter().M(vt3Var);
                    chatScreen7.y = null;
                }
                tgd tgdVar3 = (tgd) chatScreen7.I1.getValue();
                if (tgdVar3 != null) {
                    final View view3 = (View) this.h;
                    final rcc rccVarG2 = chatScreen7.g2();
                    final tp2 tp2VarJ2 = chatScreen7.J1();
                    final xa3 xa3Var = new xa3(chatScreen7, 1);
                    xa3 xa3Var2 = new xa3(chatScreen7, 2);
                    ViewParent parent = view3.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null && view3.getWidth() > 0 && view3.getHeight() > 0) {
                        ViewParent parent2 = rccVarG2.getParent();
                        final ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                        if (viewGroup3 != null) {
                            final float translationX = view3.getTranslationX();
                            final float translationY = view3.getTranslationY();
                            final int width = view3.getWidth();
                            final int height2 = view3.getHeight();
                            final int width2 = viewGroup2.getWidth();
                            final int height3 = viewGroup2.getHeight();
                            Integer numL = n7j.l(viewGroup3);
                            int iIntValue2 = numL != null ? numL.intValue() : 0;
                            Integer numH = n7j.h(tp2VarJ2);
                            int iIntValue3 = numH != null ? numH.intValue() : 0;
                            view3.setClipToOutline(false);
                            view3.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat2.setDuration(500L);
                            valueAnimatorOfFloat2.setInterpolator(tgd.c);
                            final sfe sfeVar2 = new sfe();
                            final int i6 = iIntValue2;
                            final int i7 = iIntValue3;
                            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rgd
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator3) throws IllegalAccessException, InvocationTargetException {
                                    float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                    float fB = esk.b(translationX, 0.0f, fFloatValue);
                                    View view4 = view3;
                                    view4.setTranslationX(fB);
                                    view4.setTranslationY(esk.b(translationY, 0.0f, fFloatValue));
                                    ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                                    if (layoutParams4 == null) {
                                        p51.d();
                                        return;
                                    }
                                    layoutParams4.width = (int) esk.b(width, width2, fFloatValue);
                                    layoutParams4.height = (int) esk.b(height2, height3, fFloatValue);
                                    view4.setLayoutParams(layoutParams4);
                                    int iB = (int) esk.b(0.0f, i6, fFloatValue);
                                    ViewGroup viewGroup4 = viewGroup3;
                                    viewGroup4.setPadding(viewGroup4.getPaddingLeft(), iB, viewGroup4.getPaddingRight(), viewGroup4.getPaddingBottom());
                                    int iB2 = (int) esk.b(0.0f, i7, fFloatValue);
                                    tp2 tp2Var = tp2VarJ2;
                                    tp2Var.setPadding(tp2Var.getPaddingLeft(), tp2Var.getPaddingTop(), tp2Var.getPaddingRight(), iB2);
                                    rccVarG2.setAlpha(fFloatValue <= 0.5f ? 1.0f - (2.0f * fFloatValue) : (fFloatValue - 0.5f) * 2.0f);
                                    sfe sfeVar3 = sfeVar2;
                                    if (sfeVar3.a || fFloatValue < 0.5f) {
                                        return;
                                    }
                                    xa3Var.invoke();
                                    sfeVar3.a = true;
                                }
                            });
                            valueAnimatorOfFloat2.addListener(new sgd(view3, viewGroup3, iIntValue2, tp2VarJ2, iIntValue3, rccVarG2, xa3Var2, tgdVar3));
                            valueAnimatorOfFloat2.start();
                            tgdVar3.b = valueAnimatorOfFloat2;
                        }
                    }
                }
                return sbi.a;
            case 18:
                ch3.d0(obj);
                wf3 wf3Var = (wf3) this.f;
                zv8[] zv8VarArr10 = wf3.A;
                String absolutePath = wf3Var.D().t(((wf3) this.f).x).getAbsolutePath();
                wf3 wf3Var2 = (wf3) this.f;
                a8j.t(wf3Var2, null, new f00(21, null, wf3Var2, absolutePath, (Rect) this.h, (RectF) this.g), 3);
                return sbi.a;
            case 19:
                sbi sbiVar = sbi.a;
                yfj yfjVar = (yfj) this.g;
                h50 h50Var = (h50) this.f;
                ch3.d0(obj);
                if (h50Var != null && (strA = h50Var.a()) != null) {
                    yv3 yv3Var = (yv3) yfjVar.d;
                    if (yv3Var != null) {
                        ArrayList arrayList2 = yv3Var.b;
                        arrayList = new ArrayList(yw3.W0(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((yu3) it.next()).k());
                        }
                    }
                    if (arrayList != null && arrayList.contains(strA)) {
                        yfjVar.g(strA, h50Var, (ViewGroup) this.h);
                    }
                }
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return l(obj);
            case 21:
                return n(obj);
            case 22:
                return o(obj);
            case 23:
                return p(obj);
            case 24:
                m8b m8bVar2 = (m8b) this.f;
                ch3.d0(obj);
                int i8 = m8bVar2.d;
                cyb cybVar2 = (cyb) this.g;
                ContactsPickerScreen contactsPickerScreen = (ContactsPickerScreen) this.h;
                if (i8 == 0) {
                    cybVar2.setVisibility(8);
                    cybVar2.setCount(null);
                } else {
                    cybVar2.setVisibility(0);
                    cybVar2.setText(np4.q(contactsPickerScreen.getContext(), R.string.contacts_picker_send_btn_title));
                    cybVar2.setCount(new Integer(i8));
                }
                return sbi.a;
            case 25:
                return q(obj);
            case 26:
                return r(obj);
            case 27:
                return s(obj);
            case 28:
                return t(obj);
            default:
                ch3.d0(obj);
                h8c h8cVar3 = (h8c) ((f37) this.f).j.getValue();
                h8cVar3.m((ynh) this.g);
                h8cVar3.a((ynh) this.h);
                return h8cVar3.p();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fze(Object obj, lq4 lq4Var, Widget widget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = widget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fze(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fze(lq4 lq4Var, Object obj, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
