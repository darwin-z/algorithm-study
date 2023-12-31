/**
给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。 

 

 示例 1： 
 
 
输入：head = [1,2,2,1]
输出：true
 

 示例 2： 
 
 
输入：head = [1,2]
输出：false
 

 

 提示： 

 
 链表中节点数目在范围[1, 10⁵] 内 
 0 <= Node.val <= 9 
 

 

 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 

 Related Topics 栈 递归 链表 双指针 👍 1682 👎 0

*/

package leetcode.editor.cn;

import java.util.List;

class PalindromeLinkedList{
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list = new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(1))));
        System.out.println(solution.isPalindrome(list));
    }
    
static
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //快慢指针找到中点，在反转剩下一半在做比较
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //如果fast不为空说明链表是奇数个
        if(fast != null){
            slow = slow.next;
        }
        //反转后半部分链表
        slow = reverse(slow);
        fast = head;


        while (slow != null){
            //然后比较，判断节点值是否相等
            if(fast.val != slow.val){
                return false;
            }
            else{
                fast = fast.next;
                slow = slow.next;
            }
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode result = null;
        while (head != null){
            ListNode nextHead = head.next;
            head.next = result;
            result = head;
            head = nextHead;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
