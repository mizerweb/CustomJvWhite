package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes.dex */
public final class sk8 implements TextWatcher {
    public final vtc a;
    public boolean c;
    public xw d;
    public String e;
    public int f;
    public int g;
    public final boolean h;
    public boolean b = false;
    public int i = 0;
    public int j = 0;

    public sk8(vtc vtcVar, String str, int i, int i2) {
        if (str == null || str.length() == 0) {
            ore.a();
            throw null;
        }
        this.a = vtcVar;
        b(i, str);
        this.h = true;
        this.g = i2;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0157 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x0158 A[RETURN] */
    public final String a(Editable editable) {
        CharSequence charSequence;
        String string;
        this.d.f();
        String str = "+" + this.f;
        int i = 0;
        boolean z = this.h;
        if (z || (editable.length() > 0 && editable.charAt(0) != '0')) {
            charSequence = editable;
            charSequence = editable;
            charSequence = str + ((Object) editable);
        }
        charSequence = editable;
        charSequence = editable;
        charSequence = editable;
        int length = charSequence.length();
        char c = 0;
        String strH = "";
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (PhoneNumberUtils.isNonSeparator(cCharAt)) {
                if (c != 0) {
                    strH = this.d.h(c);
                }
                c = cCharAt;
            }
        }
        if (c != 0) {
            strH = this.d.h(c);
        }
        String strTrim = strH.trim();
        if (z || charSequence.length() == 0 || charSequence.charAt(0) != '0') {
            strTrim = strTrim.length() > str.length() ? strTrim.charAt(str.length()) == ' ' ? strTrim.substring(str.length() + 1) : strTrim.substring(str.length()) : "";
        }
        String strReplace = strTrim.replace('-', ' ');
        if (!this.e.equals("EG")) {
            if (this.e.equals("CN")) {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < strReplace.length(); i3++) {
                    char cCharAt2 = strReplace.charAt(i3);
                    if (PhoneNumberUtils.isNonSeparator(cCharAt2)) {
                        sb.append(cCharAt2);
                    }
                }
                if (sb.length() > 11) {
                    string = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    while (i < sb.length()) {
                        if (i == 3 || i == 7) {
                            sb2.append(' ');
                        }
                        sb2.append(sb.charAt(i));
                        i++;
                    }
                    string = sb2.toString();
                }
            }
            if (TextUtils.isEmpty(strReplace)) {
                return "";
            }
            return strReplace;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i4 = 0; i4 < strReplace.length(); i4++) {
            char cCharAt3 = strReplace.charAt(i4);
            if (PhoneNumberUtils.isNonSeparator(cCharAt3)) {
                sb3.append(cCharAt3);
            }
        }
        if (sb3.length() > 10) {
            string = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            while (i < sb3.length()) {
                if (i == 2 || i == 6) {
                    sb4.append(' ');
                }
                sb4.append(sb3.charAt(i));
                i++;
            }
            string = sb4.toString();
        }
        strReplace = string;
        if (TextUtils.isEmpty(strReplace)) {
            return "";
        }
        return strReplace;
    }

    @Override // android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        try {
            if (this.b) {
                return;
            }
            int selectionEnd = Selection.getSelectionEnd(editable);
            int i = 0;
            for (int i2 = 0; i2 < editable.length(); i2++) {
                if (PhoneNumberUtils.isNonSeparator(editable.charAt(i2))) {
                    i++;
                }
            }
            int i3 = this.g;
            if (i > i3) {
                int i4 = i - i3;
                int iMax = Math.max(this.i + this.j, 1) - 1;
                this.b = true;
                while (iMax < editable.length() && i4 > 0) {
                    if (PhoneNumberUtils.isNonSeparator(editable.charAt(iMax))) {
                        editable.delete(iMax, iMax + 1);
                        i4--;
                    } else {
                        iMax++;
                    }
                }
                this.b = false;
                return;
            }
            if (this.c) {
                this.c = editable.length() != 0;
                return;
            }
            boolean z = selectionEnd == editable.length();
            String strA = a(editable);
            if (!strA.equals(editable.toString())) {
                if (!z) {
                    int i5 = 0;
                    for (int i6 = 0; i6 < editable.length() && i6 < selectionEnd; i6++) {
                        if (PhoneNumberUtils.isNonSeparator(editable.charAt(i6))) {
                            i5++;
                        }
                    }
                    selectionEnd = 0;
                    int i7 = 0;
                    while (true) {
                        if (selectionEnd >= strA.length()) {
                            selectionEnd = 0;
                            break;
                        } else {
                            if (i7 == i5) {
                                break;
                            }
                            if (PhoneNumberUtils.isNonSeparator(strA.charAt(selectionEnd))) {
                                i7++;
                            }
                            selectionEnd++;
                        }
                    }
                } else {
                    selectionEnd = strA.length();
                }
            }
            if (z) {
                break;
            }
            while (true) {
                int i8 = selectionEnd - 1;
                if (i8 <= 0 || PhoneNumberUtils.isNonSeparator(strA.charAt(i8))) {
                    break;
                    break;
                }
                selectionEnd--;
            }
            try {
                this.b = true;
                editable.replace(0, editable.length(), strA, 0, strA.length());
                this.b = false;
                Selection.setSelection(editable, selectionEnd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(int i, String str) {
        this.e = str;
        this.f = i;
        vtc vtcVar = this.a;
        vtcVar.getClass();
        xw xwVar = new xw(vtcVar, str);
        this.d = xwVar;
        xwVar.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b || this.c || i2 != 1) {
            return;
        }
        for (int i4 = i; i4 < i + i2; i4++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                this.c = true;
                this.d.f();
                return;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.i = i;
        this.j = i3;
        if (this.b || this.c || i3 != 1) {
            return;
        }
        for (int i4 = i; i4 < i + i3; i4++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                this.c = true;
                this.d.f();
                return;
            }
        }
    }
}
