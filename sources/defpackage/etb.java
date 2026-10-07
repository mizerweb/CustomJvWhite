package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class etb extends ux8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ltb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ etb(ltb ltbVar, int i) {
        super(1);
        this.a = i;
        this.b = ltbVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        dtb dtbVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object obj2 = null;
        ltb ltbVar = this.b;
        switch (i) {
            case 0:
                zv zvVar = ltbVar.b;
                ListIterator listIterator = zvVar.listIterator(zvVar.getSize());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((dtb) objPrevious).a) {
                        obj2 = objPrevious;
                        dtbVar = (dtb) obj2;
                        if (ltbVar.c != null) {
                            ltbVar.c();
                        }
                        ltbVar.c = dtbVar;
                        if (dtbVar != null) {
                            dtbVar.d();
                        }
                        break;
                    }
                }
                dtbVar = (dtb) obj2;
                if (ltbVar.c != null) {
                    ltbVar.c();
                }
                ltbVar.c = dtbVar;
                if (dtbVar != null) {
                    dtbVar.d();
                }
                break;
            default:
                sl0 sl0Var = (sl0) obj;
                dtb dtbVar2 = ltbVar.c;
                if (dtbVar2 == null) {
                    zv zvVar2 = ltbVar.b;
                    ListIterator listIterator2 = zvVar2.listIterator(zvVar2.getSize());
                    while (listIterator2.hasPrevious()) {
                        Object objPrevious2 = listIterator2.previous();
                        if (((dtb) objPrevious2).a) {
                            obj2 = objPrevious2;
                            dtbVar2 = (dtb) obj2;
                        }
                    }
                    dtbVar2 = (dtb) obj2;
                }
                if (dtbVar2 != null) {
                    dtbVar2.c(sl0Var);
                }
                break;
        }
        return sbiVar;
    }
}
