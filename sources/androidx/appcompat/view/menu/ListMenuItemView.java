package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.cca;
import defpackage.l3e;
import defpackage.np0;
import defpackage.qca;
import defpackage.vbf;
import defpackage.yba;

/* JADX INFO: loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements qca, AbsListView.SelectionBoundsAdjuster {
    public cca a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView g;
    public ImageView h;
    public LinearLayout i;
    public final Drawable j;
    public final int k;
    public final Context l;
    public boolean m;
    public final Drawable n;
    public final boolean o;
    public LayoutInflater p;
    public boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        vbf vbfVarK = vbf.k(getContext(), attributeSet, l3e.r, i);
        this.j = vbfVarK.d(5);
        TypedArray typedArray = (TypedArray) vbfVarK.b;
        this.k = typedArray.getResourceId(1, -1);
        this.m = typedArray.getBoolean(7, false);
        this.l = context;
        this.n = vbfVarK.d(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, ru.oneme.app.R.attr.dropDownListViewStyle, 0);
        this.o = typedArrayObtainStyledAttributes.hasValue(0);
        vbfVarK.l();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.p == null) {
            this.p = LayoutInflater.from(getContext());
        }
        return this.p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // defpackage.qca
    public final void a(cca ccaVar) {
        boolean z;
        int i;
        String string;
        this.a = ccaVar;
        boolean zIsVisible = ccaVar.isVisible();
        yba ybaVar = ccaVar.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(ccaVar.e);
        setCheckable(ccaVar.isCheckable());
        if (ybaVar.p()) {
            if ((ybaVar.o() ? ccaVar.j : ccaVar.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ybaVar.o();
        if (z) {
            cca ccaVar2 = this.a;
            yba ybaVar2 = ccaVar2.n;
            if (ybaVar2.p()) {
                i = (ybaVar2.o() ? ccaVar2.j : ccaVar2.h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.f;
            cca ccaVar3 = this.a;
            yba ybaVar3 = ccaVar3.n;
            Context context = ybaVar3.a;
            char c = ybaVar3.o() ? ccaVar3.j : ccaVar3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(ru.oneme.app.R.string.abc_prepend_shortcut_label));
                }
                int i2 = ybaVar3.o() ? ccaVar3.k : ccaVar3.i;
                cca.b(i2, 65536, resources.getString(ru.oneme.app.R.string.abc_menu_meta_shortcut_label), sb);
                cca.b(i2, np0.r, resources.getString(ru.oneme.app.R.string.abc_menu_ctrl_shortcut_label), sb);
                cca.b(i2, 2, resources.getString(ru.oneme.app.R.string.abc_menu_alt_shortcut_label), sb);
                cca.b(i2, 1, resources.getString(ru.oneme.app.R.string.abc_menu_shift_shortcut_label), sb);
                cca.b(i2, 4, resources.getString(ru.oneme.app.R.string.abc_menu_sym_shortcut_label), sb);
                cca.b(i2, 8, resources.getString(ru.oneme.app.R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(ru.oneme.app.R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(ru.oneme.app.R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(ru.oneme.app.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
        setIcon(ccaVar.getIcon());
        setEnabled(ccaVar.isEnabled());
        setSubMenuArrowVisible(ccaVar.hasSubMenu());
        setContentDescription(ccaVar.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        rect.top = this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // defpackage.qca
    public cca getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.j);
        TextView textView = (TextView) findViewById(ru.oneme.app.R.id.title);
        this.d = textView;
        int i = this.k;
        if (i != -1) {
            textView.setTextAppearance(this.l, i);
        }
        this.f = (TextView) findViewById(ru.oneme.app.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(ru.oneme.app.R.id.submenuarrow);
        this.g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.h = (ImageView) findViewById(ru.oneme.app.R.id.group_divider);
        this.i = (LinearLayout) findViewById(ru.oneme.app.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.c == null && this.e == null) {
            return;
        }
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(ru.oneme.app.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            view = this.e;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(ru.oneme.app.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
            view = this.c;
        }
        if (z) {
            compoundButton.setChecked(this.a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(ru.oneme.app.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(ru.oneme.app.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        yba ybaVar = this.a.n;
        boolean z = this.q;
        if (z || this.m) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(ru.oneme.app.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.m) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.d;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.oneme.app.R.attr.listMenuViewStyle);
    }
}
