package defpackage;

import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.stories.edit.EditStoryScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e75 implements r89, qg4, t65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e75(int i, ha9 ha9Var, Long l, t3f t3fVar) {
        this.a = 2;
        this.b = i;
        this.c = ha9Var;
        this.d = l;
        this.e = t3fVar;
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        ed7 ed7Var = (ed7) this.c;
        ((c5a) obj).n(ed7Var.b, (x4a) ed7Var.c, (t99) this.d, (uz9) this.e, this.b);
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        wf wfVar = (wf) this.c;
        k3d k3dVar = (k3d) this.d;
        k3d k3dVar2 = (k3d) this.e;
        xf xfVar = (xf) obj;
        xfVar.getClass();
        xfVar.r(wfVar, k3dVar, k3dVar2, this.b);
    }

    @Override // defpackage.t65
    public Object t() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 2:
                Long l = (Long) obj2;
                return new ContactsPickerScreen(this.b, (ha9) obj3, l != null ? l.longValue() : 0L, (t3f) obj);
            default:
                Long l2 = (Long) obj3;
                String str = (String) obj2;
                ha9 ha9Var = (ha9) obj;
                f8b f8bVar = z6a.i;
                int i2 = this.b;
                if (f8bVar.d(i2)) {
                    return new EditStoryScreen(l2, i2, str, ha9Var, null);
                }
                ore.k("Check failed.");
                return null;
        }
    }

    public /* synthetic */ e75(ed7 ed7Var, t99 t99Var, uz9 uz9Var, int i) {
        this.a = 1;
        this.c = ed7Var;
        this.d = t99Var;
        this.e = uz9Var;
        this.b = i;
    }

    public /* synthetic */ e75(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }
}
