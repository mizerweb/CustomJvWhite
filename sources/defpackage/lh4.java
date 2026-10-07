package defpackage;

import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class lh4 {
    public final ny8 a;

    public lh4(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(int i) {
        String str;
        ae9 ae9Var = (ae9) this.a.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("screen", Integer.valueOf(HttpStatus.SC_BAD_REQUEST));
        if (i == 1) {
            str = "to_contacts";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "block";
        }
        ul9Var.put("clickType", str);
        ae9.k(ae9Var, "CONTACT_OR_BLOCK", "clicked", ul9Var.b(), 8);
    }

    public final void b(int i) {
        String str;
        ae9 ae9Var = (ae9) this.a.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("screen", 350);
        ul9Var.put("UIElementType", "add_or_block_infobar");
        if (i == 1) {
            str = "to_contacts";
        } else if (i == 2) {
            str = "block";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "close";
        }
        ul9Var.put("clickType", str);
        ae9.k(ae9Var, "CONTACT_OR_BLOCK", "clicked", ul9Var.b(), 8);
    }

    public final void c() {
        ae9 ae9Var = (ae9) this.a.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("screen", 350);
        ul9Var.put("UIElementType", "add_or_block_infobar");
        ae9.k(ae9Var, "CONTACT_OR_BLOCK", "showed", ul9Var.b(), 8);
    }
}
