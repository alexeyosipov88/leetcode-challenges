tion for singly-linked list.
	 * function ListNode(val, next) {
		 *  *     this.val = (val===undefined ? 0 : val)
			 *   *     this.next = (next===undefined ? null : next)
			 *    * }
			 *     */
	/**
	 *  * @param {ListNode} l1
	 *   * @param {ListNode} l2
	 *    * @return {ListNode}
	 *     */
	var addTwoNumbers = function(l1, l2) {

		    let res = new ListNode(0);
		    let curr = res;
		    let first = l1;
		    let second = l2;
		    let carry = 0;
		    
		    
		    while(true) {
			            
			        
			            
			            if(!first && !second) {
					                if(carry !== 0) {
								                let newNode = ListNode(1);
								                curr.next = newNode;
								            }
					                break;
					            }
			            
			            
			            let firstVal = 0;
			            let secondVal = 0;
			            
			            if(first !== null) {
					                firstVal = first.val;
					                first = first.next;
					            }
			            if(second !== null) {
					                secondVal = second.val;
					                second = second.next;
					            }
			            
			            
			            let sum = firstVal + secondVal + carry;
			            carry  = Math.floor(sum / 10);
			            sum = sum % 10;
			            let newNode = new ListNode(sum);
			            curr.next = newNode;
			            curr = curr.next;
			            console.log(curr);
			        }
		    
		    
		    return res.next;
		    
	};




