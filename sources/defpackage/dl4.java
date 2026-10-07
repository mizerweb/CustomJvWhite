package defpackage;

import one.me.android.root.RootController;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dl4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ContactListWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl4(ContactListWidget contactListWidget, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 4;
        this.g = contactListWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ContactListWidget contactListWidget = this.g;
        switch (i) {
            case 0:
                dl4 dl4Var = new dl4(0, lq4Var, contactListWidget);
                dl4Var.f = obj;
                return dl4Var;
            case 1:
                dl4 dl4Var2 = new dl4(1, lq4Var, contactListWidget);
                dl4Var2.f = obj;
                return dl4Var2;
            case 2:
                dl4 dl4Var3 = new dl4(2, lq4Var, contactListWidget);
                dl4Var3.f = obj;
                return dl4Var3;
            case 3:
                dl4 dl4Var4 = new dl4(3, lq4Var, contactListWidget);
                dl4Var4.f = obj;
                return dl4Var4;
            default:
                dl4 dl4Var5 = new dl4(contactListWidget, lq4Var);
                dl4Var5.f = obj;
                return dl4Var5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((dl4) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((dl4) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((dl4) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((dl4) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((dl4) create((ynh) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

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
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                ml9.b(this.g);
                if (rbbVar instanceof i65) {
                    wn4.b.e((i65) rbbVar);
                } else if (rbbVar instanceof sfc) {
                    h8c h8cVar = new h8c(this.g);
                    h8cVar.n("Ещё не реализовано");
                    h8cVar.p();
                } else if (rbbVar instanceof bhg) {
                    String strA = ((os4) this.g.k.getValue()).a();
                    ((sa2) this.g.e.getValue()).j(strA);
                    ((sa2) this.g.e.getValue()).e = 1;
                    ((sa2) this.g.e.getValue()).c = la2.a;
                    bhg bhgVar = (bhg) rbbVar;
                    ((sa2) this.g.e.getValue()).g(na2.CONTACT, bhgVar.c);
                    ContactListWidget contactListWidget = this.g;
                    long j = bhgVar.b;
                    boolean z = bhgVar.c;
                    ml9.b(contactListWidget);
                    ((xu1) contactListWidget.D.getValue()).m(null, strA, j, z, new b03(j, strA, z));
                }
                return sbi.a;
            case 1:
                ContactListWidget contactListWidget2 = this.g;
                sbi sbiVar = sbi.a;
                Object obj3 = this.f;
                ch3.d0(obj);
                int i = 6;
                boolean z2 = false;
                if (obj3 instanceof cb) {
                    zv8[] zv8VarArr = ContactListWidget.o1;
                    if (contactListWidget2.p1().c(wsc.f)) {
                        tbb.g((tbb) contactListWidget2.d.getValue(), y3f.CONTACTS_ADD);
                        wn4 wn4Var = wn4.b;
                        wn4Var.getClass();
                        o65.c(wn4Var.b(), ":contact-list/create-contact", null, null, 6);
                    } else {
                        contactListWidget2.v1();
                    }
                } else if (obj3 instanceof n6f) {
                    ((k96) contactListWidget2.C.m(contactListWidget2, ContactListWidget.o1[1])).w0(0);
                } else if (obj3 instanceof w1g) {
                    w1g w1gVar = (w1g) obj3;
                    zv8[] zv8VarArr2 = ContactListWidget.o1;
                    zv8[] zv8VarArr3 = BottomSheetWidget.t;
                    jc4 jc4VarA = mol.a(w1gVar.b, n1g.i(new ylc("selected.contactId.Action", Long.valueOf(w1gVar.a))), null, 4);
                    jc4VarA.g(w1gVar.c);
                    w1gVar.d.forEach(new o01(i, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 6)));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(contactListWidget2);
                    confirmationBottomSheetF.setTargetController(contactListWidget2);
                    br4 parentController = contactListWidget2;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else if (obj3 instanceof g2g) {
                    e9i.j0(new bye(new vk4((xx6) uw8.f, (lq4) (z2 ? 1 : 0), (Object) contactListWidget2, obj3, 1)), contactListWidget2.getViewLifecycleScope());
                    ml9.b(contactListWidget2);
                } else if (obj3 instanceof m3g) {
                    m3g m3gVar = (m3g) obj3;
                    tnh tnhVar = m3gVar.a;
                    ynh ynhVar = m3gVar.c;
                    Integer num = new Integer(m3gVar.b);
                    zv8[] zv8VarArr4 = ContactListWidget.o1;
                    contactListWidget2.w1(tnhVar, ynhVar, num);
                } else if (cqk.d(obj3, f3g.a)) {
                    ny8 ny8Var = contactListWidget2.f;
                    zv8[] zv8VarArr5 = ContactListWidget.o1;
                    ((jcd) ny8Var.getValue()).getClass();
                    tnh tnhVar2 = new tnh(R.string.portal_blocked_profile_with_reason);
                    ((jcd) ny8Var.getValue()).getClass();
                    contactListWidget2.w1(tnhVar2, null, Integer.valueOf(R.drawable.ic_block_24));
                } else if (obj3 instanceof s1g) {
                    s1g s1gVar = (s1g) obj3;
                    zv8[] zv8VarArr6 = ContactListWidget.o1;
                    CharSequence charSequenceB = s1gVar.a.b(contactListWidget2.getContext());
                    if (charSequenceB != null) {
                        h8c h8cVar2 = new h8c(contactListWidget2);
                        h8cVar2.n(charSequenceB);
                        h8cVar2.h(z8c.a);
                        h8cVar2.j(b9c.a);
                        h8cVar2.e(new ul3(s1gVar, 1));
                        h8cVar2.p();
                    }
                } else if (obj3 instanceof sv4) {
                    wn4 wn4Var2 = wn4.b;
                    wn4Var2.getClass();
                    o65.c(wn4Var2.b(), ":start-conversation/chat", null, null, 6);
                } else if (obj3 instanceof zl8) {
                    ((uj4) contactListWidget2.H.getValue()).a(contactListWidget2.getContext(), ((zl8) obj3).a);
                }
                return sbiVar;
            case 2:
                ContactListWidget contactListWidget3 = this.g;
                Object obj4 = this.f;
                ch3.d0(obj);
                h8f h8fVar = (h8f) obj4;
                if (h8fVar instanceof f8f) {
                    zv8[] zv8VarArr7 = ContactListWidget.o1;
                    f8f f8fVar = (f8f) h8fVar;
                    contactListWidget3.o1().D(f8fVar.a, f8fVar.b);
                } else {
                    if (!(h8fVar instanceof g8f)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr8 = ContactListWidget.o1;
                    contactListWidget3.o1().E();
                }
                return sbi.a;
            case 3:
                ContactListWidget contactListWidget4 = this.g;
                Object obj5 = this.f;
                ch3.d0(obj);
                xl8 xl8Var = (xl8) obj5;
                if ((xl8Var instanceof tl8) || cqk.d(xl8Var, vl8.a) || cqk.d(xl8Var, wl8.a)) {
                    gm0.Y(ContactListWidget.class.getName(), "Contact not found");
                    tol.b(contactListWidget4);
                } else if (xl8Var instanceof ul8) {
                    gm0.Y(ContactListWidget.class.getName(), "No internet");
                    ul8 ul8Var = (ul8) xl8Var;
                    contactListWidget4.w1(ul8Var.a, ul8Var.b, new Integer(R.drawable.icon_warning_fill));
                } else {
                    if (xl8Var != null) {
                        ore.o();
                        return null;
                    }
                    gm0.Y(ContactListWidget.class.getName(), "Invite By Phone Null Error");
                }
                return sbi.a;
            default:
                ynh ynhVar2 = (ynh) this.f;
                ch3.d0(obj);
                ContactListWidget contactListWidget5 = this.g;
                CharSequence charSequenceB2 = ynhVar2.b(contactListWidget5.getContext());
                String string = charSequenceB2 != null ? charSequenceB2.toString() : null;
                if (string == null) {
                    string = "";
                }
                t7c searchView = contactListWidget5.s1().getSearchView();
                if (searchView != null) {
                    searchView.setSearchHint(string);
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl4(int i, lq4 lq4Var, ContactListWidget contactListWidget) {
        super(2, lq4Var);
        this.e = i;
        this.g = contactListWidget;
    }
}
