# RecyclerViewFundamentals
Introduction to RecyclerView

## RecyclerView

It has been introduced from Android 5, in the androidx.recyclerview package. It allows to dysplay a collection of items in an arbitrary disposition (You could think it is a **_ListView_**, but it is much more flexible).

Its name comes from the way it works: When an item is hidden, instead of being destroyed and a new item being created for each newly displayed item, hidden ones are **_recycled_**.
They are reused, with new data bound on them

A **_RecyclerView_** is created by 6 main components:

**1. Adapter**
   - Providing data, it is similar to **_ListView_**.
   
**2. ItemAnimator**
   - Its job  is to play the animations when the items are modified, removed, moved or added.
   
**3. ItemDecoration**
   - It can add drawings or chanhe the layout of an item (e.g. adding dividers).
   
**4. LayoutManager**
   - It specifies how items are laid out (list, grid, etc.).
   
**5. ViewHolder**
   - The base class for item's view.
   
**6 ReciclerView**
   - Itself, blindig everything together.
   
   
