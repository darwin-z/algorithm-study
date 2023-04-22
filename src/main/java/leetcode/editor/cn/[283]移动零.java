/**
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 

 请注意 ，必须在不复制数组的情况下原地对数组进行操作。 

 

 示例 1: 

 
输入: nums = [0,1,0,3,12]
输出: [1,3,12,0,0]
 

 示例 2: 

 
输入: nums = [0]
输出: [0] 

 

 提示: 
 

 
 1 <= nums.length <= 10⁴ 
 -2³¹ <= nums[i] <= 2³¹ - 1 
 

 

 进阶：你能尽量减少完成的操作次数吗？ 

 Related Topics 数组 双指针 👍 1971 👎 0

*/

package leetcode.editor.cn;

import java.util.Arrays;

class MoveZeroes{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{0,1,0,3,12};
        solution.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
    
static
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        //移动非零元素到前面
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        //后面的元素都为0
        while(index < nums.length){
            nums[index++] = 0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
