package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class q56 extends yab {
    public final TextView h;
    public final v46 i;
    public boolean j = true;

    public q56(TextView textView) {
        this.h = textView;
        this.i = new v46(textView);
    }

    @Override // defpackage.yab
    public final void C0(boolean z) {
        if (z) {
            TextView textView = this.h;
            textView.setTransformationMethod(L0(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.yab
    public final void D0(boolean z) {
        this.j = z;
        TextView textView = this.h;
        textView.setTransformationMethod(L0(textView.getTransformationMethod()));
        textView.setFilters(K(textView.getFilters()));
    }

    @Override // defpackage.yab
    public final InputFilter[] K(InputFilter[] inputFilterArr) {
        if (!this.j) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof v46) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            v46 v46Var = this.i;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = v46Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == v46Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.yab
    public final TransformationMethod L0(TransformationMethod transformationMethod) {
        if (this.j) {
            return ((transformationMethod instanceof u56) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new u56(transformationMethod);
        }
        return transformationMethod instanceof u56 ? ((u56) transformationMethod).a() : transformationMethod;
    }

    @Override // defpackage.yab
    public final boolean e0() {
        return this.j;
    }
}
